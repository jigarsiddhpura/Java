// Runtime polymorphism or dynamic method dispatch

class A{
    void m1(){
        System.out.println("Inside A's m1 method");
    }
}

class B extends A{
    // overriding m1()
    void m1(){
        System.out.println("Inside B's m1 method");
    }
}

class C extends A{
    // overriding m1()
    void m1(){
        System.out.println("Inside C's m1 method");
    }
}

class Dispatch{
    public static void main(String args[]){
        // object of type A
        A a = new A();
        // object of type B
        B b = new B();
        // object of type C
        C c = new C();

        // obtain a refrence of type A
        A ref;

        // ref refers to an A object
        ref = a;
        // calling A's version of m1()
        ref.m1();
        
        // now ref refers to an B object
        ref = b;
        // calling B's version of m1()
        ref.m1();

        // now ref refers to an C object
        ref = c;
        // calling C's version of m1()
        ref.m1();

    }


}

// test binding is done during compile time while dynamic binding is done during runtime
// At runtime depending on the type of object being refrenced to
// It determines which version of overriden method will be executed