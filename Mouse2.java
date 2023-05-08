package TSM;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouse2 extends JFrame implements MouseListener {

    Image chakme = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG16.PNG");
    Image cheraq = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG15.PNG");
    Image halghe = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG11.PNG");
    Image taj = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG17.PNG");
    Image trap = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\BMXL64252.jpg");
    Image ayne = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG13.PNG");
    Image sib = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG14.PNG");
    Image javaherat = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG12.PNG");
    Image kafsh = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG10.PNG");

    int x=1, y=10;
    MyFrame myFrame;
    public static int player = 1;

    public Mouse2(MyFrame myFrame) {
        this.myFrame = myFrame;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        int value=Dice.value;
//        while (value!=0) {
        if (e.getX() > 40 && e.getX() < 140 && e.getY() > 370 && e.getY() < 470) {
            if (MyFrame.map[x - 1][y] != 0 && MyFrame.map[x - 1][y] != 7) {
                myFrame.player2locX -= 75;
                x -= 1;
                    value--;
                    if (value==0){
                        Scores.gameTurn=1;
                    }
            }
        } else if (e.getX() > 200 && e.getX() < 300 && e.getY() > 370 && e.getY() < 470) {
            if (MyFrame.map[x + 1][y] != 0 && MyFrame.map[x + 1][y] != 7) {
                myFrame.player2locX += 75;
                x += 1;
                value--;
                if (value==0)
                    Scores.gameTurn=1;
            }
        } else if (e.getX() > 120 && e.getX() < 220 && e.getY() > 290 && e.getY() < 390) {
            if (MyFrame.map[x][y - 1] != 0 && MyFrame.map[x][y - 1] != 7) {
                myFrame.player2locY -= 75;
                y -= 1;
                value--;
                if (value==0)
                    Scores.gameTurn=1;
            }
        } else if (e.getX() > 120 && e.getX() < 220 && e.getY() > 450 && e.getY() < 550) {
                if (MyFrame.map[x][y + 1] != 0 && MyFrame.map[x][y + 1] != 7) {
                    myFrame.player2locY += 75;
                    y += 1;
                    value--;
                    if (value==0)
                        Scores.gameTurn=1;
                }
            }
//        }
        this.setContentPane(new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                if (MyFrame.map[x][y] == 5) {
                    Scores.money1 -= 50;
                    g.drawImage(trap, x * 75 + 250, y * 75 + 150, null);
                }
                if (MyFrame.map[x][y] == 100) {
                    Scores.score1 += 100;
                    g.drawImage(chakme, x * 75 + 250, y * 75 + 150, null);
                }
                if (MyFrame.map[x][y] == 200) {
                    Scores.score1 += 200;
                    g.drawImage(sib, x * 75 + 250, y * 75 + 150, null);
                }
                if (MyFrame.map[x][y] == 300) {
                    Scores.score1 += 300;
                    g.drawImage(ayne, x * 75 + 250, y * 75 + 150, null);
                }
                if (MyFrame.map[x][y] == 400) {
                    Scores.score1 += 400;
                    g.drawImage(kafsh, x * 75 + 250, y * 75 + 150, null);
                }
                if (MyFrame.map[x][y] == 500) {
                    Scores.score1 += 500;
                    g.drawImage(halghe, x * 75 + 250, y * 75 + 150, null);
                }
                if (MyFrame.map[x][y] == 600) {
                    Scores.score1 += 600;
                    g.drawImage(javaherat, x * 75 + 250, y * 75 + 150, null);
                }
                if (MyFrame.map[x][y] == 700) {
                    Scores.score1 += 700;
                    g.drawImage(taj, x * 75 + 250, y * 75 + 150, null);
                }
                if (MyFrame.map[x][y] == 800) {
                    Scores.score1 += 800;
                    g.drawImage(cheraq, x * 75 + 250, y * 75 + 150, null);
                }
            }
        });
        if (MyFrame.map[x][y] == 4) {
            new Market1();
        }
        if (myFrame.player1locX == myFrame.player2locX && myFrame.player1locY == myFrame.player2locY) {
            if (Scores.weapon1 > Scores.weapon2)
                new Fight1();
            else
                new Fight2();
        }
        Scores.gameTurn = 2;
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}