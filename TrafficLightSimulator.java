import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TrafficLightSimulator{
    public static void main(String[] args) {
        JFrame frame=new JFrame("traffic light simulator");
        frame.setLayout(new FlowLayout());
        frame.setSize(300,300);
        frame.setVisible(true);
        JLabel lb=new JLabel("");
        frame.add(lb);
        JRadioButton a1=new JRadioButton("stop");
        JRadioButton a2=new JRadioButton("go");
        JRadioButton a3=new JRadioButton("wait");
        ButtonGroup bg=new ButtonGroup();
        bg.add(a1);
        bg.add(a2);
        bg.add(a3); 
        frame.add(a1);
        frame.add(a2);
        frame.add(a3);
        a1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            lb.setText("stop");
            lb.setForeground(Color.RED);
            }
            
        });
        a2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            lb.setText("go");
            lb.setForeground(Color.GREEN);
            }
            
        });
        a3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            lb.setText("wait");
            lb.setForeground(Color.YELLOW);
            }
            
        });
    }
}