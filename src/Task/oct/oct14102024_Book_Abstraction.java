package Task.oct;

public class oct14102024_Book_Abstraction {//    ✅ Problem Statement
//
//    Book class which has an abstract method getDetails(),name, author, price.
//
//    PrintMyBook class that inherits from the Book class.
//
//    abstract
//
//    Book myBook = new PrintMyBook("Harry Potter", "J.k. Rowling", "120");
//
// Output
//
//"Harry Potter, J.k. Rowling, 100"

    abstract class Book {

        // Attributes of the Book class
        String name;
        String author;
        int price;

        // Constructor to initialize the attributes
        public Book(String name, String author, int price) {
            this.name = name;       // Set the book's name
            this.author = author;   // Set the book's author
            this.price = price;     // Set the book's price
        }

        // Abstract method to be implemented by subclasses
        abstract String getDetails();

    }
}
