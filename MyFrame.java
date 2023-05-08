package TSM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyFrame extends JFrame implements ActionListener {

    static JTextField x1;

    static JTextField  x2;
    JButton backA;
    JButton exitA;
    static Random rand = new Random();

    static int res = Math.abs(rand.nextInt() % 8)+1;

    int x;
    int y;

    public static int[][] map = {
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
    Image castle = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\ba4cf8fadc36757ac213b3b5803164551.png");
    Image back = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\BGGW7462.JPEG");

    Image market = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\earqe870i1cz14.jpg");
    Image zamin = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\earqe870i1cz13.jpg");
    Image wall = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\earqe870i1cz12.jpg");
    Image left = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\button\\left.PNG");
    Image right = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\button\\right.PNG");
    Image up = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\button\\up.PNG");
    Image down = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\button\\down.PNG");
    Image round = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG_2922.GIF");
    Image chakme = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG16.PNG");
    Image cheraq = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG15.PNG");
    Image halghe = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG11.PNG");
    Image taj = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG17.PNG");
    Image trap = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\BMXL64252.jpg");
    Image ayne = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG13.PNG");
    Image sib = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG14.PNG");
    Image javaherat = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG12.PNG");
    Image kafsh = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG10.PNG");
    Image diamond = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\UNIY1187.JPEG");

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
        SoundButton sound = new SoundButton("C:\\Users\\Asus\\Downloads\\Jungle (2).wav","F:\\my photoshops\\mute.jpg","F:\\my photoshops\\unmute.jpg");
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
                g.drawImage(back, 0, -50, 1920, 1080, null);
                g.drawImage(left, 20, 520, 100, 100, null);
                g.drawImage(right, 180, 520, 100, 100, null);
                g.drawImage(up, 100, 400, 100, 100, null);
                g.drawImage(down, 100, 640, 100, 100, null);
                g.drawImage(round,1500,100,75,75,null);
                repaint();
                for (int i = 0; i < 12; i++) {
                    for (int j = 0; j < 12; j++) {
                        if (map[i][j] == 4) {
                            g.drawImage(market, i * 75 + 350, j * 75 + 150, null);
                        }
                        if (map[i][j] != 7 && map[i][j] != 6 && map[i][j] != 4 && map[i][j] != 0)
                            g.drawImage(zamin, i * 75 + 350, j * 75 + 150, null);
                        if (map[i][j]==11)
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
                    Image img2 = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG2.jpg");
                    g.drawImage(img2, 50, 50, 180, 270, null);
                }
                if (res == 2) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG8.jpg");
                    g.drawImage(img2, 50, 50, 180, 270, null);
                }
                if (res == 3) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG7.jpg");
                    g.drawImage(img2, 50, 50, 180, 270, null);
                }
                if (res == 4) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG4.jpg");
                    g.drawImage(img2, 50, 50, 180, 270, null);
                }
                if (res == 5) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG1.jpg");
                    g.drawImage(img2, 50, 50, 180, 270, null);
                }
                if (res == 6) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG6.jpg");
                    g.drawImage(img2, 50, 50, 180, 270, null);
                }
                if (res == 7) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG3.jpg");
                    g.drawImage(img2, 50, 50, 180, 270, null);
                }
                if (res == 8) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG5.jpg");
                    g.drawImage(img2, 50, 50, 180, 270, null);
                }
