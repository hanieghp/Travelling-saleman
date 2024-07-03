package TSM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Random;
import java.util.Scanner;

public class MyFrame extends JFrame implements ActionListener {
    static JTextField x1;//x1  is the name of player1 showed in Frame

    static JTextField  x2;//x2  is the name of player2 showed in Frame

    public static int n=0 ;
    JButton backA;
    JButton exitA;
    static Random rand = new Random();

    public static int count=0 ;

    public int save=0;

    public static int[][] marketarray = new int[5][2];

    public int marketloc1x , marketloc1y , marketloc2x , marketloc2y ,marketloc3x , marketloc3y ,marketloc4x , marketloc4y ,marketloc5x , marketloc5y ;

    static int res = Math.abs(rand.nextInt() % 8) + 1;//random for treasure

    int x;
    int y;

    public static int ldk=0;

    public static int[][] map = {//0 out of map , 6 castle , 11 loc start
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 11, 0},
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
    Image castle = Toolkit.getDefaultToolkit().getImage("images//CastleIcon.png");
    Image back = Toolkit.getDefaultToolkit().getImage("images//back.JPEG");

    Image market = Toolkit.getDefaultToolkit().getImage("images//MarketIcon.jpg");
    Image zamin = Toolkit.getDefaultToolkit().getImage("images//ZaminIcon.jpg");
    Image wall = Toolkit.getDefaultToolkit().getImage("images//WallIcon.jpg");
    Image left = Toolkit.getDefaultToolkit().getImage("images//left.PNG");
    Image right = Toolkit.getDefaultToolkit().getImage("images//right.PNG");
    Image up = Toolkit.getDefaultToolkit().getImage("images//up.PNG");
    Image down = Toolkit.getDefaultToolkit().getImage("images//down.PNG");
    Image round = Toolkit.getDefaultToolkit().getImage("images//Switch.gif");
    Image chakme = Toolkit.getDefaultToolkit().getImage("images//chakme.PNG");
    Image cheraq = Toolkit.getDefaultToolkit().getImage("images//cheraq.PNG");
    Image halghe = Toolkit.getDefaultToolkit().getImage("images//halghe.PNG");
    Image taj = Toolkit.getDefaultToolkit().getImage("images//taj.PNG");
    Image trap = Toolkit.getDefaultToolkit().getImage("images//Trap.jpg");
    Image ayne = Toolkit.getDefaultToolkit().getImage("images//ayne.PNG");
    Image sib = Toolkit.getDefaultToolkit().getImage("images//sib.PNG");
    Image javaherat = Toolkit.getDefaultToolkit().getImage("images//javaher.PNG");
    Image kafsh = Toolkit.getDefaultToolkit().getImage("images//kafsh.PNG");
    Image diamond = Toolkit.getDefaultToolkit().getImage("images//diamond.JPEG");

    static String power1;
    static String money1;
    static String treasure1;
    static String power2;
    static String money2;
    static String treasure2;

    static int player1locX = 460;

    static int player1locY = 900;
    static int player2locX = 420;

    static int player2locY = 900;

    Image playerimg1;
    Image playerimg2;

    private final TimerJpanel timerPanel = new TimerJpanel();
    private final Dice dice = new Dice();

