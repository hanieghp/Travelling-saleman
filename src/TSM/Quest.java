package TSM;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Quest extends JFrame{
    static Random rand=new Random();
    static int res = Math.abs(rand.nextInt() % 8);
    Quest() {
        this.setContentPane(new JPanel(){
            @Override
            public void paintComponent(Graphics g){
                super.paintComponent(g);

                //quest which should find
                if (res == 0) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("images//res0.jpg");

                }
                if (res == 1) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("images//res1.jpg");
                    g.drawImage(img2, 1700, 50, 180, 270, null);
                }
                if (res == 2) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("images//res2.jpg");
                    g.drawImage(img2, 1700, 50, 180, 270, null);
                }
                if (res == 3) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("images//res3.jpg");
                    g.drawImage(img2, 1700, 50, 180, 270, null);
                }
                if (res == 4) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("images//res4.jpg");
                    g.drawImage(img2, 1700, 50, 180, 270, null);
                }
                if (res == 5) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("images//res5.jpg");
                    g.drawImage(img2, 1700, 50, 180, 270, null);
                }
                if (res == 6) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("images//res6.jpg");
                    g.drawImage(img2, 1700, 50, 180, 270, null);
                }
                if (res == 7) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("images//res7.jpg");
                    g.drawImage(img2, 1700, 50, 180, 270, null);
                }
            }
        });
        pack();

        //set Frame
        this.setVisible(true);
        this.setSize(1920,1080);
        this.setResizable(false);
    }
}

