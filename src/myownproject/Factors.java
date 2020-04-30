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
public class Factors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int no = 20;
        for (int i = 1; i <= no; i++) {
            if (no % i == 0) {
                System.out.print(i + " ");
            }

        }
    }

}
