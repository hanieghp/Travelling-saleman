package TSM;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouse1 extends JFrame implements MouseListener {

    Image chakme = Toolkit.getDefaultToolkit().getImage("IMG16.PNG");
    Image cheraq = Toolkit.getDefaultToolkit().getImage("IMG15.PNG");
    Image halghe = Toolkit.getDefaultToolkit().getImage("IMG11.PNG");
    Image taj = Toolkit.getDefaultToolkit().getImage("IMG17.PNG");
    Image trap = Toolkit.getDefaultToolkit().getImage("BMXL64252.jpg");
    Image ayne = Toolkit.getDefaultToolkit().getImage("IMG13.PNG");
    Image sib = Toolkit.getDefaultToolkit().getImage("IMG14.PNG");
    Image javaherat = Toolkit.getDefaultToolkit().getImage("IMG12.PNG");
    Image kafsh = Toolkit.getDefaultToolkit().getImage("IMG10.PNG");

    int x=1, y=10;
    MyFrame myFrame;

    public Mouse1(MyFrame myFrame) {
        this.myFrame = myFrame;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        int tas = Dice.result;
        System.out.println(tas);
        while(tas != 0) {
        if (e.getX() > 40 && e.getX() < 140 && e.getY() > 520 && e.getY() < 620) {
            if (MyFrame.map[x - 1][y] != 0 && MyFrame.map[x - 1][y] != 7) {
                myFrame.player1locX -= 75;
                x -= 1;
                tas--;
                System.out.println("Down" + MyFrame.player1locX);
            }
        }if (e.getX() > 200 && e.getX() < 300 && e.getY() > 520 && e.getY() < 620) {
            if (MyFrame.map[x + 1][y] != 0 && MyFrame.map[x + 1][y] != 7) {
                myFrame.player1locX += 75;
                x += 1;
                tas--;
                System.out.println("up");
            }
        }if (e.getX() > 120 && e.getX() < 220 && e.getY() > 440 && e.getY() < 540) {
            if (MyFrame.map[x][y - 1] != 0 && MyFrame.map[x][y - 1] != 7) {
                myFrame.player1locY -= 75;
                y -= 1;
                tas--;
                System.out.println("left");
            }
        }if (e.getX() > 120 && e.getX() < 220 && e.getY() > 600 && e.getY() < 700) {
            if (MyFrame.map[x][y + 1] != 0 && MyFrame.map[x][y + 1] != 7) {
                myFrame.player1locY += 75;
                y += 1;
                tas--;
                System.out.println("right");
            }
        }
        }
        if (MyFrame.map[x][y] == 5) {
            Scores.money1 -= 50;
            this.setContentPane(new JPanel() {
                @Override
                public void paintComponent(Graphics g) {
                    g.drawImage(trap, x * 75 + 250, y * 75 + 150, null);
                }
            });
            pack();
        }
        if (MyFrame.map[x][y] == 100) {
            Scores.score1 += 100;
            this.setContentPane(new JPanel() {
                @Override
                public void paintComponent(Graphics g) {
                    g.drawImage(chakme, x * 75 + 250, y * 75 + 150, null);
                }
            });
            pack();
        }
        if (MyFrame.map[x][y] == 300) {
            Scores.score1 += 300;
            this.setContentPane(new JPanel() {
                @Override
                public void paintComponent(Graphics g) {
                    g.drawImage(ayne, x * 75 + 250, y * 75 + 150, null);
                }
            });
            pack();
        }
        if (MyFrame.map[x][y] == 200) {
            Scores.score1 += 200;
            this.setContentPane(new JPanel() {
                @Override
                public void paintComponent(Graphics g) {
                    g.drawImage(sib, x * 75 + 250, y * 75 + 150, null);
                }
            });
            pack();
        }
        if (MyFrame.map[x][y] == 400) {
            Scores.score1 += 400;
            this.setContentPane(new JPanel() {
                @Override
                public void paintComponent(Graphics g) {
                    g.drawImage(kafsh, x * 75 + 250, y * 75 + 150, null);
                }
            });
            pack();
        }
        if (MyFrame.map[x][y] == 500) {
            Scores.score1 += 500;
            this.setContentPane(new JPanel() {
                @Override
                public void paintComponent(Graphics g) {
                    g.drawImage(halghe, x * 75 + 250, y * 75 + 150, null);
                }
            });
            pack();
        }
        if (MyFrame.map[x][y] == 600) {
            Scores.score1 += 600;
            this.setContentPane(new JPanel() {
                @Override
                public void paintComponent(Graphics g) {
                    g.drawImage(javaherat, x * 75 + 250, y * 75 + 150, null);
                }
            });
            pack();
        }
        if (MyFrame.map[x][y] == 700) {
            Scores.score1 += 700;
            this.setContentPane(new JPanel() {
                @Override
                public void paintComponent(Graphics g) {
                    g.drawImage(taj, x * 75 + 250, y * 75 + 150, null);
                }
            });
            pack();
        }
        if (MyFrame.map[x][y] == 800) {
            Scores.score1 += 800;
            this.setContentPane(new JPanel() {
                @Override
                public void paintComponent(Graphics g) {
                    g.drawImage(cheraq, x * 75 + 250, y * 75 + 150, null);
                }
            });
            pack();
        }
        if (MyFrame.map[x][y] == 4) {
            new Market1();
        }
        if (myFrame.player1locX == myFrame.player2locX && myFrame.player1locY == myFrame.player2locY) {
            if (Scores.weapon1 > Scores.weapon2)
                new Fight1();
            else
                new Fight2();
        }
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