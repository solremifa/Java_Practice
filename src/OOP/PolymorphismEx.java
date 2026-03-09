class A {
    public void printA() {
        System.out.println("A");
    }
}

class B extends A {
    public void printB() {
        System.out.println("B");
    }
}

public class PolymorphismEx {
    public static void main(String[] args) {
        A a = new A();
        A aa = new B();
        a.printA();

        B b = new B();
        b.printB();
        b.printA();
    }
}
