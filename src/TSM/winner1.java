package TSM;

import javax.swing.*;
import java.awt.*;

public class winner1 extends JFrame {
    Image img1 = Toolkit.getDefaultToolkit().getImage("images//win1.GIF");
    winner1(){
        this.setContentPane(new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(img1, 0, 0, 1950, 1300, null);
                repaint();
            }
        });
        pack();

        //set Frame
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.setBounds(0, 0, 3234, 2434);
        this.setLocationRelativeTo(null);
        this.setTitle("Travelling Sales Man");//set title

        //set logo
        ImageIcon img1 = new ImageIcon("images//Logo.JPEG");
        this.setIconImage(img1.getImage());
    }
}
