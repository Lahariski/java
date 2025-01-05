import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class mouse extends JFrame implements MouseListener,MouseMotionListener{
    String eventname="";
    public  mouse(){
        setSize(300,300);
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("mouse movements");
        addMouseListener(this);
        addMouseMotionListener(this);

    }
    public void paint(Graphics g){
        super.paint(g);
        g.setFont(new Font("ariel",Font.PLAIN,20));
        g.drawString(eventname, 150, 200);
    }
    public void mousePressed(MouseEvent e){
        eventname="mouse pressed";
        repaint();
    }
    public void mouseClicked(MouseEvent e){
        eventname="mouse clicked";
        repaint();
    }
    public void mouseEntered(MouseEvent e){
        eventname="mouse enterd";
        repaint();
    }
    public void mouseExited(MouseEvent e){
        eventname="mouse exited";
        repaint();
    }
    public void mouseDragged(MouseEvent e){
        eventname="mouse dragged";
        repaint();
    }
    public void mouseReleased(MouseEvent e){
        eventname="mouse realesed";
        repaint();
    }
    public void mouseMoved(MouseEvent e){
        eventname="mouse moved";
        repaint();
    }
    public static void main(String[] args) {
        new mouse();
    }
}