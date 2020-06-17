/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myownproject;

import java.util.Scanner;

/**
 *
 * @author shekh
 */
public class Function1 {

    /**
     */
    static String findgrade(int s1, int s2, int s3) {
        int sum = s1 + s2 + s3;
        int avg = sum / 3;
        if (avg < 60) {
            return "F";
        } else {
            return "A";
        }
    }

    public static void main(String[] args) {
        int math, sci, comp;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter math numbers ");
        math = sc.nextInt();
        //System.exit(0);to exit from the program,if 0 no error,if 1 error
        System.out.println("enter sci numbers");
        sci = sc.nextInt();
        System.out.println("enter comp numbers");
        comp = sc.nextInt();
        // int math=60,sci=90,comp=60;
        System.out.println("final grade " + findgrade(math, sci, comp));
    }

}
