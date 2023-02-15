import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner.(System.in);

        //Receive user input
        System.out.print("Enter a number to get the sum of its digits: ");
        int number = scan.nextInt();

        //Call sumDigits() to sum the digits of the user inputted number:
        System.out.println(sumDigits(number));
    }

    public static int sumDigits(int number) {
        int runningTotal = 0;
        
        //Check if number is negative and return -1 as an error if true:
        if (number < 1) {
            return -1;
        }
        
        //If number is single digit, simply print out the number:
        else if (number < 10) {
            System.out.println(number);
        }
        
        //If number is multiple digits, run through while loop until number is 0:
        else if (number >= 10) {
            runningTotal = 0;
            while (number > 0) {
                runningTotal += number % 10;
                number /= 10;
            }
        }
        return runningTotal;
    }
}
