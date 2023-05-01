package TSM;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

public class MyFrame extends JFrame implements ActionListener {
    JButton backA;
    JButton exitA;
    Random rand = new Random();
    int x;
    int y;
    public static int[][] map = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 1, 1, 1, 1, 6, 1, 1, 1, 1, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    };
    Image castle = Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\test java\\library\\TMS\\ba4cf8fadc36757ac213b3b5803164551.png");
    Image back = Toolkit.getDefaultToolkit().getImage("back.jpeg");

    Image market = Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\test java\\library\\TMS\\earqe870i1cz14.jpg");
    Image zamin = Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\test java\\library\\TMS\\earqe870i1cz13.jpg");
    Image wall = Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\test java\\library\\TMS\\earqe870i1cz12.jpg");
    Image left = Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\OneDrive\\Pictures\\Screenshots\\left.jpg");
    Image right = Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\OneDrive\\Pictures\\Screenshots\\right.jpg");
    Image up = Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\OneDrive\\Pictures\\Screenshots\\up.jpg");
    Image down = Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\OneDrive\\Pictures\\Screenshots\\down.jpg");

    // private Total_Map total_map ;
    JFrame frame;
//    private BufferedImage img;
//    private BufferedImage[] idlani;
//    private int anitick, aniindex, anispeed = 20, anired;

    int player1locX = 460;

    int player1locY = 930;
    int player2locX = 420;

    int player2locY = 930;
    ImageIcon icon;
    JLabel label;

    Image background;
    Image playerimg1;
    Image playerimg2;

    private TimerJpanel timerPanel = new TimerJpanel();
    private Dice dice = new Dice();

    MyFrame() {

//        importimage();
//        loadanimation();
        Icon backIcon1 = new ImageIcon("F:\\my photoshops\\KZAS6623.jpg");
        Icon exitIcon1 = new ImageIcon("F:\\my photoshops\\KZAS66222.jpg");
        backA = new JButton(backIcon1);
        exitA = new JButton(exitIcon1);
        exitA.addActionListener(this);
        backA.addActionListener(this);
        for (int i = 0; i < 1; i++) {
            x = Math.abs((rand.nextInt() % 5)) + 1;
            y = Math.abs((rand.nextInt() % 2)) + 9;
            if (map[x][y] == 1) {
                map[x][y] = 500; //treasure//mirror

            } else i--;
        }
        for (int i = 0; i < 1; i++) {
            x = Math.abs((rand.nextInt() % 5)) + 1;
            y = Math.abs((rand.nextInt() % 2)) + 7;
            if (map[x][y] == 1) {
                map[x][y] = 600; //treasure//coin
            } else i--;
        }
        for (int i = 0; i < 1; i++) {
            x = Math.abs((rand.nextInt() % 5)) + 1;
            y = Math.abs((rand.nextInt() % 3)) + 1;
            if (map[x][y] == 1) {
                map[x][y] = 700; //treasure//king
            } else i--;
        }
        for (int i = 0; i < 1; i++) {
            x = Math.abs((rand.nextInt() % 5)) + 1;
            y = Math.abs((rand.nextInt() % 3)) + 4;
            if (map[x][y] == 1) {
                map[x][y] = 800; //treasure
            } else i--;
        }
        for (int i = 0; i < 1; i++) {
            x = Math.abs((rand.nextInt() % 5)) + 6;
            y = Math.abs((rand.nextInt() % 3)) + 8;
            if (map[x][y] == 1) {
                map[x][y] = 400; //treasure//glass shoe
            } else i--;
        }
        for (int i = 0; i < 1; i++) {
            x = Math.abs((rand.nextInt() % 5)) + 6;
            y = Math.abs((rand.nextInt() % 3)) + 5;
            if (map[x][y] == 1) {
                map[x][y] = 300; //treasure
            } else i--;
        }
        for (int i = 0; i < 1; i++) {
            x = Math.abs((rand.nextInt() % 5)) + 6;
            y = Math.abs((rand.nextInt() % 2)) + 1;
            if (map[x][y] == 1) {
                map[x][y] = 200; //treasure//apple
            } else i--;
        }
        for (int i = 0; i < 1; i++) {
            x = Math.abs((rand.nextInt() % 5)) + 6;
            y = Math.abs((rand.nextInt() % 2)) + 3;
            if (map[x][y] == 1) {
                map[x][y] = 100; //treasure//shoe
            } else i--;
        }
        for (int i = 0; i < 13; i++) {
            x = Math.abs(rand.nextInt() % 10) + 1;
            y = Math.abs((rand.nextInt() % 10)) + 1;
            if (map[x][y] == 1) {
                map[x][y] = 3; //lost Precious//diamond
            } else i--;
        }
        for (int i = 0; i < 5; i++) {
            x = Math.abs((rand.nextInt() % 10)) + 1;
            y = Math.abs((rand.nextInt() % 10)) + 1;
            if (map[x][y] == 1) {
                map[x][y] = 7; //wall
            }
        }
        for (int i = 0; i < 5; i++) {
            x = Math.abs(rand.nextInt() % 10) + 1;
            y = Math.abs(rand.nextInt() % 10) + 1;
            if (map[x][y] == 1) {
                map[x][y] = 4; //market
            } else i--;
        }
        int j = Math.abs(rand.nextInt() % 5) + 2;
        for (int i = 0; i < j; i++) {
            x = Math.abs(rand.nextInt() % 10) + 1;
            y = Math.abs(rand.nextInt() % 10) + 1;
            if (map[x][y] == 1) {
                map[x][y] = 5; //trap
            } else i--;
        }
        this.setContentPane(new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(back, 0, 0, 1920, 1080, null);
                g.drawImage(left, 100, 300, 50, 50, null);
                g.drawImage(right, 170, 400, 50, 50, null);
                g.drawImage(up, 135, 550, 50, 50, null);
                g.drawImage(down, 135, 750, 50, 50, null);
                    for (int i = 0; i < 12; i++) {
                        for (int j = 0; j < 12; j++) {
                            if (map[i][j] == 4) {
                                g.drawImage(market, i * 75 + 350, j * 75 + 200, null);
                            }
                            if (map[i][j] != 7 && map[i][j] != 6 && map[i][j] != 4 && map[i][j] != 0) {
                                g.drawImage(zamin, i * 75 + 350, j * 75 + 200, null);
                            }
                            if (map[i][j] == 7)
                                g.drawImage(wall, i * 75 + 350, j * 75 + 200, null);
                            if (map[i][j] == 6)
                                g.drawImage(castle, i * 75 + 350, j * 75 + 200, null);
                        }
                        g.drawImage(playerimg1, player1locX, player1locY, 30, 80, null);
                        g.drawImage(playerimg2, player2locX, player2locY, 30, 80, null);
                        repaint();
                        //this.add(dice);
                    }

                }
            });
        pack();
        addMouseListener(new Mous(this));
        addKeyListener(new Move1(this));
        dice.setBounds(100, 100, 75, 76);
        timerPanel.setBounds(100, 50, 75, 25);
        backA.setBounds(1550, 830, 100, 80);
        exitA.setBounds(1550, 920, 100, 80);
        playerimg1 = new ImageIcon("JZHO9321.png").getImage();
        playerimg2 = new ImageIcon("TUGR3735.png").getImage();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1920, 1080);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
        this.add(dice);
        this.add(timerPanel);
        this.add(exitA);
        this.add(backA);
        ImageIcon img1 = new ImageIcon("EZMW0610.jpeg");
        this.setIconImage(img1.getImage());
        this.setTitle("Travelling Sales Man ");


        //Move1 move = new Move1();


