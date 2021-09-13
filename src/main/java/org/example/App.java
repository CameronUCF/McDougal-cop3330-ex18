/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cameron McDougal
 */

package org.example;
import java.util.Scanner;

 // TODO: Use as few output statements as possible and avoid repeating output strings.
public class App
{
    public static void main( String[] args )
    {
        char choice;
        double degrees;
        double conversion;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        choice = Character.toUpperCase(scanner.next().charAt(0));

        if(choice == 'C' || choice == 'F')
        {
            System.out.printf("Your choice: %c\n", Character.toUpperCase(choice));

            if(choice == 'C')
            {
                System.out.println("Please enter the temperature in Fahrenheit:");
                degrees = scanner.nextDouble();
                conversion = (degrees - 32) * (5 / 9);
                System.out.printf("The temperature in Fahrenheit is %.2f", conversion);
            }
            else if(choice == 'F')
            {
                System.out.println("Please enter the temperature in Celsius:");
                degrees = scanner.nextDouble();
                conversion = (degrees * (9 / 5)) + 32;
                System.out.printf("The temperature in Celsius is %.2f.", conversion);
            }

            scanner.close();
        }
    }
}