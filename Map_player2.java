package TSM;

import javax.swing.*;
import java.awt.*;

public class Map_player2 extends JFrame{
    Map_player2(){
        new MyFrame();
        Image market=Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\NNCU9563.PNG");
        Image wall=Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\UDQV7065.PNG");
//        Image wall=Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\UDQV7065.PNG");
        this.setContentPane(new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponents(g);
                for (int i = 0; i < 12; i++) {
                    for (int j = 0; j < 12; j++) {
                        if (Total_Map.map[i][j] == 7) {
                            g.drawImage(wall, i*140, j*70, 140, 70, null);
                        }
                    }
                }
                int x = Move2.x;
                int y = Move2.y;
                if (Total_Map.map[x][y] == 3) {
                    g.drawImage(null, x*140, y*70, 140, 70, null);
                }
                if (Total_Map.map[x][y] == 4) {
                    g.drawImage(market, x*140, y*70, 140, 70, null);
                }
                if (Total_Map.map[x][y] == 5) {
                    g.drawImage(null, x*140, y*70, 140, 70, null);
                }
                if (Total_Map.map[x][y] == 100) {
                    g.drawImage(null, x*140, y*70, 140, 70, null);
                }
                if (Total_Map.map[x][y] == 200) {
                    g.drawImage(null, x*140, y*70, 140, 70, null);
                }
                if (Total_Map.map[x][y] == 300) {
                    g.drawImage(null, x*140, y*70, 140, 70, null);
                }
                if (Total_Map.map[x][y] == 400) {
                    g.drawImage(null, x*140, y*70, 140, 70, null);
                }
                if (Total_Map.map[x][y] == 500) {
                    g.drawImage(null, x*140, y*70, 140, 70, null);
                }
                if (Total_Map.map[x][y] == 600) {
                    g.drawImage(null, x*140, y*70, 140, 70, null);
                }
                if (Total_Map.map[x][y] == 700) {
                    g.drawImage(null, x*140, y*70, 140, 70, null);
                }
                if (Total_Map.map[x][y] == 800) {
                    g.drawImage(null, x*140, y*70, 140, 70, null);
                }
            }
        });
    }
}