package TSM;

import javax.swing.*;
import java.awt.*;


import java.util.Random;

public  class Total_Map extends JPanel {
    Random rand = new Random();
    int x;
    int y;

    public static double[][] map = {
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
    Total_Map() {
        this.setPreferredSize(new Dimension(500,500));
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
        String money1= String.valueOf(Scores.money1);
        String money2= String.valueOf(Scores.money2);
        String score1= String.valueOf(Scores.score1);
        String score2= String.valueOf(Scores.score2);
        String weapon1=String.valueOf(Scores.weapon1);
        String weapon2=String.valueOf(Scores.weapon2);


//        ImageIcon img1 = new ImageIcon("F:\\my photoshops\\EZMW0610.JPEG");
//        this.setIconImage(img1.getImage());
//        this.setTitle("Travelling Sales Man ");
//        this.setBounds(600, 200, 300, 120);
//        this.setLocationRelativeTo(null);
//        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        this.setSize(1920, 1080);
//        this.setResizable(false);
    }
}
