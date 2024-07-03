package TSM;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class Fight1 extends JFrame {
    Image round = Toolkit.getDefaultToolkit().getImage("images//Fight1.GIF");

    Fight1() {
        int MoneyP2 = Scores.money2;
        int  MoneyP1 = Scores.money1;

        //calculating money
        MoneyP1 += (Scores.weapon1 - Scores.weapon2) * Scores.money2 / (Scores.weapon1 + Scores.weapon2);
        MoneyP2 -= (Scores.weapon1 - Scores.weapon2) * Scores.money2 / (Scores.weapon1 + Scores.weapon2);

        Scores.money1 = MoneyP1;
        Scores.money2 = MoneyP2;
        Scores.weapon1 = Scores.weapon1 - Scores.weapon2;

        //set things after fight and player1 win
        Scores.weapon2 = 0;
        MyFrame.player2locX = 420;
        MyFrame.player2locY = 900;
        Mouse1.x2=1;
        Mouse1.y2=10;

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
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(0, 0, 3234, 2434);
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Travelling Sales Man");//set title

        //set logo
        ImageIcon img1 = new ImageIcon("images//Logo.JPEG");
        this.setIconImage(img1.getImage());

    }
}