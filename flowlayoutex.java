import javax.swing.*;
import java.awt.*;
public class flowlayoutex{
    public static void main(String[] args) {
        
    
    JFrame frame=new JFrame("flow layout");
    frame.setLayout(new FlowLayout(FlowLayout.LEFT,19,30));
    for(int i=0;i<=5;i++){
        frame.add(new JButton("button"+i));
    }
    frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
}
}

// import java.awt.*;
// import javax.swing.*;

// public class flowlayoutex {
//     public static void main(String[] args) {
//         JFrame frame = new JFrame("FlowLayout Example");
//         frame.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20)); // Left-aligned with gaps

//         // Add buttons to the frame
//         for (int i = 1; i <= 5; i++) {
//             frame.add(new JButton("Button " + i));
//         }

//         frame.setSize(300, 200);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setVisible(true);
//     }
// }
