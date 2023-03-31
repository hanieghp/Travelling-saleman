package TSM;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Map  extends JFrame {

    Image img=Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\HRGY6605.JPEG");

    Map(){
        this.setContentPane(new JPanel(){

            @Override
            public void paintComponent(Graphics g){
                int [][] map={
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 1, 1, 1, 1, 1, 1, 1 ,1, 1, 1, 0},
                        {0, 1, 1, 1, 1, 1, 1, 1 ,1, 1, 1, 0},
                        {0, 1, 1, 1, 1, 1, 1, 1 ,1, 1, 1, 0},
                        {0, 1, 1, 1, 1, 1, 1, 1 ,1, 1, 1, 0},
                        {0, 1, 1, 1, 1, 1, 1, 1 ,1, 1, 1, 0},
                        {0, 1, 1, 1, 1, 6, 1, 1 ,1, 1, 1, 0},
                        {0, 1, 1, 1, 1, 1, 1, 1 ,1, 1, 1, 0},
                        {0, 1, 1, 1, 1, 1, 1, 1 ,1, 1, 1, 0},
                        {0, 1, 1, 1, 1, 1, 1, 1 ,1, 1, 1, 0},
                        {0, 1, 1, 1, 1, 1, 1, 1 ,1, 1, 1, 0},
                        {10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                };
                Random rand=new Random();
                int x;
                int y;
                for (int i = 0; i < 1; i++) {
                    x = Math.abs((rand.nextInt() % 5))+1;
                    y = Math.abs((rand.nextInt() % 2))+10;
                    if (map[x][y] == 1) {
                        map[x][y] = 2; //treasure
                    }
                    else i--;
                }
                for (int i = 0; i < 1; i++) {
                    x = Math.abs((rand.nextInt() % 5))+1;
                    y = Math.abs((rand.nextInt() % 3))+7;
                    if (map[x][y] == 1) {
                        map[x][y] = 2; //treasure
                    }
                    else i--;
                }
                for (int i = 0; i < 1; i++) {
                    x = Math.abs((rand.nextInt() % 5))+1;
                    y = Math.abs((rand.nextInt() % 3))+1;
                    if (map[x][y] == 1) {
                        map[x][y] = 2; //treasure
                    }
                    else i--;
                }
                for (int i = 0; i < 1; i++) {
                    x = Math.abs((rand.nextInt() % 5))+1;
                    y = Math.abs((rand.nextInt() % 3))+4;
                    if (map[x][y] == 1) {
                        map[x][y] = 2; //treasure
                    }
                    else i--;
                }
                for (int i = 0; i < 1; i++) {
                    x = Math.abs((rand.nextInt() % 5))+6;
                    y = Math.abs((rand.nextInt() % 2))+10;
                    if (map[x][y] == 1) {
                        map[x][y] = 2; //treasure
                    }
                    else i--;
                }
                for (int i = 0; i < 1; i++) {
                    x = Math.abs((rand.nextInt() % 5))+6;
                    y = Math.abs((rand.nextInt() % 3))+7;
                    if (map[x][y] == 1) {
                        map[x][y] = 2; //treasure
                    }
                    else i--;
                }
                for (int i = 0; i < 1; i++) {
                    x = Math.abs((rand.nextInt() % 5))+6;
                    y = Math.abs((rand.nextInt() % 3))+1;
                    if (map[x][y] == 1) {
                        map[x][y] = 2; //treasure
                    }
                    else i--;
                }
                for (int i = 0; i < 1; i++) {
                    x = Math.abs((rand.nextInt() % 5))+6;
                    y = Math.abs((rand.nextInt() % 3))+4;
                    if (map[x][y] == 1) {
                        map[x][y] = 2; //treasure
                    }
                    else i--;
                }
                for (int i = 0; i <13; i++) {
                    x = Math.abs(rand.nextInt() % 10)+ 1;
                    y = Math.abs((rand.nextInt() % 10))+ 1;
                    if (map[x][y] == 1) {
                        map[x][y] = 3; //lost Precious
                    }
                    else i--;
                }
                for (int i = 0; i < 5; i++) {
                    x = Math.abs((rand.nextInt() % 10))+ 1;
                    y = Math.abs((rand.nextInt() % 10))+ 1;
                    if (map[x][y] == 1) {
                        map[x][y] = 7; //wall
                    }
                }
                for (int i = 0; i < 5; i++) {
                    x = Math.abs(rand.nextInt() % 10) + 1;
                    y = Math.abs(rand.nextInt() % 10) + 1;
                    if (map[x][y] == 1) {
                        map[x][y] = 4; //market
                    }
                    else i--;
                }
                int j = Math.abs(rand.nextInt() % 5) + 2;
                for (int i = 0; i < j; i++) {
                    x = Math.abs(rand.nextInt() % 10) + 1;
                    y = Math.abs(rand.nextInt() % 10) + 1;
                    if (map[x][y] == 1) {
                        map[x][y] = 5; //trap
                    }
                    else i--;
                }
                super.paintComponents(g);
                g.drawImage(img, -1000, -1200, null);
                int i;
                for(i=1 ; i<11 ; i++){
                    for (j=1 ; j<11 ; j++) {
                        if (map[i][j] == 1) {
                            Image img=Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\earqe870i1cz13.jpg");
                            g.drawImage(img, i*75+250, j*75+150, null);
                        }
                        if (map[i][j] == 2) {
                            Image img=Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IBPX3526.JPEG");
                            g.drawImage(img, i*75+250, j*75+150, null);
                        }
                        if (map[i][j] == 3) {
                            Image img=Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\UNIY1187.JPEG");
                            g.drawImage(img, i*75+247, j*75+150, null);
                        }
                        if (map[i][j] == 4) {
                            Image img=Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\earqe870i1cz14.jpg");
                            g.drawImage(img, i*75+250, j*75+150, null);
                        }
                        if (map[i][j] == 5) {
                            Image img=Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\BMXL64252.jpg");
                            g.drawImage(img, i*75+250, j*75+150, null);
                        }
                        if (map[i][j] == 6) {
                            Image img=Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\ba4cf8fadc36757ac213b3b5803164551.png");
                            g.drawImage(img, i*75+247, j*75+150, null);
                        }
                        if (map[i][j] == 7) {
                            Image img=Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\earqe870i1cz12.jpg");
                            g.drawImage(img, i*75+250, j*75+150, null);
                        }
                        if(map[i][j]==10){
                            Image img=Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\ba4cf8fadc36757ac213b3b5803164551.png");
                            g.drawImage(img, i*75+250, j*75+150, null);
                        }
                    }
                }
            }
        });
        pack();
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Travelling Sales Man ");
        this.setBounds(600, 200, 300, 120);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton b1 = new JButton("Exit");
        b1.addActionListener(e -> this.setVisible(false));
        b1.setBounds(790, 560, 300, 55);
        ImageIcon img1=new ImageIcon("F:\\my photoshops\\EZMW0610.JPEG");
        this.setIconImage(img1.getImage());
    }
}
