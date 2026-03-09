class Person{}
public class 나의저장공간 {
    //나의 저장공간 데이터를 저장하기 위한 메소드
    public void push(Object o) { //Object o = new String ("딸기")

    }

    //나의저장공간에서 데이터를 가져오기 위한 메소드
    public Object pop() {
        return new Person();
    }

    public static void main(String[] args) {
        나의저장공간 a = new 나의저장공간();
//        String str = a.pop();
//        System.out.println(str);
        a.push("딸딸기");
    }
}
