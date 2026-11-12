/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coresis_problem2;

import java.util.Scanner;

/**
 *
 * @author CORESIS_CPE113
 */
public class Coresis_Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

        // using Delimiter this ignores parentheses, commas, and spaces to invalidate too ('-')
        input.useDelimiter("[^0-9-]+");

        // Reads two numbers 
        int a = input.nextInt();
        int b = input.nextInt();

        int result = gcd(a, b);

        // Validates result
        if (a < 0 || b < 0) {
            System.out.print("Invalid Input.");

        } else if (a == 0 && b == 0) {
            System.out.println("Undefined - handle in main()");

        } else {
            System.out.println(result);
        }
        
        input.close();
    }

    // Euclidean algorithm function
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}