    MyFrame() {
        x1= new JTextField("player1");
        x2=new JTextField("player2");
        SoundButton sound = new SoundButton("images//audioJungle.wav","mute.jpg","unmute.jpg");
        Icon backIcon1 = new ImageIcon("images//ButtonBack.jpg");
        Icon exitIcon1 = new ImageIcon("images//ButtonExit.jpg");
        backA = new JButton(backIcon1);
        exitA = new JButton(exitIcon1);
        exitA.addActionListener(this);
        backA.addActionListener(this);

        for (int i = 0; i < 5; i++) {
            x = Math.abs(rand.nextInt() % 10) + 1;
            y = Math.abs(rand.nextInt() % 10) + 1;
            if (map[x][y] == 1) {
                map[x][y] = 4; //market
            } else i--;
        }
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
                map[x][y] = 700; //treasure//taj
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
                map[x][y] = 400; //treasure//kafsh
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
                map[x][y] = 200; //treasure//sib
            } else i--;
        }
        for (int i = 0; i < 1; i++) {
            x = Math.abs((rand.nextInt() % 5)) + 6;
            y = Math.abs((rand.nextInt() % 2)) + 3;
            if (map[x][y] == 1) {
                map[x][y] = 100; //treasure//ckakme
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
        int j = Math.abs(rand.nextInt() % 5) + 2;//number of trap(Random)
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
                g.drawImage(back, 0, -50, 1920, 1080, null);
                g.drawImage(left, 20, 520, 100, 100, null);
                g.drawImage(right, 180, 520, 100, 100, null);
                g.drawImage(up, 100, 400, 100, 100, null);
                g.drawImage(down, 100, 640, 100, 100, null);
                g.drawImage(round,1500,100,75,75,null);
                repaint();
                for (int i = 0; i < 12; i++) {
                    for (int j = 0; j < 12; j++) {
                        if (map[i][j] != 7 && map[i][j] != 6 && map[i][j] != 0)//!wall , !castle , !out of map
                            g.drawImage(zamin, i * 75 + 350, j * 75 + 150, null);
                        if (map[i][j] == 4) {
                            if(count == 0) {
                                g.drawImage(market, i * 75 + 350, j * 75 + 150, null);
                            }
                                if(save == 0){
                                    marketarray[0][0]=i * 75 + 350;
                                    marketarray[0][1]= j * 75 + 150;
                                    save++;

                                }
                                else if(save == 1){
                                    marketarray[1][0]=i * 75 + 350;
                                    marketarray[1][1]=j * 75 + 150;
                                    save++;
                                }
                                else if(save == 2){
                                    marketarray[2][0]=i * 75 + 350;
                                    marketarray[2][1]=j * 75 + 150;
                                    save++;
                                }
                                else if(save == 3){
                                    marketarray[3][0]=i * 75 + 350;
                                    marketarray[3][1]=j * 75 + 150;
                                    save++;
                                }
                                else if(save == 4) {
                                    marketarray[4][0] = i * 75 + 350;
                                    marketarray[4][1] = j * 75 + 150;
                                    save++;
                                }
                            if(count == 1) {//saving game in File
                                File save = new File(new File("")+"saveFile/save.txt");
                                try {
                                    Scanner scanner = new Scanner(save);
                                    while (scanner.hasNextLine()) {
                                        String deta = scanner.nextLine();
                                        String[] arraysave = deta.split(",");

                                        marketloc1x=Integer.parseInt(arraysave[0]);
                                        marketloc1y=Integer.parseInt(arraysave[1]);

                                        marketloc2x=Integer.parseInt(arraysave[2]);
                                        marketloc2y=Integer.parseInt(arraysave[3]);

                                        marketloc3x=Integer.parseInt(arraysave[4]);
                                        marketloc3y=Integer.parseInt(arraysave[5]);

                                        marketloc4x=Integer.parseInt(arraysave[6]);
                                        marketloc4y=Integer.parseInt(arraysave[7]);

                                        marketloc5x=Integer.parseInt(arraysave[8]);
                                        marketloc5y=Integer.parseInt(arraysave[9]);

                                        player1locX = Integer.parseInt(arraysave[10]);
                                        player1locY = Integer.parseInt(arraysave[11]);

                                        player2locX = Integer.parseInt(arraysave[12]);
                                        player2locY = Integer.parseInt(arraysave[13]);

                                    }
                                } catch (FileNotFoundException e2) {
                                    throw new RuntimeException(e2);
                                }
                                count=3;
                            }
                            if(count == 3) {//opening file with save(continue)
                                g.drawImage(market, marketloc1x, marketloc1y, null);
                                g.drawImage(market, marketloc2x, marketloc2y, null);
                                g.drawImage(market, marketloc3x, marketloc3y, null);
                                g.drawImage(market, marketloc4x, marketloc4y, null);
                                g.drawImage(market, marketloc5x, marketloc5y, null);
                            }
                        }
                        if (map[i][j]== 11)
                            g.drawImage(zamin, i * 75 + 350, j * 75 + 150, null);
                        if (map[i][j] == 7)
                            g.drawImage(wall, i * 75 + 350, j * 75 + 150, null);
                        if (map[i][j] == 6)
                            g.drawImage(castle, i * 75 + 350, j * 75 + 150, null);
                        if (map[i][j] == -3)
                            g.drawImage(diamond, i * 75 + 350, j * 75 + 150, null);
                        if (map[i][j] == -800)
                            g.drawImage(cheraq, i * 75 + 350, j * 75 + 150, 75, 75, null);
                        if (map[i][j] == -700)
                            g.drawImage(taj, i * 75 + 350, j * 75 + 150, 75, 75, null);
                        if (map[i][j] == -600)
                            g.drawImage(javaherat, i * 75 + 350, j * 75 + 150, 75, 75, null);
                        if (map[i][j] == -500)
                            g.drawImage(halghe, i * 75 + 350, j * 75 + 150, 75, 75, null);
                        if (map[i][j] == -400)
                            g.drawImage(kafsh, i * 75 + 350, j * 75 + 150, 75, 75, null);
                        if (map[i][j] == -300)
                            g.drawImage(ayne, i * 75 + 350, j * 75 + 150, 75, 75, null);
                        if (map[i][j] == -200)
                            g.drawImage(sib, i * 75 + 350, j * 75 + 150, 75, 75, null);
                        if (map[i][j] == -100)
                            g.drawImage(chakme, i * 75 + 350, j * 75 + 150, 75, 75, null);
                        if (map[i][j] == -5)
                            g.drawImage(trap, i * 75 + 350, j * 75 + 150, null);
                    }

                    //changing turn and location of players
                    if(Scores.gameTurn == 1){
                        g.drawImage(playerimg1, player1locX, player1locY, 30, 80, null);
                        repaint();
                    }
                    else if(Scores.gameTurn == 2){
                        g.drawImage(playerimg2, player2locX, player2locY, 30, 80, null);
                        repaint();
                    }
                    repaint();
                }
                if (res == 1) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("images//res0.jpg");
                    g.drawImage(img2, 50, 50, 180, 270, null);
                }
                if (res == 2) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("images//res1.jpg");
                    g.drawImage(img2, 50, 50, 180, 270, null);
                }
                if (res == 3) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("images//res2.jpg");
                    g.drawImage(img2, 50, 50, 180, 270, null);
                }
                if (res == 4) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("images//res3.jpg");
                    g.drawImage(img2, 50, 50, 180, 270, null);
                }
                if (res == 5) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("images//res4.jpg");
                    g.drawImage(img2, 50, 50, 180, 270, null);
                }
                if (res == 6) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("images//res5.jpg");
                    g.drawImage(img2, 50, 50, 180, 270, null);
                }
                if (res == 7) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("images//res6.jpg");
                    g.drawImage(img2, 50, 50, 180, 270, null);
                }
                if (res == 8) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("images//res7.jpg");
                    g.drawImage(img2, 50, 50, 180, 270, null);
                }

                //show the name of players
                if (SetChar.ans==0) {
                    x1.setText(SetChar.player1name);
                    x1.setForeground(Color.red);
                    x1.setFont(new Font("MV Boli", Font.PLAIN, 30));
                    x1.setBounds(1757, 375, 200, 30);
                    x1.setSize(110, 30);
                    x2.setText(SetChar.player2name);
                    x2.setForeground(Color.blue);
                    x2.setFont(new Font("MV Boli", Font.PLAIN, 30));
                    x2.setBounds(1757, 795, 200, 20);
                    x2.setSize(110, 30);
                    if (SetChar.ans3==1) {//set name of player1 in position
                        x1.setText("player1");
                        x1.setForeground(Color.red);
                        x1.setFont(new Font("MV Boli", Font.PLAIN, 30));
                        x1.setBounds(1757, 375, 200, 30);
                        x1.setSize(110, 30);
                    }
                    if (SetChar.ans3 == 2) {//set name of player2 in position
                        x2.setText("player2");
                        x2.setForeground(Color.blue);
                        x2.setFont(new Font("MV Boli", Font.PLAIN, 30));
                        x2.setBounds(1757, 795, 200, 20);
                        x2.setSize(110, 30);
                    }
                    if (SetChar.ans3 == 3) {//set both
                        x2.setText("player2");
                        x2.setForeground(Color.blue);
                        x2.setFont(new Font("MV Boli", Font.PLAIN, 30));
                        x2.setBounds(1757, 795, 200, 20);
                        x2.setSize(110, 30);
                        x1.setText("player1");
                        x1.setForeground(Color.red);
                        x1.setFont(new Font("MV Boli", Font.PLAIN, 30));
                        x1.setBounds(1757, 375, 200, 30);
                        x1.setSize(110, 30);
                    }
                }
                //show the name of player
                if(SetChar.ans==1) {
                    x1.setText(SetChar.player2name);
                    x1.setForeground(Color.red);
                    x1.setFont(new Font("MV Boli", Font.PLAIN, 30));
                    x1.setBounds(1757, 375, 200, 30);
                    x1.setSize(110, 30);
                    x2.setText(SetChar.player1name);
                    x2.setForeground(Color.blue);
                    x2.setFont(new Font("MV Boli", Font.PLAIN, 30));
                    x2.setBounds(1757, 795, 200, 20);
                    x2.setSize(110, 30);
                    if (SetChar.ans3==2) {//set name of player2 in position
                        x1.setText("player2");
                        x1.setForeground(Color.red);
                        x1.setFont(new Font("MV Boli", Font.PLAIN, 30));
                        x1.setBounds(1757, 375, 200, 30);
                        x1.setSize(110, 30);
                    }
                    if (SetChar.ans3 == 1) {//set name of player1 in position
                        x2.setText("player1");
                        x2.setForeground(Color.blue);
                        x2.setFont(new Font("MV Boli", Font.PLAIN, 30));
                        x2.setBounds(1757, 795, 200, 20);
                        x2.setSize(110, 30);
                    }
                    if (SetChar.ans3 == 3) {//set both
                        x2.setText("player1");
                        x2.setForeground(Color.blue);
                        x2.setFont(new Font("MV Boli", Font.PLAIN, 30));
                        x2.setBounds(1757, 795, 200, 20);
                        x2.setSize(110, 30);
                        x1.setText("player2");
                        x1.setForeground(Color.red);
                        x1.setFont(new Font("MV Boli", Font.PLAIN, 30));
                        x1.setBounds(1757, 375, 200, 30);
                        x1.setSize(110, 30);
                    }
                }
                //getting Font
                Font font=new Font("serif", Font.PLAIN, 35);
                g.setFont(font);

                //showing score Board
                power1 = String.valueOf(Scores.weapon1);
                g.drawString(power1, 1550, 250);
                money1 = String.valueOf(Scores.money1);
                g.drawString(money1, 1550, 350);
                treasure1 = String.valueOf(Scores.score1);
                g.drawString(treasure1, 1550, 450);
                power2 = String.valueOf(Scores.weapon2);
                g.drawString(power2, 1550, 675);
                money2 = String.valueOf(Scores.money2);
                g.drawString(money2, 1550, 765);
                treasure2 = String.valueOf(Scores.score2);
                g.drawString(treasure2, 1550, 865);
            }
        });
        pack();
        addMouseListener(new Mouse1(this));
        sound.setBounds(10,10,35,35);
        dice.setBounds(1390, 100, 75, 76);
        timerPanel.setBounds(1730, 100, 175, 25);
        backA.setBounds(-30, 815, 400, 80);
        exitA.setBounds(-30, 900, 400, 80);
        this.add(dice);
        this.add(sound);
        this.add(timerPanel);
        this.add(exitA);
        this.add(backA);
        add(x1);
        add(x2);
        playerimg1 = new ImageIcon("images//IconGirl.PNG").getImage();
        playerimg2 = new ImageIcon("images//IconBoy.PNG").getImage();
        this.setBounds(0, 0, 3234, 2434);
        this.setLocationRelativeTo(null);

        //set Frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);

        ImageIcon img1 = new ImageIcon("images//Logo.jpeg");//set logo
        this.setIconImage(img1.getImage());

        this.setTitle("Travelling Sales Man ");//set title
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backA) {
            int ans1 = JOptionPane.showConfirmDialog(null, "Leave game and Back to menu?", "Attention", JOptionPane.YES_NO_CANCEL_OPTION);
            if (ans1 == 0) {
                JFrame now = (JFrame)
                        SwingUtilities.getWindowAncestor(backA);
                now.dispose();
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
            try {
                FileWriter save = new FileWriter("save.txt");
                String deta = MessageFormat.format("{0},{1},{2},{3},{4},{5},{6},{7},{8},{9},{10},{11},{12},{13},{14},{15} ", marketarray[0][0], marketarray[0][1], marketarray[1][0], marketarray[1][1], marketarray[2][0],
                        marketarray[2][1], marketarray[3][0], marketarray[3][1],marketarray[4][0] ,marketarray[4][1] ,player1locX , player1locY, player2locX , player1locY);
                save.write(deta);
                save.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            System.exit(0);
        }
    }
}