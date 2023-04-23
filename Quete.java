package TSM;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Quete extends JFrame{
    Random rand=new Random();
    int res = Math.abs(rand.nextInt() % 8);
    Quete() {
        this.setContentPane(new JPanel(){
            @Override
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                if (res == 0) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG2.jpg");
                    g.drawImage(img2, 1700, 50, 180, 270, null);
                }
                if (res == 1) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG8.jpg");
                    g.drawImage(img2, 1700, 50, 180, 270, null);
                }
                if (res == 2) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG7.jpg");
                    g.drawImage(img2, 1700, 50, 180, 270, null);
                }
                if (res == 3) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG4.jpg");
                    g.drawImage(img2, 1700, 50, 180, 270, null);
                }
                if (res == 4) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG1.jpg");
                    g.drawImage(img2, 1700, 50, 180, 270, null);
                }
                if (res == 5) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG6.jpg");
                    g.drawImage(img2, 1700, 50, 180, 270, null);
                }
                if (res == 6) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG3.jpg");
                    g.drawImage(img2, 1700, 50, 180, 270, null);
                }
                if (res == 7) {
                    Image img2 = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG5.jpg");
                    g.drawImage(img2, 1700, 50, 180, 270, null);
                }
            }
        });
        pack();
        this.setVisible(true);
        this.setSize(1920,1080);
        this.setResizable(false);
    }
}
