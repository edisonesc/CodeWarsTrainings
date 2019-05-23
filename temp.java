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
public class temp {
    
    
    
    public static void dups(String text){
    char[] charArray = text.toCharArray();
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    for(Character ch : charArray){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
               
            }
            else{map.put(ch, 1);};
        }
    
    Set<Character> keys = map.keySet();
    for(Character ch : keys){
        if(map.get(ch) > 1){
        System.out.println(ch + " is repeated " + map.get(ch) + " times heheeh");
        }
    
    }
    }
    
    
    public static void main(String[] args) {
        dups("aaabbbccde");
               
        
    }
    
}
