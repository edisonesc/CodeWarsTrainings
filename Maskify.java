/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars.training;

/**
 *
 * @author edies
 */
public class Maskify {
    
    
    public static void mask(String text){
        int length = text.length();
        length = length - 4;
        String result = "";        
        char[] charArray = text.toCharArray();
        if(text.length() > 4){
            String lastFour = text.substring(length, text.length());
            for(int i=0; i < length; i++){charArray[i] = '#';}
            for(int i=0; i < text.length(); i++){result += charArray[i];}}
        else{result = text;}
       System.out.println(result);
    
    }
    
    public static void main(String[] args) {
        mask("4556364607935616");
        mask("64607935616");
        mask("1");
        mask("");
    }
    
}
