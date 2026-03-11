package ch02_pjt_01;

public class MyCalculator {

    public void calculate(int fNum, int sNum, ICalculator calculator) {
        int value = calculator.doOperation(fNum, sNum);
        System.out.println("result: " + value);
    }

//    public void CalAdd(int fNum, int sNum, CalAdd calAdd) {
//        int value = calAdd.doOperation(fNum, sNum);
//        System.out.println("result: " + value);
//    }
//
//    public void CalSub(int fNum, int sNum, CalSub CalSub) {
//        int value = CalSub.doOperation(fNum, sNum);
//        System.out.println("result: " + value);
//    }
//
//    public void CalMul(int fNum, int sNum, CalMul CalMul) {
//        int value = CalMul.doOperation(fNum, sNum);
//        System.out.println("result: " + value);
//    }
//
//    public void CalDiv(int fNum, int sNum, CalDiv CalDiv) {
//        int value = CalDiv.doOperation(fNum, sNum);
//        System.out.println("result: " + value);
//    }
}
