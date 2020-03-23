
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdala
 */
public class SubtractListener implements ActionListener {
 private Calculator calc; 
    private JTextField input; 
    private JTextField output;
    private JButton button; 
    private JButton z;
    public SubtractListener(Calculator calc, JTextField input, JTextField output, JButton button,JButton z){
        this.calc = calc; 
        this.input = input; 
        this.output = output; 
        this.button = button; 
        this.z = z; 
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(isInteger(input.getText())){
        int x = Integer.parseInt(output.getText()); 
        int y = Integer.parseInt(input.getText()); 
       int difference= calc.subtract(x, y);
        output.setText(""+difference);
        input.setText("0");
        }else{
            input.setText("0");
        }
        if(!output.getText().equals("0")){
        z.setEnabled(true);
        }else{
            z.setEnabled(false);
        }
    }
    
    private Boolean isInteger(String s){
        String nums = "-1234567890"; 
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
    