//        importimage();
//        loadanimation();
        //this.add(timerPanel);

    }

//    private void loadanimation() {
//        idlani = new BufferedImage[7];
//        for (int i = 0; i < idlani.length; i++) {
//            idlani[i] = img.getSubimage(i * 1733, 0, 1733, 975);
//        }
//    }
//
//    private void importimage() {
//        InputStream is = getClass().getResourceAsStream("/finalBack.png");
//        try {
//            img = ImageIO.read(is);
//        } catch (IOException e) {
//            throw new RuntimeException();
//        } finally {
//            try {
//                is.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }
//    }
//
//    private void updateanimationtic() {
//        anitick++;
//        if (anitick >= anispeed) {
//            anitick = 0;
//            aniindex++;
//            anired++;
//            if (aniindex >= idlani.length) {
//                aniindex = 0;
//            }
//        }
//    }

//    public void paint(Graphics g) {
//
//        g.setColor(new Color(0, 0, 0));
//        //g.drawOval(100 , 100 , 200 , 200);
//        //updateanimationtic();
//        //g.drawImage(idlani[aniindex], 0, 0, 1920, 1080, null);
//        //   g.drawImage(playerblue[anired], 150, 700, 50, 50, null);
//
//        //g.drawImage(background, 0, 0, 1112, 843, null);
//        g.drawImage(back, 0, 0, 3234, 2434, null);
//        //updateanimationtic();
//        g.drawImage(left, 100, 900, 50, 50, null);
//        g.drawImage(right, 170, 900, 50, 50, null);
//        g.drawImage(up, 135, 850, 50, 50, null);
//        g.drawImage(down, 135, 950, 50, 50, null);
    //}

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backA) {
            int ans1 = JOptionPane.showConfirmDialog(null, "Leave game and Back to menu?", "Attention", JOptionPane.YES_NO_CANCEL_OPTION);
            if (ans1 == 0) {
                JFrame nowb = (JFrame)
                        SwingUtilities.getWindowAncestor(backA);
                nowb.dispose();
                Sound.stop();
                new Menu();
            }
            if (ans1 == 1) {
                this.setVisible(true);
            }
            if (ans1 == -1) {
                this.setVisible(true);
            }
        }
        if (e.getSource() == exitA) {
            int ans2 = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Attention", JOptionPane.YES_NO_CANCEL_OPTION);
            if (ans2 == 0) {
                JFrame now = (JFrame)
                        SwingUtilities.getWindowAncestor(exitA);
                now.dispose();
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

