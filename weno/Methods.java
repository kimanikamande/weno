

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        findLargestAndSmallestNumbers(); // calling the method to find largest and smallest numbers
    }

    /**
     * This method asks the user to enter three numbers, determines the largest and smallest numbers using if statements,
     * and displays the results in the specified format.
     */
    public static void findLargestAndSmallestNumbers() {
        Scanner scanner = new Scanner(System.in); // creating a scanner object to read user input

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt(); // reading the first number

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt(); // reading the second number

        System.out.println("Enter the third number:");
        int num3 = scanner.nextInt(); // reading the third number

        int largest = num1; // assuming the first number is the largest
        int smallest = num1; // assuming the first number is the smallest

        // checking if num2 is larger than the current largest
        if (num2 > largest) {
            largest = num2; // updating the largest number
        }
        // checking if num3 is larger than the current largest
        if (num3 > largest) {
            largest = num3; // updating the largest number
        }

        // checking if num2 is smaller than the current smallest
        if (num2 < smallest) {
            smallest = num2; // updating the smallest number
        }
        // checking if num3 is smaller than the current smallest
        if (num3 < smallest) {
            smallest = num3; // updating the smallest number
        }

        // displaying the results
        System.out.println("The smallest number: " + smallest);
        System.out.println("The largest number: " + largest);
        System.out.println(largest + " is your largest and " + smallest + " is your smallest number.");
    }
}