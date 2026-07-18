abstract class Shape {
    abstract void calculateArea();
    abstract void calculatePerimeter();
}

class Circle extends Shape {
    void calculateArea() {
        System.out.println("Circle Area = " + (3.14 * 5 * 5));
    }

    void calculatePerimeter() {
        System.out.println("Circle Perimeter = " + (2 * 3.14 * 5));
    }
}

class Triangle extends Shape {
    void calculateArea() {
System.out.println("Triangle Area = " + (0.5 * 4 * 5));
    }

    void calculatePerimeter() {
        System.out.println("Triangle Perimeter = " + (3 + 4 + 5));
    }
}

class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Triangle t = new Triangle();

        c.calculateArea();
        c.calculatePerimeter();

        t.calculateArea();
        t.calculatePerimeter();
    }
}
