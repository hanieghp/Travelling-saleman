package TSM;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Move1 extends JFrame implements KeyListener {
    JLabel label;
    ImageIcon icon;
    Move1(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);
        icon=new ImageIcon("F:\\my photoshops\\IMG_1961.PNG");
        label=new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setIcon(icon);

        this.add(label);
        this.setVisible(true);
    }
    static int x=0, y=0;
    int value1=Dice.value;
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        while (value1!=0) {
            x+=label.getX()/140;
            y+=label.getY()/70;
            switch (e.getKeyCode()) {
                case 37:
                    if (Total_Map.map[x][y] != 7 && Total_Map.map[x][y] != 0) {
                        label.setLocation(label.getX() - 140, label.getY());
                        break;//left
                    }
                case 38:
                    if (Total_Map.map[x][y] != 7 && Total_Map.map[x][y] != 0) {
                        label.setLocation(label.getX(), label.getY() - 70);
                        break;//down
                    }
                case 39:
                    if (Total_Map.map[x][y] != 7 && Total_Map.map[x][y] != 0) {
                        label.setLocation(label.getX() + 140, label.getY());
                        break;//right
                    }
                case 40:
                    if (Total_Map.map[x][y] != 7 && Total_Map.map[x][y] != 0) {
                        label.setLocation(label.getX(), label.getY() + 70);
                        break;//up
                    }
            }
            value1--;
        }
        int x=label.getX()/140;
        int y=label.getY()/70;

        if(Total_Map.map[x][y]==3){
            Scores.money1+=50;
        }
        if(Total_Map.map[x][y]==4){
            //market
        }
        if(Total_Map.map[x][y]==5){
            Scores.money1-=50;
        }
        if(Total_Map.map[x][y]==100){
            Scores.score1+=100;
        }
        if(Total_Map.map[x][y]==200){
            Scores.score1+=200;
        }
        if(Total_Map.map[x][y]==300){
            Scores.score1+=300;
        }
        if(Total_Map.map[x][y]==400){
            Scores.score1+=400;
        }
        if(Total_Map.map[x][y]==500){
            Scores.score1+=500;
        }
        if(Total_Map.map[x][y]==600){
            Scores.score1+=600;
        }
        if(Total_Map.map[x][y]==700){
            Scores.score1+=700;
        }
        if(Total_Map.map[x][y]==800){
            Scores.score1+=800;
        }
        if(label.getX()==Move2.label.getX() && label.getY()==Move2.label.getY()){
            if(Scores.weapon1>Scores.weapon2)
                new Fight1();
            else
                new Fight2();
        }
        Scores.gameTurn=2;
    }
    @Override
    public void keyReleased (KeyEvent e){

    }
}