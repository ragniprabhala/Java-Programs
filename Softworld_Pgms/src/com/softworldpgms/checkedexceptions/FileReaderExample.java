package com.softworldpgms.checkedexceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            FileReader reader = new FileReader(file);
            // Perform file reading operations
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}