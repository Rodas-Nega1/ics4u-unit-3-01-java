/*
* This recursion process reverses a string.
*
* @author  Rodas Nega
* @version 1.0
* @since   2022-11-09
*/

/**
* This program reverses a string.
*/
final class Main {

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Reverses a string.
    *
    * @param userString userString
    * @return return reversedString
    */
    public static String reversedString(final String userString) {

        final String finalString;

        if (userString.length() == 0) {
            finalString = userString;
        } else {
            finalString = reversedString(userString.substring(1))
                    + (userString.charAt(0));
        }
        return finalString;

    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final String userString = "recursion";

        final String reversedOutput = reversedString(userString);

        System.out.println("The original string was: " + userString);
        System.out.println("The reversed string is: " + reversedOutput);

        System.out.println("\nDone.");
    }
}
