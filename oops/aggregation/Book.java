package oops.aggregation;

public class Book {

    String name;
    int pages;

    Book(String name, int pages){
        this.name = name;
        this.pages = pages;
    }

    void showInfo(){
        System.out.printf("%s (%d pages)",name , pages);
        System.out.println();
    }
    
}
