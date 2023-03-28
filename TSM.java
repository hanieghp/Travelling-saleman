import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class TSM extends  javax.swing.JFrame {
    static int[][] map={
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
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    };
    JFrame f=new JFrame();
    Image img=Toolkit.getDefaultToolkit().getImage("F:\\my photoshots");

    TSM(){
        this.setContentPane(new JPanel(){
            public void paintComponent(Graphics g){
                super.paintComponents(g);
                for(int i=1 ; i<11 ; i++){
                    for (int j=1 ; j<11 ; j++) {
                        if (map[i][j] == 1) {
                            g.setColor(Color.GRAY);
                            g.fill3DRect(i*390/4, j*270/4, 390/4, 270/4, true);
                        }
                        if (map[i][j] == 2) {
                            g.setColor(Color.GREEN);
                            g.fill3DRect(i*390/4, j*270/4, 390/4, 270/4, true);
                        }
                        if (map[i][j] == 3) {
                            g.setColor(Color.BLUE);
                            g.fill3DRect(i*390/4, j*270/4, 390/4, 270/4, true);
                        }
                        if (map[i][j] == 4) {
                            g.setColor(Color.ORANGE);
                            g.fill3DRect(i*390/4, j*270/4, 390/4, 270/4, true);
                        }
                        if (map[i][j] == 5) {
                            g.setColor(Color.RED);
                            g.fill3DRect(i*390/4, j*270/4, 390/4, 270/4, true);
                        }
                        if (map[i][j] == 6) {
                            g.setColor(Color.YELLOW);
                            g.fill3DRect(i*390/4, j*270/4, 390/4, 270/4, true);
                        }
                        if (map[i][j] == 7) {
                            g.setColor(Color.BLACK);
                            g.fill3DRect(i*390/4, j*270/4, 390/4, 270/4, true);
                        }
                    }
                }
            }
        });
        JButton b=new JButton("Start");
        JButton b1=new JButton("exit");
        b1.addActionListener(e -> f.setVisible(false));
        b.setBounds(1200,500,600,150);
        b1.setBounds(1200,700,600,150);
        f.add(b);
        f.add(b1);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        pack();
        setVisible(true);
        setSize(600, 600);
    }


    public static void main(String[] args){
        new TSM();
        JFrame f=new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Random rand = new Random();
        int x=0;
        int y=0;
        for (int i = 0; i < 2; i++) {
            x = Math.abs((rand.nextInt() % 5))+1;
            y = Math.abs((rand.nextInt() % 5))+1;
            if (map[x][y] == 1) {
                map[x][y] = 2; //treasure
            }
        }
        for (int i = 0; i < 2; i++) {
            x = Math.abs((rand.nextInt() % 5))+6;
            y = Math.abs((rand.nextInt() % 5))+1;
            if (map[x][y] == 1) {
                map[x][y] = 2; //treasure
            }
        }
        for (int i = 0; i < 2; i++) {
            x = Math.abs((rand.nextInt() % 5))+1;
            y = Math.abs((rand.nextInt() % 5))+6;
            if (map[x][y] == 1) {
            map[x][y] = 2; //treasure
            }}
        for (int i = 0; i < 2; i++) {
            x = Math.abs((rand.nextInt() % 5))+6;
            y = Math.abs((rand.nextInt() % 5))+6;
            if (map[x][y] == 1) {
                map[x][y] = 2; //treasure
            }
        }
        for (int i = 0; i <13; i++) {
            x = Math.abs(rand.nextInt() % 10) + 1;
            y = Math.abs(rand.nextInt() % 10) + 1;
            if (map[x][y] == 1) {
                map[x][y] = 3; //lost Precious
            }
        }
        for (int i = 0; i < 5; i++) {
            x = Math.abs(rand.nextInt() % 10) + 1;
            y = Math.abs(rand.nextInt() % 10) + 1;
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
        }
        int j = Math.abs(rand.nextInt() % 5) + 1;
        for (int i = 0; i < j; i++) {
            x = Math.abs(rand.nextInt() % 10) + 1;
            y = Math.abs(rand.nextInt() % 10) + 1;
            if (map[x][y] == 1) {
                map[x][y] = 5; //trap
            }
        }
        
    }
}
