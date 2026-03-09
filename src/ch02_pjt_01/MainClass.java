package ch02_pjt_01;

public class MainClass {
    public static void main(String[] args) {

        MyCalculator calculator = new MyCalculator();
        calculator.CalAdd(10, 5, new CalAdd());
        calculator.CalSub(10, 5, new CalSub());
        calculator.CalMul(10, 5, new CalMul());
        calculator.CalDiv(10, 5, new CalDiv());
    }
}
