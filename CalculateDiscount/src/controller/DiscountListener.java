package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import javax.swing.JTextField;

public class DiscountListener implements ActionListener {

    private JTextField[] item;
    private JTextField discount;
    private JTextField calculate;

    public DiscountListener(JTextField[] item, JTextField discount, JTextField calculate) {
        this.item = item;
        this.discount = discount;
        this.calculate = calculate;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        double totalPrice = 0;
        System.out.println(ae.getActionCommand());
        
        for (int i = 0; i < 3; i++) {
            totalPrice += Double.parseDouble(item[i].getText());
        }
        
        totalPrice -= (Double.parseDouble(discount.getText()) /100 * totalPrice);
        
        calculate.setText(""+totalPrice);
    }

}