//                if (SetChar.name1.getText()==""){
//                    x1.setText(SetChar.player1name);
//                }
//                if (SetChar.name2.getText()==""){
//                    x2.setText(SetChar.player2name);
//                }
//                if (SetChar.name1.getText()==null){
//                    x1.setText(SetChar.player1name);
//                }
//                if (SetChar.name2.getText()==null){
//                    x2.setText(SetChar.player2name);
//                }
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
                    if (SetChar.ans3==1) {
                        x1.setText("player1");
                        x1.setForeground(Color.red);
                        x1.setFont(new Font("MV Boli", Font.PLAIN, 30));
                        x1.setBounds(1757, 375, 200, 30);
                        x1.setSize(110, 30);
                    }
                    if (SetChar.ans3 == 2) {
                        x2.setText("player2");
                        x2.setForeground(Color.blue);
                        x2.setFont(new Font("MV Boli", Font.PLAIN, 30));
                        x2.setBounds(1757, 795, 200, 20);
                        x2.setSize(110, 30);
                    }
                    if (SetChar.ans3 == 3) {
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
                    if (SetChar.ans3==2) {
                        x1.setText("player2");
                        x1.setForeground(Color.red);
                        x1.setFont(new Font("MV Boli", Font.PLAIN, 30));
                        x1.setBounds(1757, 375, 200, 30);
                        x1.setSize(110, 30);
                    }
                    if (SetChar.ans3 == 1) {
                        x2.setText("player1");
                        x2.setForeground(Color.blue);
                        x2.setFont(new Font("MV Boli", Font.PLAIN, 30));
                        x2.setBounds(1757, 795, 200, 20);
                        x2.setSize(110, 30);
                    }
                    if (SetChar.ans3 == 3) {
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
                Font font=new Font("serif", Font.PLAIN, 35);
                g.setFont(font);
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
        //addMouseListener(new Mouse2(this));
        sound.setBounds(10,10,35,35);
        dice.setBounds(1390, 100, 75, 76);
        timerPanel.setBounds(1730, 100, 175, 25);
        backA.setBounds(-30, 815, 400, 80);
        exitA.setBounds(-30, 900, 400, 80);
        playerimg1 = new ImageIcon("F:\\my photoshops\\JZHO9321.PNG").getImage();
        playerimg2 = new ImageIcon("F:\\my photoshops\\TUGR3735.PNG").getImage();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.add(dice);
        this.add(sound);
        this.add(timerPanel);
        this.add(exitA);
        this.add(backA);
        add(x1);
        add(x2);
        ImageIcon img1 = new ImageIcon("F:\\my photoshops\\EZMW0610.jpeg");
        this.setIconImage(img1.getImage());
        this.setTitle("Travelling Sales Man ");
        this.setBounds(0, 0, 3234, 2434);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        this.setSize(3234, 2434);
//        this.setResizable(false);
    }

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


// private Total_Map total_map ;
//    JFrame frame ;
//    Total_Map total_map =new Total_Map() ;
//    Quete quete =new Quete();
//    private BufferedImage img ;
//    private BufferedImage playerbluem ;
//    private BufferedImage playerredm ;
//    private BufferedImage[] idlani;
//    private BufferedImage[] playerblue;
//    private BufferedImage[] playerred;
//    private int anitick , aniindex , anispeed = 20 , anired, anired1;
//
//    static int player1locX = 250 ;
//
//    static int player1locY = 150 ;
//    static int player2locX = 250 ;
//
//    static int player2locY = 150 ;
//
//    MyFrame(){
//        importimage();
//        loadanimation();
//        background = new ImageIcon("back.gif").getImage();
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setSize(1112 , 843);
//        this.setLocationRelativeTo(null);
//        this.setLayout(null);
//        this.setVisible(true);
//        this.add(total_map);
//        this.add(quete);
//    }
//
//    private void loadanimation() {
//        idlani = new BufferedImage[13];
//        playerblue = new BufferedImage[6];
//        playerred = new BufferedImage[6];
//        for (int i=0 ; i < idlani.length ; i++){
//            idlani[i]= img.getSubimage(i*3234, 0 , 3234 , 2434);
//        }
//        for (int i=0 ; i < playerblue.length ; i++){
//            playerblue[i]= playerbluem.getSubimage(i*747, 0 , 747 , 1300);
//        }
//        for (int i=0 ; i < playerred.length ; i++){
//            playerred[i]= playerredm.getSubimage(i*747, 0 , 747 , 1300);
//        }
//    }
//    private void importimage(){
//
//        player1 = new ImageIcon("player1.png").getImage();
//        player2 = new ImageIcon("player1.png").getImage();
//
//        try {
//            img = ImageIO.read(is);
//        }catch (IOException e){
//            throw new RuntimeException();
//        }finally {
//            try {
//                is.close();
//            }catch (IOException e){
//                e.printStackTrace();
//            }
//
//        }
//        //************
//        try {
//            playerbluem = ImageIO.read(dis);
//            playerredm = ImageIO.read(tis);
//        }catch (IOException e){
//            throw new RuntimeException();
//        }finally {
//            try {
//                dis.close();
//            }catch (IOException e){
//                e.printStackTrace();
//            }
//
//        }
//        //***********
//    }
//    private void updateanimationtic() {
//        anitick++ ;
//        if(anitick >= anispeed){
//            anitick = 0 ;
//            aniindex++;
//            anired++;
//            anired1++;
//            if(aniindex >= idlani.length){
//                aniindex=0;
//            }
//            if(anired >= playerblue.length) {
//                anired = 0;
//            }
//            if(anired >= playerred.length){
//                anired=0;
//            }
//        }
//    }
//
//    public void paint(Graphics g){
//
//        g.setColor(new Color( 0,0,0));
//        //g.drawOval(100 , 100 , 200 , 200);
//        updateanimationtic();
//        g.drawImage(idlani[aniindex] , 0 , 0 , 1920 , 1080 ,  null);
//      //  g.drawImage(playerblue[anired] , 150 , 700 , 50 , 50 ,  null);
//        g.drawImage(player1 , player1locX , player1locY , 50 , 50 ,null );
//        g.drawImage(player2 , player2locX , player2locY , 50 , 50 ,null );
//
//      //  g.drawImage(background, 0,0,1112 , 843 , null);
//
//        updateanimationtic();
//        repaint();
//
//    }
