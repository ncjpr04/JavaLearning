
public class ReverseString {
// private static final String String = null;

    public static String reverseString(String str) {
        if (str.length() <= 1 || str == null) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);

    }

    public static void main(String[] args) {
        // The original string to be reversed
        String original = "Hello, World!";

        // Call the reverseString function
        String reversed = reverseString(original);

        // Print the original and reversed strings
        System.out.println("Original: " + original); // Displays: Hello, World!
        System.out.println("Reversed: " + reversed); // Displays: !dlroW ,olleH
    }

}
