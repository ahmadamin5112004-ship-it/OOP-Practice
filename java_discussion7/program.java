package java_discussion7;

class Book {

    private String title;
    private String author;

    
    public Book(String title) {
        this.title = title;
        this.author = "Unknown"; 
    }


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class program {
     public static void main(String[] args) {

        Book book1 = new Book("Harry Potter");
        Book book2 = new Book("The Alchemist", "Paulo Coelho");

        book1.displayInfo();
        System.out.println("-----------------");
        book2.displayInfo();
    }
}
