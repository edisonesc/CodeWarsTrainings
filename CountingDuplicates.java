/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars.training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author edies
 */


/**
 Write a function that will return the count of distinct 
 * case-insensitive alphabetic characters and numeric digits 
 * that occur more than once in the input string. The input string
 * can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
 */

/**
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice 
 
 */

public class CountingDuplicates {
    
    
    
    
     
 
 
    public static void duplicates(String text){
        char[] charArray = text.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(Character ch : charArray){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else {
                map.put(ch, 1);
            }
            
        }
        Set<Character> keys = map.keySet();
        for(Character ch : keys){
            if(map.get(ch) > 1){
                System.out.println(ch + " is " + map.get(ch) + "times");
            }
            
        }
    
        
     
    }
    public static void main(String[] args) {
        duplicates("infinity");
        
     
    }

    
}
