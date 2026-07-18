class Vehicle {
    public void getArea() {
        System.out.println("Area of Vehicle");
    }
}

class Rectangle extends Vehicle {
    int length = 10;
    int width = 5;

    @Override
    public void getArea() {
        System.out.println("Area of Rectangle = " + (length * width));
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getArea();
    }
}