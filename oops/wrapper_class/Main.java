package oops.wrapper_class;

public class Main {
    public static void main(String[] args) {

        // utilities methods

        // Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;
    
        //Unboxing

        int num1 = a;
        double num2 = b;
        char num3 = c;
        boolean num4 = d;

        // num to string and use string opration

        String s1 = Integer.toString(123);
        String s2 = Double.toString(3.14);
        String s3 = Character.toString('$');
        String s4 = Boolean.toString(false);

        String sum = s1 + s2 + s3 + s4;
        System.out.println(sum);

        // string to num

        int temp1 = Integer.parseInt("123");
        double temp2 = Double.parseDouble("2.145");
        char temp3 = "Pizza".charAt(0) ;
        boolean temp4 = Boolean.parseBoolean("true");

        // other utili method

        char letter = '2';

        System.out.println(Character.isAlphabetic(letter));
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));
        System.out.println(Character.isLowerCase(letter));
        System.out.println(Character.isDigit(letter));
        System.out.println(Character.isSpaceChar(letter));

    
    }
}
