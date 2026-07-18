abstract class DemoAB {
    abstract public void show();
    
    public void display() {
        System.out.println("display method");
    }
}

//---------------------------------

class AbsDemo extends DemoAB {
    @Override
    public void show() {
        System.out.println("i am SHOW FROM MEESHO");
    }

    public static void main(String... args) {
        AbsDemo dab = new AbsDemo();
        dab.display();
        
    }
}

