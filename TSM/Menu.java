package TSM;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame{

    Image img1=Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\UPUA66131.JPEG");

    Menu(){
        this.setContentPane(new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(img1, -750, -1250, null);
            }
        });
        pack();
        setVisible(true);
        JButton b = new JButton("Start");
        b.addActionListener(e -> this.setVisible(true));
        JButton b1 = new JButton("Exit");
        b1.addActionListener(e -> this.setVisible(false));
        b.setBounds(790, 500, 300, 55);
        b1.setBounds(790, 560, 300, 55);
        this.add(b);
        this.add(b1);
        this.setSize(400, 500);
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(600, 600);
    }
}