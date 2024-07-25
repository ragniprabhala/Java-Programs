package com.hcl.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Movie class definition
public class Movie {
    private int id;
    private String title;
    private int year;

    public Movie(int id, String title, int year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }
}

// ActorDirector class definition
public class ActorDirector {
    private int movieId;
    private String name;
    private String role;

    public ActorDirector(int movieId, String name, String role) {
        this.movieId = movieId;
        this.name = name;
        this.role = role;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}

// IdMapping class definition
public class IdMapping {
    private String externalId;
    private int internalId;

    public IdMapping(String externalId, int internalId) {
        this.externalId = externalId;
        this.internalId = internalId;
    }

    public String getExternalId() {
        return externalId;
    }

    public int getInternalId() {
        return internalId;
    }
}

// MatcherImpl class implementation
public class MatcherImpl implements Matcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(MatcherImpl.class);

    private Map<Integer, Movie> moviesMap;
    private List<ActorDirector> actorsAndDirectorsList;

    public MatcherImpl(CsvStream movieDb, CsvStream actorAndDirectorDb) {
        LOGGER.info("importing database");
        this.moviesMap = loadMovies(movieDb);
        this.actorsAndDirectorsList = loadActorsAndDirectors(actorAndDirectorDb);
        LOGGER.info("database imported");
    }

    private Map<Integer, Movie> loadMovies(CsvStream movieDb) {
        Map<Integer, Movie> movies = new HashMap<>();
        movieDb.forEach(row -> {
            int id = Integer.parseInt(row.get(0));
            String title = row.get(1);
            int year = Integer.parseInt(row.get(2));
            movies.put(id, new Movie(id, title, year));
        });
        return movies;
    }

    private List<ActorDirector> loadActorsAndDirectors(CsvStream actorAndDirectorDb) {
        List<ActorDirector> actorsAndDirectors = new ArrayList<>();
        actorAndDirectorDb.forEach(row -> {
            int movieId = Integer.parseInt(row.get(0));
            String name = row.get(1);
            String role = row.get(2);
            actorsAndDirectors.add(new ActorDirector(movieId, name, role));
        });
        return actorsAndDirectors;
    }

    @Override
    public List<IdMapping> match(DatabaseType databaseType, CsvStream externalDb) {
        List<IdMapping> mappings = new ArrayList<>();
        externalDb.forEach(row -> {
            String externalId = row.get(0);
            String title = row.get(1);
            String releaseDate = row.get(2);
            String year = releaseDate.split("/")[2];

            for (Movie movie : moviesMap.values()) {
                if (matchMovie(movie, title, year)) {
                    mappings.add(new IdMapping(externalId, movie.getId()));
                    break;
                }
            }
        });
        return mappings;
    }

    private boolean matchMovie(Movie movie, String title, String year) {
        return movie.getTitle().equalsIgnoreCase(title) &&
               Integer.toString(movie.getYear()).equals(year);
    }
}