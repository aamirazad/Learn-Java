/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.erorrdemo;
import java.util.Scanner;


/**
 *
 * @author aamir
 */
public class ErorrDemo {

    public static void main(String[] args) {
        int num, deno;
        Scanner input = new Scanner(System.in);
        
        try
        {
            System.out.print("Please enter the numerator: ");
            num = input.nextInt();
            System.out.print("Please enter the denominator: ");
            deno = input.nextInt();
            System.out.println("The result is " + num/deno);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("--- End of Error Handling Example ---");
        }
    }
}
