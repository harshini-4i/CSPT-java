abstract class Animal {
    abstract void sound();
}

class Lion extends Animal {
    void sound() {
        System.out.println("Lion roars");
    }
}

class Tiger extends Animal {
    void sound() {
        System.out.println("Tiger growls");
    }
}

class Main {
    public static void main(String[] args) {
        Lion l = new Lion();
        Tiger t = new Tiger();

        l.sound();
        t.sound();
    }
}
