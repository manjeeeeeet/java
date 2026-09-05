public class StringPractice {
    public static void main(String[] args) {

        String quote = "  coffee, code & Java  ";

        // length and character
        System.out.println("Length: " + quote.length());
        System.out.println("Character at index 4: " + quote.charAt(4));

        // remove extra spaces
        String cleanQuote = quote.trim();

        System.out.println("Trimmed: " + cleanQuote);
        System.out.println("Uppercase: " + cleanQuote.toUpperCase());
        System.out.println("Lowercase: " + cleanQuote.toLowerCase());

        // substring and replace
        System.out.println("Substring: " + cleanQuote.substring(0, 6));
        System.out.println("Replaced: " + cleanQuote.replace("Java", "sleep"));

        // checking the string
        System.out.println("Contains Java: " + cleanQuote.contains("Java"));
        System.out.println("Starts with coffee: " + cleanQuote.startsWith("coffee"));

        // comparing strings
        String firstString = new String("Java");
        String secondString = new String("Java");

        System.out.println("Using == : " + (firstString == secondString));
        System.out.println("Using equals(): " + firstString.equals(secondString));
    }
}
