
class PalletUI {
    public void Click_shape(Shape x) {
        x.draw();
    }
}

abstract class Shape {
    public abstract void draw();
}

class Pentagon extends Shape {
    public void draw() {
        System.out.println("Pentagon");
    }
}


class Triangle extends Shape {
    public void draw() {
        System.out.println("Drawing triangle");
    }
}


class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}


public class Pallet {
    public static void main(String[] args) {
        PalletUI u = new PalletUI();

        u.Click_shape(new Circle());
        u.Click_shape(new Triangle());
        u.Click_shape(new Pentagon());
    }
}
