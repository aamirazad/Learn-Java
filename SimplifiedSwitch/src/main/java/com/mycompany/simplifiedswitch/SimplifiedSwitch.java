package com.mycompany.simplifiedswitch;
import java.util.Scanner;
public class SimplifiedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your grade? ");
        String userGrade = input.nextLine();
        switch (userGrade.toUpperCase())
                {
                    case "A+", "A" -> {
                    System.out.println("Distinction");
                    System.out.println("Well Done!");
                    
                    
                }
                    case "B" -> System.out.println("B Grade");
                    case "C" -> System.out.println("C Grade");
                    case "D" -> System.out.println("D grade");
                    default -> System.out.println("Fail");
                }
    }
}
