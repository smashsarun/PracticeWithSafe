
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GUI {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Hello World");
        
        JPanel jp = new JPanel();
              
        JButton bt1 = new JButton("Click1");
        JButton bt2 = new JButton("Click2");
        JButton bt3 = new JButton("Click3");
        JButton bt4 = new JButton("Click4");
        JButton bt5 = new JButton("Click5");
        
        GridLayout grid1 = new GridLayout(3,2);
        jp.setLayout(grid1);
        
        jp.add(bt1);
        jp.add(bt2);
        jp.add(bt3);
        jp.add(bt4);
        jp.add(bt5);
        
        jf.add(jp);
        
        jf.setSize(400,400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
