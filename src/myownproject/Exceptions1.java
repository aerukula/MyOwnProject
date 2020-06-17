/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myownproject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author shekh
 */
public class Exceptions1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //Write File
             FileWriter fw = new FileWriter("c:\\data\\myfile.txt");
             //Create Buffer
             BufferedWriter bw = new BufferedWriter(fw);
             
             //Write content
             bw.write("This is first line \n");
             bw.write("This is second line ");
             //close file
             bw.close();
             fw.close();
        } catch(IOException e) {
            //Write error message
            System.out.println(e.getMessage());
        }
    }
    
}
