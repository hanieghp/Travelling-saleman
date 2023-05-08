package TSM;

import javax.swing.*;
import java.awt.*;

public class winner2 extends JFrame {
    Image img1 = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG_2933.GIF");
    winner2(){
        this.setContentPane(new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(img1, 0, 0, 1950, 1300, null);
                repaint();
            }
        });
        ImageIcon img1 = new ImageIcon("F:\\my photoshops\\EZMW0610.JPEG");
        pack();
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Travelling Sales Man");
        this.setBounds(600, 200, 300, 120);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.setBounds(0, 0, 3234, 2434);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
