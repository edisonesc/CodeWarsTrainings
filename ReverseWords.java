/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars.training;

/**^
 *
 * @author edies
 */
public class ReverseWords {
    
    public static String rev(String text){
        String result = "", finalRes = "";
        for(int i=text.length(); i > 0; i-- ){
            result += text.charAt(i-1);}
        String[] splitter = result.split(" ");
        for(int i=splitter.length; i > 0; i--){
            finalRes +=   " " +splitter[i -1];}
        finalRes = finalRes.substring(1);
        return finalRes;
    
    }
    public static void main(String[] args) {
        System.out.println(rev("This is an example!"));
        System.out.println(rev("double  spaces"));
        System.out.println(rev("ehT kciuq nworb xof spmuj revo eht yzal .god"));
        System.out.println(rev("a b c d"));       
    }
    
}
