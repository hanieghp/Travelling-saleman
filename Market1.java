package TSM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class Market1 extends JFrame implements ActionListener {
    Random random = new Random();
    JButton Ok;
    JButton Buying_weapon;
    JButton Treasure_place_permium;
    JButton Treasure_place;
    Image Treasure = Toolkit.getDefaultToolkit().getImage("IBPX3526.JPEG");
    Image back = Toolkit.getDefaultToolkit().getImage("IMG_2850.GIF");
    Icon Ok1=new ImageIcon("GFGW5745.JPEG");
    Icon Treasure_place_permium1=new ImageIcon("IMG_E2856.JPG");
    Icon Treasure_place1=new ImageIcon("IMG_E2852.JPG");
    Icon Buying_weapon1=new ImageIcon("IMG_E2855.JPG");
    int i = 0, j = 0;

    Market1() {
        Ok = new JButton(Ok1);
        Buying_weapon = new JButton(Buying_weapon1);
        Treasure_place = new JButton(Treasure_place1);
        Treasure_place_permium=new JButton(Treasure_place_permium1);
        this.setContentPane(new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(back, 0, -50, 1920, 1080, null);
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
        Ok.setBounds(50, 920, 400, 80);
        Buying_weapon.setBounds(1160, 200, 200, 240);
        Treasure_place.setBounds(750, 200, 190, 225);
        Treasure_place_permium.setBounds(1550, 200, 190, 240);
        this.add(Ok);
        this.add(Treasure_place_permium);
        this.add(Buying_weapon);
        this.add(Treasure_place);

        ImageIcon img1 = new ImageIcon("F:\\my photoshops\\EZMW0610.JPEG");
        this.setIconImage(img1.getImage());
        this.setBounds(0, 0, 3234, 2434);
//        this.setLocationRelativeTo(null);
        Treasure_place.addActionListener(this);
        Treasure_place_permium.addActionListener(this);
        Ok.addActionListener(this);
        Buying_weapon.addActionListener(this);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        this.setSize(3234, 2434);
//        this.setResizable(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Ok) {
            int ans1 = JOptionPane.showConfirmDialog(null, "Leave market and Back to game?", "Doing nothing?", JOptionPane.YES_NO_CANCEL_OPTION);
            if (ans1 == 0) {
                this.setVisible(false);
            }
            else if (ans1 == 1) {
                this.setVisible(true);
            }
            else if (ans1 == -1) {
                this.setVisible(true);
            }
        }
        if (e.getSource()==Treasure_place){
            int ans2 = JOptionPane.showConfirmDialog(null, "you have to give 50 coins to get coordinate of a treasure?", "Attention", JOptionPane.YES_NO_CANCEL_OPTION);
            if (ans2==1) {
                this.setVisible(true);
            }
            if (ans2==0) {
                Scores.score1 += 1;
                for (int x=0 ; x<12 ; x++) {
                    for (int y=0 ; y<12 ; y++) {
                        if (MyFrame.map[x][y]>=100){
                            this.setContentPane(new JPanel() {
                                @Override
                                public void paintComponent(Graphics g) {
                                    g.drawImage(Treasure, i * 75 + 350, j * 75 + 150, null);
                                }
                            });
                            pack();
                        }
                    }
                }
                Scores.money1-=50;
                this.setVisible(false);
            }
            if (ans2==-1)
                this.setVisible(true);
        }
        if (e.getSource()==Treasure_place_permium){
            int ans2 = JOptionPane.showConfirmDialog(null, "you have to give 100 coins to get coordinate of a the closest treasure?", "Attention", JOptionPane.YES_NO_CANCEL_OPTION);
            if (ans2==1) {
                this.setVisible(true);
            }
            if (ans2==0) {
                Scores.score1 += 1;
                for (int x=0 ; x<12 ; x++) {
                    for (int y=0 ; y<12 ; y++) {
                        if (MyFrame.map[x][y]>=100){
                            this.setContentPane(new JPanel() {
                                @Override
                                public void paintComponent(Graphics g) {
                                    g.drawImage(Treasure, i * 75 + 350, j * 75 + 150, null);
                                }
                            });
                            pack();
                        }
                    }
                }
                Scores.money1-=100;
                this.setVisible(false);
            }
            if (ans2==-1)
                this.setVisible(true);
        }
        if (e.getSource()==Buying_weapon){
            int ans2 = JOptionPane.showConfirmDialog(null, "you have to give 50 coins to get a weapon with as much power as 50?", "Attention", JOptionPane.YES_NO_CANCEL_OPTION);
            if (ans2 == 0) {
                Scores.weapon1+=50;
                Scores.money1-=50;
                this.setVisible(false);
            }
            if (ans2 == 1) {
                this.setVisible(true);
            }
            if (ans2 == -1) {
                this.setVisible(true);
            }
        }
    }
}
