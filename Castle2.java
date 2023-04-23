package TSM;

import javax.swing.*;
import java.awt.*;

public class Castle2 extends JFrame {
    static JTextField getX;
    static JTextField getY;

    Castle2() {
        new Castle2();
        getX = new JTextField();
        getY = new JTextField();
        this.setContentPane(new JPanel(){
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponents(g);
                getX.setBounds(255, 240, 190, 63);
                getY.setBounds(255, 440, 190, 63);

                int x = Integer.parseInt(getX.getText());
                int y = Integer.parseInt(getY.getText());

                if(Total_Map.map[x][y]==Quete.res){
                    Scores.score2+=1;
                    this.setVisible(false);
                }
                else{
                    Move2.x=0;
                    Move2.y=0;
                    this.setVisible(false);
                }
            }
        });
    }
}
