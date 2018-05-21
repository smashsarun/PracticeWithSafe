
package view;

import controller.DiscountListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DiscountView {
    private JFrame jFrame;
    
    private JLabel topic;
    private JTextField input[] = new JTextField[3];
    
    private JLabel hasDiscount;
    private JTextField discount;
            
    private JButton calculate;
    private JTextField total;

    public DiscountView() {
        jFrame = new JFrame("Total purchese");
        
        input[0] = new JTextField();
        input[1] = new JTextField();
        input[2] = new JTextField();
        
        topic = new JLabel("Please input all of item below");
        hasDiscount = new JLabel("Input your discount percent");
        discount = new JTextField();
        calculate = new JButton("calculate");
        total = new JTextField();
    }
    
    public void loadProgram(){
        //Topic and Input
        JPanel head = new JPanel();
        
        GridLayout grid1 = new GridLayout(5,1);
        head.setLayout(grid1);
        
        head.add(topic);
        head.add(input[0]);
        head.add(input[1]);
        head.add(input[2]);
        
        jFrame.add(head,BorderLayout.NORTH);
        
        //discount
        JPanel discount = new JPanel();
        
        GridLayout g1 = new GridLayout(1,2);
        discount.setLayout(g1);
                
        discount.add(hasDiscount);
        discount.add(this.discount);
        
        jFrame.add(discount,BorderLayout.CENTER);
        
        //Calculate
        JPanel calculate = new JPanel();
        
        BorderLayout b1 = new BorderLayout();
        calculate.setLayout(b1);
        
        
        calculate.add(this.calculate,BorderLayout.WEST);
        calculate.add(total,BorderLayout.CENTER);
        
        jFrame.add(calculate,BorderLayout.SOUTH);
        
        DiscountListener d1 = new DiscountListener(input, this.discount, total);
        this.calculate.addActionListener(d1);
        
        
        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
    
    
    
}
