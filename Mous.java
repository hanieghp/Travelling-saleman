package TSM;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mous implements MouseListener {
    int x=1, y=1;
    MyFrame myFrame;

    public Mous(MyFrame myFrame) {
        this.myFrame = myFrame;
    }
//    int value1=Dice.value;
    @Override
    public void mouseClicked(MouseEvent e) {
        for(int i = Dice.value ; i > 0 ; i--) {
            if (e.getX() > 100 && e.getX() < 150 && e.getY() > 900 && e.getY() < 950) {
                x -= 1;
                if (myFrame.map[x][y] != 0) {
                    myFrame.player1locX -= 75;
                } else
                    x += 1;
            }
            else if (e.getX() > 170 && e.getX() < 220 && e.getY() > 900 && e.getY() < 950) {
                x += 1;
                if (myFrame.map[x][y] != 0) {
                    myFrame.player1locX += 75;
                } else
                    x -= 1;
            }
            else if (e.getX() > 135 && e.getX() < 185 && e.getY() > 850 && e.getY() < 900) {
                y += 1;
                if (myFrame.map[x][y] != 0) {
                    myFrame.player1locY -= 75;
                } else
                    y -= 1;
            }
            else if (e.getX() > 135 && e.getX() < 185 && e.getY() > 950 && e.getY() < 1000) {
                y += 1;
                if (myFrame.map[x][y] != 0) {
                    myFrame.player1locY += 75;
                } else
                    y -= 1;
            }
        }
        if (MyFrame.map[x][y] == 4) {
            new Market1();
        }
        if (MyFrame.map[x][y] == 5) {
            Scores.money1 -= 50;
//            this.setContentPane(new JPanel(){
//                @Override
//                public void paintComponent(Graphics g) {
//                    g.drawImage(trap,x*75+250, y*75+150,null);
//                }
//            });
        }
        if (MyFrame.map[x][y] == 100) {
            Scores.score1 += 100;
//            this.setContentPane(new JPanel(){
//                @Override
//                public void paintComponent(Graphics g) {
//                    g.drawImage(chakme,x*75+250, y*75+150,null);
//                }
//            });
        }
        if (MyFrame.map[x][y] == 200) {
            Scores.score1 += 200;
//            this.setContentPane(new JPanel(){
//                @Override
//                public void paintComponent(Graphics g) {
//                    g.drawImage(sib,x*75+250, y*75+150,null);
//                }
//            });
        }
        if (MyFrame.map[x][y] == 300) {
            Scores.score1 += 300;
//            this.setContentPane(new JPanel(){
//                @Override
//                public void paintComponent(Graphics g) {
//                    g.drawImage(ayne,x*75+250, y*75+150,null);
//                }
//            });
        }
        if (MyFrame.map[x][y] == 400) {
            Scores.score1 += 400;
//            this.setContentPane(new JPanel(){
//                @Override
//                public void paintComponent(Graphics g) {
//                    g.drawImage(kafsh, x* 75 + 250, y * 75 + 150, null);
//                }
//            });
        }
        if (MyFrame.map[x][y] == 500) {
            Scores.score1 += 500;
//            this.setContentPane(new JPanel(){
//                @Override
//                public void paintComponent(Graphics g) {
//                    g.drawImage(halghe,x*75+250, y*75+150,null);
//                }
//            });
        }
        if (MyFrame.map[x][y] == 600) {
            Scores.score1 += 600;
//            this.setContentPane(new JPanel(){
//                @Override
//                public void paintComponent(Graphics g) {
//                    g.drawImage(javaherat,x*75+250, y*75+150,null);
//                }
//            });
        }
        if (MyFrame.map[x][y] == 700) {
            Scores.score1 += 700;
//            this.setContentPane(new JPanel(){
//                @Override
//                public void paintComponent(Graphics g) {
//                    g.drawImage(taj,x*75+250, y*75+150,null);
//                }
//            });
        }
        if (MyFrame.map[x][y] == 800) {
            Scores.score1 += 800;
//            this.setContentPane(new JPanel(){
//                @Override
//                public void paintComponent(Graphics g) {
//                    g.drawImage(cheraq,x*75+250, y*75+150,null);
//                }
//            });
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