/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars.training;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author edies
 */
public class Isogram {
    public static boolean iso(String text) {
         boolean state;
         char[] charArray = text.toCharArray();
         Map<Character, Integer> map = new HashMap<Character, Integer>();
         for(Character ch : charArray){
             if(map.containsKey(ch)){
                 map.put(ch, map.get(ch) + 1);
             
             }
             else{
                 map.put(ch, 1);
             }
           
         }
         Set<Character> keys = map.keySet();
         for(Character ch : keys){
             if(map.get(ch) > 1){
             
                 return false;
                 
             }
             
         }
         
         return true;
         
       
    }
    public static void main(String[] args) {
        System.out.println(iso("Dermatoglyphics"));
        System.out.println(iso("moose"));
        System.out.println(iso("aba"));
    }
    
}
