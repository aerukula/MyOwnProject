/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myownproject;

import java.util.ArrayList;

/**
 *
 * @author shekh
 */
public class Arraylist1 {

    
    public static void main(String[] args) {
       ArrayList<String> names= new ArrayList<String>();
       names.add("Tushar");
       names.add("Pradeep");
       names.add("Narendra");
        System.out.println(names);
        for(String name:names){
            System.out.println(name);
        }
        names.remove(1);
        System.out.println(names);
        names.contains("Narendra");
        names.add("Haresh");
        System.out.println(names);
        
    }
    
}
