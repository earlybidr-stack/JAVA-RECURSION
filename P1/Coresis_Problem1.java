/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coresis_problem1;

/**
 *
 * @author CORESIS_CPE113
 */
public class Coresis_Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 86420;
        int total = sumDigi(number);
        System.out.println("The sum of " + number + " is " + total);
    }

    static int sumDigi(int numba) {
        if (numba == 0) {
            return 0;
        } else {
            return ((numba % 10) + sumDigi(numba / 10));
        }
    }
}
