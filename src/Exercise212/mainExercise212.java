package Exercise212;

import java.util.Scanner;

public class mainExercise212 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        int originalNumber = number;

        int digit1 = number / 100;
        number = number % 100;

        int digit2 = number / 10;
        int digit3 = number % 10;

        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);

        int product = digit1 * digit2 * digit3;

        System.out.println("The product of all digits in "
                + originalNumber + " is " + product);

        input.close();
    }
}