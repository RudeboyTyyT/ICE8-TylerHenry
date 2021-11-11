/*
* Author: Tyler Henry
* Date: November 11, 2021
*/

package ca.durhamcollege;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        //Define our Scanner
        Scanner keyboard = new Scanner(System.in);

        //Input
        String name = "";
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();

        float age = 0.0f;

        boolean isValidInput = false; // sentinel variable
        while(!isValidInput)
        {
            System.out.print("Please enter your age: ");
            try
            {

                age = keyboard.nextFloat();
                isValidInput = true;

                if ((age <= 0.0f) || (age > 120.0))
                {
                    System.out.printf("Error: You must enter an age greater than 0 and less than 120 years old");
                    keyboard.nextLine();
                    isValidInput = false;
                }
            }
            catch(InputMismatchException inputMismatchException)
            {
                System.out.printf("Error: You must enter a valid floating-point number");
                keyboard.nextLine();
                isValidInput = false;

            }

        }


        System.out.println();
        //Output
        System.out.printf("You Entered: %s \n", name);
        System.out.printf("You Entered: %.2f \n", age);
    }
}
