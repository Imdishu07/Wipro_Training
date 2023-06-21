// Create a class Author with the following information.
// Member variables : name (String), email (String), and gender (char)
// Parameterized Constructor: To initialize the variables


// Create a class Book with the following information.
// Member variables : name (String), author (of the class Author you have just created), price (double), and qtyInStock (int)
// [Assumption: Each book will be written by exactly one Author]
// Parameterized Constructor: To initialize the variables
// Getters and Setters for all the member variables

// In the main method, create a book object and print all details of the book (including the author details)

class Author {
    public String name;
    public String email;
    public char gender;

    Author(String name, String email, char g) {
        this.name = name;
        this.email = email;
        gender = g;
    }
    String getName() {
        return name;
    }
    String getEmail() {
        return email;
    }
    char getGender() {
        return gender;
    }
}

class Book {
    public String name;
    public Author author;
    public double price;
    public int qtyInStock;

    Book(String name, Author author, double p, int q) {
        this.name = name;
        this.author = author;
        price = p;
        qtyInStock = q;
    }

    String getName() {
        return name;
    }

    Author getAuthor() {
        return author;
    }

    double getPrice() {
        return price;
    }

    int getQtyInStock() {
        return qtyInStock;
    }
    void setPrice(double p) {
        this.price = p;
    }

    void setQtyInStock(int q) {
        this.qtyInStock = q;
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        Author author = new Author("Dishant", "dishant@gmail.com", 'M');
        Book my_book = new Book("Computer Programming", author, 99999, 1);
        
        System.out.println("Name of the book is: " + my_book.getName());
        System.out.println("Author of the book is: " + my_book.getAuthor().getName() + ", " +"Email: " + my_book.getAuthor().getEmail() + ", "+"Gender: " + my_book.getAuthor().getGender());
    }
}


