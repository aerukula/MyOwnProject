/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myownproject;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author shekh
 */
public class Hashmap1 {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Kevin", "kevin@gmail.com");
        map.put("Tom", "tom@gmail.com");
        map.put("Mike", "mike@gmail.com");
        map.put("Mike", "mjc.com");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }

    }

}
