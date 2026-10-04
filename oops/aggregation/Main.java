package oops.aggregation;

public class Main {
    public static void main(String[] args) {
        
        Book book1 = new Book("The Alchemist", 163 );
        Book book2 = new Book("The Metamorphosis", 100 );
        Book book3 = new Book("The Little Prince", 96 );

        Book[] books = {book1,book2,book3};
        
        Library library = new Library("Trinity College Library", 1592, books);

        library.showInfo();
        

    }
}
