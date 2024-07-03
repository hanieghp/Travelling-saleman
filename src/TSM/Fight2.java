package TSM;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class Fight2 extends JFrame {
    Image round = Toolkit.getDefaultToolkit().getImage("images//Fight2.GIF");


    Fight2() {
        int MoneyP1 = Scores.money1;
        int MoneyP2 = Scores.money2;

        //calculating money
        MoneyP2 += (Scores.weapon2 - Scores.weapon1) * Scores.money1 / (Scores.weapon1 + Scores.weapon2);
        MoneyP1 -= (Scores.weapon2 - Scores.weapon1) * Scores.money1 / (Scores.weapon1 + Scores.weapon2);
        Scores.money1 = MoneyP1;
        Scores.money2 = MoneyP2;
        Scores.weapon2 = Scores.weapon2 - Scores.weapon1;

        //set things after fight and player2 win
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

        //Set the Frame
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0, 0, 3234, 2434);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.setTitle("Travelling Sales Man");//set title

        //set logo
        ImageIcon img1 = new ImageIcon("images//Logo.JPEG");
        this.setIconImage(img1.getImage());

    }
}