import java.awt.*;
import java.awt.event.*;

public class KeyListenerEx extends  Frame implements KeyListener
{
   Label l;
   TextArea area;
   KeyListenerEx()
   {
	   l=new Label();
	   l.setBounds(200,100,150,60);
	   area=new   TextArea();
	   area.setBounds(200,200,150,60);
	   area.addKeyListener(this);
	   add(l);
	   add(area);
	   setSize(400,400);
	   setLayout(null);
	   setVisible(true);
   }
   
	   public void keyPressed(KeyEvent ke)
	   {
		  
	   }
	   
	   
	   public void keyTyped(KeyEvent ke)
	   {
		   l.setText("key Typed");
	   }
	   
	   public void keyReleased(KeyEvent ke)
	   {
		   l.setText("key released");
	   }
	   
	   public static void main(String args[])
	   {
		   new KeyListenerEx();
	   }
   }
	

