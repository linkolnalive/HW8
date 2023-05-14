package org.example;

public class Main {
    public static void main(String[] args) {
        ShapePrinter.print(new Circle());
        ShapePrinter.print(new Rectangle());
        ShapePrinter.print(new Ellipse());
        ShapePrinter.print(new Rhombus());
        ShapePrinter.print(new Square());
    }
}

abstract class Shape {
    public abstract void printName();
}

class Circle extends Shape {
    @Override
    public void printName() {
        System.out.println("Circle");
    }
}

class Rectangle extends Shape {
    @Override
    public void printName() {
        System.out.println("Rectangle");
    }
}

class Ellipse extends Shape {
    @Override
    public void printName() {
        System.out.println("Ellipse");
    }
}

class Square extends Shape {
    @Override
    public void printName() {
        System.out.println("Square");
    }
}

class Rhombus extends Shape {
    @Override
    public void printName() {
        System.out.println("Rhombus");
    }
}

class ShapePrinter {
    public static void print(Shape shape) {
        shape.printName();
    }
}