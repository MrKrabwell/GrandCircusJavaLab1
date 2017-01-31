package com.company;

import java.util.Scanner;

public class Main {

    /*
    This method will prompt the user to input the length of the room
     */
    public static double GetUserLength() {
        // Variable declarations
        double roomLength = 0;                 // Length of the room
        Scanner scan = new Scanner(System.in); // Scanner object for user input

        // Prompt user to enter Length
        System.out.print("Enter Length: ");
        roomLength = scan.nextDouble();

        // Return user input length
        return roomLength;
    }

    /*
    This method will prompt the user to input the width of the room
     */
    public static double GetUserWidth() {
        // Variable declarations
        double roomWidth = 0;                  // Width of the room
        Scanner scan = new Scanner(System.in); // Scanner object for user input/

        // Prompt user to enter Width
        System.out.print("Enter Width: ");
        roomWidth = scan.nextDouble();

        // Return user input width
        return roomWidth;
    }

    /*
    This method will prompt the user to input the height of the room
     */
    public static double GetUserHeight() {
        // Variable declarations
        double roomHeight = 0;                 // Height of the room
        Scanner scan = new Scanner(System.in); // Scanner object for user input/

        // Prompt user to enter height
        System.out.print("Enter height: ");
        roomHeight = scan.nextDouble();

        // Return user input width
        return roomHeight;
    }

    /*
    This method will return the area of the room based on length and width
     */
    public static double GetRoomArea(double roomLength, double roomWidth) {
        // Variable Declarations
        double roomArea = 0;   // Area of room

        // Calculate area of room
        roomArea = roomLength * roomWidth;

        // Return room area
        return roomArea;
    }

    /*
    This method will return the perimeter of the room based on length and width
     */
    public static double GetRoomPerimeter(double roomLength, double roomWidth) {
        // Variable declarations
        double roomPerimeter = 0;  // Perimeter of room

        // Calculate perimeter of room
        roomPerimeter = 2 * roomLength + 2 * roomWidth;

        // Return room perimeter
        return roomPerimeter;
    }

    /*
    This method will return the perimeter of the room based on length and width
    */
    public static double GetRoomVolume(double roomLength, double roomWidth, double roomHeight) {
        // Variable declarations
        double roomVolume = 0;  // Perimeter of room

        // Calculate perimeter of room
        roomVolume = roomLength * roomWidth * roomHeight;

        // Return room perimeter
        return roomVolume;
    }

    /*
    This method will ask whether the user wants to continue to program or not
     */
    public static boolean GetUserProgContinue() {
        // Variable declarations
        boolean progContinue = true;            // Boolean to determine whether user wants to continue
        boolean validChar = false;               // Boolean to determine whether user input was valid
        String userInput = "";                  // String to store user input.
        char progContinueChar = 'y';            // Character input of user
        Scanner scan = new Scanner(System.in);  // Scanner object for user input

        while (validChar == false) {
            // Prompt user if they want to continue
            System.out.print("Continue? (y/n): ");
            userInput = scan.next();                // read user input
            progContinueChar = userInput.charAt(0); // progContinueChar is first letter in userInput string

            // If user input is not a single character, then ask user again
            if (userInput.length() != 1) {
                System.out.println("That is not a valid input.  Please try again.");
                validChar = false;
            }
            // If user input is not y, Y, n, or N, then ask user again
            else if ((progContinueChar != 'y') && (progContinueChar != 'Y') &&
                    (progContinueChar != 'n') && (progContinueChar != 'N')) {
                System.out.println("That is not a valid input.  Please try again.");
                validChar = false;
            }
            else {
                validChar = true;
            }
        }

        // Depending on user input, set progContinue to true or false
        if (progContinueChar == 'y' || progContinueChar == 'Y') {
            progContinue = true;
        }
        else if (progContinueChar == 'n' || progContinueChar == 'N') {
            progContinue = false;
        }
        else {
            // Should never reach here
            progContinue = true;
        }

        // Return result of whether user wants to continue or not
        return progContinue;
    }

    /*
    This is the main program
     */
    public static void main(String[] args) {
        // Variable declarations
        double length = 0;                      // Variable to store length
        double width = 0;                       // Variable to store width
        double height = 0;                      // Variable to store height
        double area = 0;                        // Variable to store area
        double perimeter = 0;                   // Variable to store perimeter
        double volume = 0;                      // Variable to store volume
        boolean programContinue = true;         // Variable to keep program running


        // Welcome message
        System.out.println("Welcome to Grand Circus' Room Detail Generator!");

        // While loop to keep program running until user wants to quit
        while (programContinue == true) {

            // Get user inputs
            length = GetUserLength();
            width = GetUserWidth();
            height = GetUserHeight();

            // Calculate area based on user inputs and print result
            area = GetRoomArea(length, width);
            System.out.println("Area: " + area);

            // Calculate perimeter based on user inputs and print result
            perimeter = GetRoomPerimeter(length, width);
            System.out.println("Perimeter: " + perimeter);

            // Calculate volume based on user inputs and print results
            volume = GetRoomVolume(length, width, height);
            System.out.println("Volume: " + volume);

            // Ask user if they want to continue the program
            programContinue = GetUserProgContinue();
        }

        return;
    }
}
