package exercises;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was " +
                "reading, but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";

        String aliceQuote = firstSentence.toLowerCase();
        System.out.println("Please enter a term to search for: ");
        String userInput = input.nextLine();
        String searchTerm = userInput.toLowerCase();

        boolean term = aliceQuote.contains(searchTerm);
        System.out.println(term);

        Integer index = aliceQuote.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = aliceQuote.replace(searchTerm, "");
        System.out.println(modifiedSentence);

    }
}
