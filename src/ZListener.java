
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class ZListener implements ActionListener {
    private JButton button; 
    private JTextField output;
    private JTextField input; 
    
    public ZListener(JButton button, JTextField output,JTextField input){
        this.button = button; 
        this.output = output; 
        this.input = input;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        output.setText("0");
        input.setText("0");
        button.setEnabled(false);
    }
    
}
