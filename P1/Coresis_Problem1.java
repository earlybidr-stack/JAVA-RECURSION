/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coresis_problem1;

import java.util.Scanner;

/**
 *
 * @author CORESIS_CPE113
 */
public class Coresis_Problem1 {
    public static int sumDigi(int numba) {
        
        if (numba == 0) {
            return 0;
    }
        return ((numba % 10) + sumDigi(numba / 10));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numba = input.nextInt();
        
        if (numba < 0) {
            System.out.println("Invalid Input, please try again");
        } else {
               System.out.println(sumDigi(numba));
        }
    }
    }

    