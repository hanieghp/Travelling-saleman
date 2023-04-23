package TSM;

import javax.swing.*;
import java.awt.*;

public class Castle1 extends JFrame {
    static JTextField getX;
    static JTextField getY;

    Castle1() {
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
                    Scores.score1+=1;
                    this.setVisible(false);
                }
                else{
                    Move1.x=0;
                    Move1.y=0;
                    this.setVisible(false);
                }
            }
        });
    }
}
