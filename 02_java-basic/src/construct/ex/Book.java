package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    // 기본 생성자 - 밑에 다른 생성자를 만들었기 때문에 자바가 자동으로 만들어주지 않음 -> 직접 만들어줘야함
    public Book() {
        this(" ", " ", 0);
//        this.title = "";
//        this.author = "";
    }

    public Book(String title, String author) {
        this(title, author, 0);
//        this.title = "";
//        this.author = "";
//        this.page = 0;
    }

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo() {
        System.out.println("제목:" + title + ", 저자:" + author + ", 페이지:" + page);
    }
}

