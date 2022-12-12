class Superclass {
    void display() {
        System.out.println("This is a superclass method");
    }
}

class Subclass {
    void display() {
        System.out.println("This is a subclass method");
    }
}

class MethodOverrideDemo {
    public static void main(String args[]) {
        Superclass objsuper = new Superclass();
        Subclass objsub = new Subclass();
        objsuper.display();
        objsub.display();

    }

}
