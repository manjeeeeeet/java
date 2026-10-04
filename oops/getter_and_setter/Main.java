package oops.getter_and_setter;

public class Main {
   public static void main(String[] args) {
     Car car = new Car( "I20", "black", 8000);

     car.setPrice(5000);
     car.setColor("Red");

    System.out.println(car.getmodel() + " "+ car.getcolor() +" $"+ car.getprice());

   }
}
