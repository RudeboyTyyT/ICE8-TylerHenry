/*
* Author: Tyler Henry
* Date: November 11, 2021
*/

package ca.durhamcollege;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        String name = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();
        System.out.printf("You Entered: %s", name);
    }
}
