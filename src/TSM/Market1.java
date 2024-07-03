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
    Image back = Toolkit.getDefaultToolkit().getImage("images//MarketFrame.GIF");
    Icon Ok1=new ImageIcon("images//ButtonOk.JPEG");
    Icon Treasure_place_permium1=new ImageIcon("images//IMG_E2856.JPG");
    Icon Treasure_place1=new ImageIcon("images//IMG_E2852.JPG");
    Icon Buying_weapon1=new ImageIcon("images//IMG_E2855.JPG");
    int xres, yres, min=1000, i;

    Market1() {
        Ok = new JButton(Ok1);
        Buying_weapon = new JButton(Buying_weapon1);
        Treasure_place = new JButton(Treasure_place1);
        Treasure_place_permium=new JButton(Treasure_place_permium1);
        this.setContentPane(new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(back, 0, -50, 1920, 1080, null);
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
        Ok.setBounds(50, 920, 400, 80);
        Buying_weapon.setBounds(1160, 200, 200, 240);
        Treasure_place.setBounds(750, 200, 190, 225);
        Treasure_place_permium.setBounds(1550, 200, 190, 240);
        this.add(Ok);
        this.add(Treasure_place_permium);
        this.add(Buying_weapon);
        this.add(Treasure_place);

        ImageIcon img1 = new ImageIcon("images//Logo.JPEG");
        this.setIconImage(img1.getImage());
        this.setBounds(0, 0, 3234, 2434);
        Treasure_place.addActionListener(this);
        Treasure_place_permium.addActionListener(this);
        Ok.addActionListener(this);
        Buying_weapon.addActionListener(this);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
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
            if (Scores.gameTurn==1) {
                if (Scores.money1 >= 50) {
                    int ans2 = JOptionPane.showConfirmDialog(null, "you have to give 50 coins to get coordinate of the closest treasure?", "Attention", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (ans2 == 1) {
                        this.setVisible(true);
                    }
                    if (ans2 == 0) {
                        outerloop: for (int fuck = 0; fuck < 12; fuck++) {
                            for (int u = 0; u< 12; u++) {
                                if (MyFrame.map[fuck][u] >= 100) {
                                    i=(MyFrame.map[fuck][u]-100)/100;
                                    System.out.println(i);
                                    Mouse1.treasures[i]= MyFrame.map[fuck][u]/100;
                                    MyFrame.map[fuck][u]*=-1;
                                    break outerloop;
                                }
                            }
                        }
                        Scores.money1 -= 50;
                        this.setVisible(false);
                    }
                    if (ans2==-1){
                        this.setVisible(true);
                    }
                }
                else {
                    int ans2 = JOptionPane.showConfirmDialog(null, "u dont have that much money!!!", "Attention", JOptionPane.YES_OPTION);
                    if (ans2==0){
                        this.setVisible(true);
                    }
                    if (ans2==1){
                        this.setVisible(false);
                    }
                }
            }
            if(Scores.gameTurn==2){
                if (Scores.money2 >= 50) {
                    int ans2 = JOptionPane.showConfirmDialog(null, "you have to give 50 coins to get coordinate of the closest treasure?", "Attention", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (ans2 == 1) {
                        this.setVisible(true);
                    }
                    if (ans2 == 0) {
                        outerloop:for (int fuck = 0; fuck < 12; fuck++) {
                            for (int u = 0; u< 12; u++) {
                                if (MyFrame.map[fuck][u] >= 100) {
                                    i=(MyFrame.map[fuck][u]-100)/100;
                                    System.out.println(i);
                                    Mouse1.treasures2[i]= MyFrame.map[fuck][u]/100;
                                    MyFrame.map[fuck][u]*=-1;
                                    break outerloop;
                                }
                            }
                        }
                        Scores.money2 -= 50;
                        this.setVisible(false);
                    }
                    if (ans2==-1){
                        this.setVisible(true);
                    }
                }
                else {
                    int ans2 = JOptionPane.showConfirmDialog(null, "u dont have that much money!!!", "Attention", JOptionPane.YES_OPTION);
                    if (ans2==0){
                        this.setVisible(true);
                    }
                    if (ans2==1){
                        this.setVisible(false);
                    }
                }
            }
        }

        if (e.getSource()==Buying_weapon){
            if (Scores.gameTurn==1) {
                if (Scores.money1 >= 50) {
                    int ans2 = JOptionPane.showConfirmDialog(null, "you have to give 50 coins to get power as much as 50?", "Attention", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (ans2 == 1) {
                        this.setVisible(true);
                    }
                    if (ans2 == 0) {
                        Scores.weapon1+=50;
                        Scores.money1-=50;
                        this.setVisible(false);
                    }
                    if (ans2==-1){
                        this.setVisible(true);
                    }
                }
                else {
                    int ans2 = JOptionPane.showConfirmDialog(null, "u dont have that much money!!!", "Attention", JOptionPane.YES_OPTION);
                    if (ans2==0){
                        this.setVisible(true);
                    }
                    if (ans2==1){
                        this.setVisible(false);
                    }
                }
            }
            if(Scores.gameTurn==2){
                if (Scores.money2 >= 50) {
                    int ans2 = JOptionPane.showConfirmDialog(null, "you have to give 50 coins to get coordinate of the closest treasure?", "Attention", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (ans2 == 1) {
                        this.setVisible(true);
                    }
                    if (ans2 == 0) {
                        Scores.weapon2+=50;
                        Scores.money2-=50;
                        this.setVisible(false);
                    }
                    if (ans2==-1){
                        this.setVisible(true);
                    }
                }
                else {
                    int ans2 = JOptionPane.showConfirmDialog(null, "u dont have that much money!!!", "Attention", JOptionPane.YES_OPTION);
                    if (ans2==0){
                        this.setVisible(true);
                    }
                    if (ans2==1){
                        this.setVisible(false);
                    }
                }
            }
        }
        if (e.getSource()==Treasure_place_permium){
            if (Scores.gameTurn==1) {
                if (Scores.money1 >= 100) {
                    int ans2 = JOptionPane.showConfirmDialog(null, "you have to give 100 coins to get coordinate of the closest treasure?", "Attention", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (ans2 == 1) {
                        this.setVisible(true);
                    }
                    if (ans2 == 0) {
                        for (int fuck = 0; fuck < 12; fuck++) {
                            for (int u = 0; u< 12; u++) {
                                if (MyFrame.map[fuck][u] >= 100) {
                                    int xyres=(Math.abs(fuck-Mouse1.x1))+(Math.abs(u-Mouse1.y1));
                                    if (xyres<min) {
                                        min = xyres;
                                        xres=fuck;
                                        yres=u;
                                    }
                                }
                            }
                        }
                        i=(MyFrame.map[xres][yres]-100)/100;
                        System.out.println(i);
                        Mouse1.treasures[i]= (MyFrame.map[xres][yres])/100;
                        MyFrame.map[xres][yres]*=-1;
                        Scores.money1 -= 100;
                        this.setVisible(false);
                    }
                    if (ans2==-1){
                        this.setVisible(true);
                    }
                }
                else {
                    int ans2 = JOptionPane.showConfirmDialog(null, "u dont have that much money!!!", "Attention", JOptionPane.YES_OPTION);
                    if (ans2==0){
                        this.setVisible(true);
                    }
                    if (ans2==1){
                        this.setVisible(false);
                    }
                }
            }
            if(Scores.gameTurn==2){
                if (Scores.money2 >= 100) {
                    int ans2 = JOptionPane.showConfirmDialog(null, "you have to give 100 coins to get coordinate of the closest treasure?", "Attention", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (ans2 == 1) {
                        this.setVisible(true);
                    }
                    if (ans2 == 0) {
                        for (int fuck = 0; fuck < 12; fuck++) {
                            for (int u = 0; u< 12; u++) {
                                if (MyFrame.map[fuck][u] >= 100) {
                                    int xyres=(Math.abs(fuck-Mouse1.x2))+(Math.abs(u-Mouse1.y2));
                                    if (xyres<min) {
                                        min = xyres;
                                        xres=fuck;
                                        yres=u;
                                    }
                                }
                            }
                        }
                        i=(MyFrame.map[xres][yres]-100)/100;
                        System.out.println(i);
                        Mouse1.treasures2[i]= (MyFrame.map[xres][yres])/100;
                        MyFrame.map[xres][yres]*=-1;
                        Scores.money2 -= 100;
                        this.setVisible(false);
                    }
                    if (ans2==-1){
                        this.setVisible(true);
                    }
                }
                else {
                    int ans2 = JOptionPane.showConfirmDialog(null, "u dont have that much money!!!", "Attention", JOptionPane.YES_OPTION);
                    if (ans2==0){
                        this.setVisible(true);
                    }
                    if (ans2==1){
                        this.setVisible(false);
                    }
                }
            }
        }
    }
}
