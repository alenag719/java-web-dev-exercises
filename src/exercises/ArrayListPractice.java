package exercises;

//import org.jetbrains.annotations.Contract;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListPractice {
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();
    }
}
