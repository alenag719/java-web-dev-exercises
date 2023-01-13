package exercises;

import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input1= new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle: ");
        double length = input1.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter the width of the rectangle: ");
        double width = input2.nextDouble();

        double area = length * width;
        System.out.println("The area of a rectangle is " + area);
    }
}
