import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DivisionCalculator {
         public static void main(String[] args) {
            JFrame frame=new JFrame();
            JLabel lb1=new JLabel("num1");
            JTextField tf1=new JTextField(10);
            JLabel lb2=new JLabel("num2");
            JTextField tf2=new JTextField(10);
            JButton b=new JButton("divide");
            JTextField res=new JTextField(10);
            frame.add(lb1);
            frame.add(tf1);
            frame.add(lb2);
            frame.add(tf2);
            frame.add(b);
            frame.add(res);
            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    String num1=tf1.getText();
                    String num2=tf2.getText();
                    int n1=Integer.parseInt(num1);
                    int n2=Integer.parseInt(num2);
                    int result=n1/n2;
                    res.setText(String.valueOf(result));
                }
            });
         
         frame.setSize(200,300);
         frame.setVisible(true);
         frame.setLayout(new FlowLayout());
        }
}