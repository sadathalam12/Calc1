

import java.util.List;
import java.util.ArrayList;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator(); 
        SwingUtilities.invokeLater(new GraphicCalculator(calc));
        
    }
    
    public static Boolean isInteger(String s){
        String nums = "1234567890"; 
       List<Character> n = new ArrayList<Character>(); 
        for(int i = 0; i<nums.length(); i++){
            n.add(nums.charAt(i));
        }
       for(int i = 0; i<s.length(); i++){
           if(!n.contains(s.charAt(i))){
               return false; 
           }
       }
       return true; 
    }
}
