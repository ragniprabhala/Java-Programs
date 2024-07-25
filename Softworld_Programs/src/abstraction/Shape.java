package abstraction;

abstract class Shape {
    
    abstract double calculateArea();
    private void walk()
    {
    	System.out.println("walking");
    }
}


class Circle extends Shape {
    private double radius;

    public void walk()
    {
    	System.out.println("walking");
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }

    
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}


class Rectangle extends Shape {
    private double length;
    private double width;

    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    double calculateArea() {
        return length * width;
    }
}
