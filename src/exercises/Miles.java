package exercises;
import java.util.Scanner;
public class Miles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of miles you have driven: ");
        Double numMiles = input.nextDouble();

        System.out.println("Please enter how much gas you have used: ");
        Double numGas = input.nextDouble();

        Double mpg = numMiles / numGas;
        System.out.println("You are running on " + mpg + " mpg.");
    }
}
