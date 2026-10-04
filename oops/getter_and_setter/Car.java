package oops.getter_and_setter;

public class Car {
    private final String model;
    private   String color;
    private int price;


    Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getmodel(){
        return this.model;
    }

    String getcolor(){
        return this.color;
    }

    int getprice(){
        return this.price;
    }

    void setColor(String color){
        this.color = color;
    }

    void setPrice(int price){
        if (price < 0) {
            System.out.println("price must be grater then zero");
        } else {
            this.price = price;
        }
    }


}
