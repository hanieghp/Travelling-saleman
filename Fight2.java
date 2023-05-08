package TSM;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class Fight2 extends JFrame {
    Image round = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG_2937.GIF");


    Fight2() {
        int one = Scores.money1;
        int two = Scores.money2;
        two += (Scores.weapon2 - Scores.weapon1) * Scores.money1 / (Scores.weapon1 + Scores.weapon2);
        one -= (Scores.weapon2 - Scores.weapon1) * Scores.money1 / (Scores.weapon1 + Scores.weapon2);
        Scores.money1 = one;
        Scores.money2 = two;
        Scores.weapon2 = Scores.weapon2 - Scores.weapon1;
        Scores.weapon1 = 0;
        MyFrame.player1locX = 460;
        MyFrame.player1locY = 900;
        Mouse1.x1=1;
        Mouse1.y1=10;

        this.setContentPane(new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(round, 0, 0, 1930, 1000, null);
                repaint();
            }
        });
        pack();
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Travelling Sales Man");
        this.setBounds(600, 200, 300, 120);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        ImageIcon img1 = new ImageIcon("F:\\my photoshops\\EZMW0610.JPEG");
        this.setIconImage(img1.getImage());
        this.setBounds(0, 0, 3234, 2434);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}