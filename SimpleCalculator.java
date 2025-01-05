import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SimpleCalculator extends JFrame implements ActionListener{
    JTextField display;
    JButton[] number=new JButton[10];
    JButton addButton,subButton,mulButton,divButton,eqButton,clsButton;
    JPanel p;
    int num1=0,num2=0,res=0;
    char op;
    public SimpleCalculator(){
        setSize(300,400);
        setVisible(true);
        setLayout(new BorderLayout());
        display=new JTextField();
        add(display,BorderLayout.NORTH);
        for(int i=0;i<10;i++){
            number[i]=new JButton(String.valueOf(i));
            number[i].addActionListener(this);
        }
        addButton=new JButton("+");
        subButton=new JButton("-");
        mulButton=new JButton("*");
        divButton=new JButton("/");
        eqButton=new JButton("=");
        clsButton=new JButton("c");
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        eqButton.addActionListener(this);
        clsButton.addActionListener(this);
        p=new JPanel();
        add(p,BorderLayout.CENTER);
        p.add(number[1]);
        p.add(number[2]);
        p.add(number[3]);
        p.add(number[4]);
        p.add(number[5]);
        p.add(number[6]);
        p.add(number[7]);
        p.add(number[8]);
        p.add(number[9]);
        p.add(number[0]);
        p.add(addButton);
        p.add(subButton);
        p.add(divButton);
        p.add(mulButton);
        p.add(eqButton);
        p.add(clsButton);

    }
    public void actionPerformed(ActionEvent e){
        for(int i=0;i<10;i++){
            if(number[i]==e.getSource()){
                display.setText(String.valueOf(i));
            }
        }
        if(addButton==e.getSource()){
            num1=Integer.parseInt(display.getText());
            op='+';
            display.setText("");
        }
        if(mulButton==e.getSource()){
            num1=Integer.parseInt(display.getText());
            op='*';
            display.setText("");
        }
        if(divButton==e.getSource()){
            num1=Integer.parseInt(display.getText());
            op='/';
            display.setText("");
        }
        if(subButton==e.getSource()){
            num1=Integer.parseInt(display.getText());
            op='-';
            display.setText("");
        }
        if(eqButton==e.getSource()){
            num2=Integer.parseInt(display.getText());
            switch(op){
                case '+':res=num1+num2;
                break;
                case '-':res=num1-num2;
                break;
                case '*':res=num1*num2;
                break;
                case '/':res=num1/num2;
                break;
            }
            display.setText(String.valueOf(res));
        }
        if(clsButton==e.getSource()){
            display.setText("");
        }
    }
    public static void main(String[] args) {
        new SimpleCalculator();
    }
}