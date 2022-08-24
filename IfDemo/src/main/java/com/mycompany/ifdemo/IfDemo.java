package com.mycompany.ifdemo;
import java.util.Scanner;

public class IfDemo{
    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease enter your age: ");
        int userAge = input.nextInt();
        if (userAge < 0 || userAge > 100)
        {
            System.out.println("Invalid Age"); //Try to do \n
            System.out.println("Age must be between 0 and 100");
        }
        else if (userAge < 18)
            System.out.println("Sorry your underage");
        else if (userAge < 21)
            System.out.println("You need parental consent");
        else
        {
            System.out.println("Congratulations!");
            System.out.println("You may sign up for the event!");
        }
    }
}
