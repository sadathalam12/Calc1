
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private JTextField output = new JTextField("0"); 
    private JTextField input= new JTextField("0"); 
    private Calculator calc; 
    public GraphicCalculator(Calculator calc){
        this.calc = calc; 
      //  frame.setVisible(true);
    }

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 150));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,1));
        createComponents(frame.getContentPane());
       
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        output = new JTextField("0");
        output.setEnabled(false);
        input = new JTextField("0"); 
        container.add(output);
        container.add(input); 
        container.add(createPanel());
        
    }
    
    private JPanel createPanel(){
        JPanel panel = new JPanel(new GridLayout(1,3));
        JButton add = new JButton("+"); 
        JButton subtract = new JButton("-"); 
        JButton z = new JButton("Z");
        add.addActionListener(new AddListener(calc,input,output,add,z));
        subtract.addActionListener(new SubtractListener(calc,input,output,subtract,z)); 
        z.addActionListener(new ZListener(z,output,input));
        z.setEnabled(false);
        panel.add(add);
        panel.add(subtract);
        panel.add(z);
        return panel; 
    }

    public JFrame getFrame() {
        return frame;
    }
    
   
}
