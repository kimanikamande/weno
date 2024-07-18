

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        computeAverageMarks(); // calling the method to compute average marks
    }



    public static void computeAverageMarks() {
        Scanner scanner = new Scanner(System.in); // creating a scanner object to read user input

        System.out.println("Enter marks for Java Programming:");
        int javaMarks = scanner.nextInt(); // reading marks for Java Programming

        System.out.println("Enter marks for Networking:");
        int networkingMarks = scanner.nextInt(); // reading marks for Networking

        System.out.println("Enter marks for Maths:");
        int mathsMarks = scanner.nextInt(); // reading marks for Maths

        // computing the average marks
        double average = (javaMarks + networkingMarks + mathsMarks) / 3.0;

        // displaying the results
        System.out.println("Marks for Java Programming is: " + javaMarks);
        System.out.println("Marks for Networking is: " + networkingMarks);
        System.out.println("Marks for Maths is: " + mathsMarks);
        System.out.println("The average is: " + average);
    }
}