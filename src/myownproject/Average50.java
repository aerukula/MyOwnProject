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
public class Average50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sum = 0;
        int n = 50;
        double avg;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;

        }
        avg = sum / n;
        System.out.println(sum);
        System.out.println("The average of first 50 numbers: " + avg);

    }

}
