package oops.aggregation;

public class Library {
    String name;
    int year;
    Book[] books;

    Library(String name,int year,Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void showInfo(){
        System.out.printf("The %d %s \n",year,name);
        System.out.println("Book Availables:");
        for(Book book : books){
            book.showInfo();
        }
    }
}
