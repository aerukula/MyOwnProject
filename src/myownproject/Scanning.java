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
public class Scanning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String username;
        Scanner my = new Scanner(System.in);
        System.out.println("enter user name");
        username = my.nextLine();
        System.out.println("enter number");
        int i = my.nextInt();
        System.out.println(username + " " + i);
    }
}
