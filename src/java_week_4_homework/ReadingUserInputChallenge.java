package java_week_4_homework;

import java.util.Scanner;

/**
 * Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge.
 */

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // creating scanner class to get input from customer

        int count = 1; // assgning the value to variable count
        int sum = 0;

        while (count <= 10) { // using <=10 coz we need reed number upto 10
            System.out.println("Enter number #" + count); // print statement to get input form the user 'count' is added to include the current number value

            boolean validateNumber = scanner.hasNextInt(); // used boollean to check if the user input is integer or not. 'validateNumber' is varaible name and boolean is a data type
            if (validateNumber) {
                int number = scanner.nextInt();
                sum += number;
                count++; // count++ is used to increment the count value up to 10.
            } else {
                System.out.println("Invalid number"); // if the entered inout is not interger then the code execute message (Invalid number)
            }
            // Always return new userInput
            scanner.nextLine();
        }
        System.out.println("Sum of all numbers = " + sum); // prints the statement stored in sum

        scanner.close();
    }

}
