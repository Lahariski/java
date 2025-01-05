import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Box extends JFrame implements ActionListener
{
   JButton b;
  Box()
{
   b=new JButton("This is a button");
   add(b);
   b.addActionListener(this);
   setLayout(new FlowLayout());
   setSize(700, 500);
   setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
   System.out.println("Clicked on the button");
}
}
class Event1
{
public static void main(String args[])
{
   Box t=new Box();
}
}
