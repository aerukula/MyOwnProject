/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myownproject;

/**
 *
 * @author shekh
 */
public class Loop1 {

    
    public static void main(String[] args) {
        int i = 10, j = 40, k = 4;

        while (i <= 40) {
            System.out.print(" " + i);
            i = i + 10;
        }
        System.out.println(" ");
        while (j <= 70) {
            System.out.print(" " + j);
            j = j + 10;
        }
        System.out.println(" ");

        while (k >= 1) {
            System.out.print(" " + k * k);
            k = k - 1;
        }

    }

}
