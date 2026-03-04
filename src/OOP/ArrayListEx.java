import java.util.ArrayList;

class Animal {

}

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("ABC");
        a.add(new Person());
        a.add(new Animal());

        String r1 = (String) a.get(0);
        Person p1 = (Person) a.get(1);
        Animal a1 = (Animal) a.get(2);

        ArrayList Shapes = new ArrayList();
        Shapes.add(new Rectangle());
        Shapes.add(new Circle());
        Shapes.add(new Triangle());

//        Rectangle x0 = (Rectangle) Shapes.get(0);
//        Triangle x1 = (Triangle) Shapes.get(1);
//        Circle x2 = (Circle) Shapes.get(2);

        for (int i = 0; i<Shapes.size(); i++) {
            Shape s = (Shape) Shapes.get(i);
            s.draw();
        }
        for (Object x : Shapes) {
            System.out.println(x.toString());
        }


    }
}
