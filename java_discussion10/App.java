package java_discussion10;

class Books {
    int bookId;
    String bookName;
    String bookAuthor;
    String yearOfPub;
    float price;
    String status;

    // Constructor
    Books(int bookId, String bookName, String bookAuthor,
          String yearOfPub, float price, String status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearOfPub = yearOfPub;
        this.price = price;
        this.status = status;
    }

    void addNewBooks() {
        System.out.println(bookName + " added to library.");
    }

    void deleteBooks() {
        System.out.println(bookName + " deleted from library.");
    }

    void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Year: " + yearOfPub);
        System.out.println("Price: " + price);
        System.out.println("Status: " + status);
    }

    void inquiryBook() {
        System.out.println("Book inquiry for: " + bookName);
    }
}

class Librarian {
    int id;
    String name;

    Librarian(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void searchBook(String name) {
        System.out.println("Searching for book: " + name);
    }

    boolean verifyMember(int id) {
        System.out.println("Verifying member ID: " + id);
        return true;
    }

    void orderBooks() {
        System.out.println("Books ordered.");
    }

    void sellBooks() {
        System.out.println("Book sold.");
    }
}

class Publisher {
    int id;
    String name;
    String address;
    int phoneNo;

    Publisher(int id, String name, String address, int phoneNo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    void addPub() {
        System.out.println("Publisher added.");
    }

    void modifyPub() {
        System.out.println("Publisher modified.");
    }

    void deletePub() {
        System.out.println("Publisher deleted.");
    }

    void orderStatus() {
        System.out.println("Checking order status.");
    }
}

class User {
    int userID;
    String userName;
    String userAddress;
    int phoneNo;

    User(int userID, String userName, String userAddress, int phoneNo) {
        this.userID = userID;
        this.userName = userName;
        this.userAddress = userAddress;
        this.phoneNo = phoneNo;
    }

    void returnBooks() {
        System.out.println(userName + " returned a book.");
    }

    int payFine(String dt) {
        System.out.println("Fine paid on: " + dt);
        return 100;
    }

    void addNewUser() {
        System.out.println("New user added.");
    }

    void deleteUser() {
        System.out.println("User deleted.");
    }

    void updateDetails() {
        System.out.println("User details updated.");
    }

    void bookPurchase() {
        System.out.println(userName + " purchased a book.");
    }
}
public class App {
    public static void main(String[] args) {

        Books b1 = new Books(101, "Java Basics", "James Gosling",
                "2023", 450.0f, "Available");

        Librarian lib = new Librarian(1, "Mr. Rahman");

        Publisher pub = new Publisher(10, "ABC Publisher",
                "Dhaka", 123456);

        User user = new User(501, "Karim",
                "Dhaka", 987654);

        // Book methods
        b1.addNewBooks();
        b1.displayBookDetails();

        // Librarian methods
        lib.searchBook("Java Basics");
        lib.verifyMember(501);

        // Publisher methods
        pub.addPub();
        pub.orderStatus();

        // User methods
        user.addNewUser();
        user.bookPurchase();
        user.returnBooks();
        user.payFine("03-06-2026");
    }
}
