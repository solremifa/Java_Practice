package OOP;//학생이 도서관에서 책을 빌리는 기능을 구현한다
//관련 클래스와 메소드를 정의 후에 사용

class Student {
    public void borrow(String book) {
    }

}


class Library {
    Book[] books = new Book[10];
    private Library() {
        books[0] = new Book("리바이어던", "마이클 홉스", 1818);
        books[1] = new Book("자바의 정석", "남궁성", 2019);
        books[2] = new Book("용의자 X의 헌신", "히가시노 게이고", 2013);
        books[3] = new Book("돈 키호테", "세르반테스", 1780);
        books[4] = new Book("사회계약론", "장 자크 루소", 1555);
    }

    public static Library getLibrary() {
        return new Library();
    }

    public Book lend(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].name.equals(title)) {
                return books[i];
            }
        }
        return null;
    }


}

class Book {
    String name;
    String author;
    int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }
}

public class BorrowingBook {
    public static void main(String[] args) {
        Library lib = Library.getLibrary();
        Student student = new Student();
        student.borrow("리바이어던");
    }
}
