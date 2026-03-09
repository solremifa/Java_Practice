
class Camera {
    public static Camera open() {
        return new Camera();
    }
    public void FlashOn() {

    }
    public void FlashOff() {

    }
}
public class SingltonEx {
    public static void main(String[] args) {
        Camera c1 = Camera.open();
        c1.FlashOn();

        Camera c2 = new Camera();
        c2.FlashOff();

    }
}
