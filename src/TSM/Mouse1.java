package TSM;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouse1 extends JFrame implements MouseListener {
    static int []treasures = new int[8];
    static int []treasures2 = new int[8];

    static int x1=1;
    static int y1=10;
    static int x2=1;
    static int y2=10;
    MyFrame myFrame;

    public Mouse1(MyFrame myFrame) {
        this.myFrame = myFrame;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        //click on button  left
        if (e.getX() > 20 && e.getX() < 120 && e.getY() > 520 && e.getY() < 620 && Dice.result != 0) {
            if(Scores.gameTurn == 1) {
                if (MyFrame.map[x1 - 1][y1] != 0 && MyFrame.map[x1 - 1][y1] != 7 && MyFrame.map[x1 - 1][y1] != -9) {
                    x1 -= 1;
                    if (MyFrame.map[x1][y1] == 1)
                        MyFrame.map[x1][y1] = -9;
                    myFrame.player1locX -= 75;
                }
            }
            if (Scores.gameTurn == 2) {
                if (MyFrame.map[x2 - 1][y2] != 0 && MyFrame.map[x2 - 1][y2] != 7 && MyFrame.map[x2 - 1][y2] != -9) {
                    x2 -= 1;
                    if (MyFrame.map[x2][y2] == 1)
                        MyFrame.map[x2][y2] = -9;
                    myFrame.player2locX -= 75;
                }
            }
            Dice.result--;
        }

        //click on button right
        else if (e.getX() > 180 && e.getX() < 280 && e.getY() > 520 && e.getY() < 620 && Dice.result != 0) {
            if(Scores.gameTurn == 1) {
                if (MyFrame.map[x1 + 1][y1] != 0 && MyFrame.map[x1 + 1][y1] != 7 && MyFrame.map[x1 + 1][y1] != -9) {
                    x1 += 1;
                    if (MyFrame.map[x1][y1] == 1)
                        MyFrame.map[x1][y1] = -9;
                    myFrame.player1locX += 75;
                }
            }
            if (Scores.gameTurn == 2){
                if (MyFrame.map[x2 + 1][y2] != 0 && MyFrame.map[x2 + 1][y2] != 7 && MyFrame.map[x2 + 1][y2] != -9) {
                    x2 += 1;
                    if (MyFrame.map[x2][y2] == 1)
                        MyFrame.map[x2][y2] = -9;
                    myFrame.player2locX += 75;
                }
            }
            Dice.result--;
        }

        //click on button down
        else if (e.getX() > 100 && e.getX() < 200 && e.getY() > 640 && e.getY() < 740 && Dice.result != 0) {
            if(Scores.gameTurn == 1){
                if (MyFrame.map[x1][y1 + 1] != 0 && MyFrame.map[x1][y1 + 1] != 7 && MyFrame.map[x1][y1+1] != -9) {
                    y1 += 1;
                    if (MyFrame.map[x1][y1] == 1)
                        MyFrame.map[x1][y1] = -9;
                    myFrame.player1locY += 75;
                }
            }
            if (Scores.gameTurn == 2) {
                if (MyFrame.map[x2][y2 + 1] != 0 && MyFrame.map[x2][y2 + 1] != 7 && MyFrame.map[x2][y2 + 1] != -9) {
                    y2 += 1;
                    if (MyFrame.map[x2][y2] == 1)
                        MyFrame.map[x2][y2] = -9;
                    myFrame.player2locY += 75;
                }
            }
            Dice.result--;
        }

        //click on button up
        else if (e.getX() > 100 && e.getX() < 200 && e.getY() > 400 && e.getY() < 500 && Dice.result != 0) {
            if(Scores.gameTurn == 1){
                if (MyFrame.map[x1][y1 - 1] != 0 && MyFrame.map[x1][y1 - 1] != 7 && MyFrame.map[x1][y1-1] != -9) {
                    y1 -= 1;
                    if (MyFrame.map[x1][y1] == 1)
                        MyFrame.map[x1][y1] = -9;
                    myFrame.player1locY -= 75;
                }
            }
            if (Scores.gameTurn == 2){
                if (MyFrame.map[x2][y2 - 1] != 0 && MyFrame.map[x2][y2 - 1] != 7 && MyFrame.map[x2][y2-1] != -9) {
                    y2 -= 1;
                    if (MyFrame.map[x2][y2] == 1)
                        MyFrame.map[x2][y2] = -9;
                    myFrame.player2locY -= 75;
                }
            }
            Dice.result--;
        }

        //click on Switch button and changing turn
        if(e.getX() > 1500 && e.getX() < 1600 && e.getY() > 100 && e.getY() < 200 && Dice.result == 0){
            if(Scores.gameTurn == 1){
                for (int g=0 ; g<12 ; g++){
                    for (int k=0 ; k<12 ; k++){
                        if(MyFrame.map[g][k]==-9)
                            MyFrame.map[g][k]=1;
                        if (MyFrame.map[g][k]==-3)
                            MyFrame.map[g][k]=3;
                        if (MyFrame.map[g][k]==-5)
                            MyFrame.map[g][k]=1;
                        if (MyFrame.map[g][k]<0)
                            MyFrame.map[g][k]*=-1;}
                }
                for(int f = 0 ; f < 8 ; f++){
                    if(treasures2[f] < 9 && treasures2[f] > 0){
                        int u = treasures2[f] * 100;
                        for(int i=0 ; i< 12 ; i++){
                            for(int j = 0 ; j < 12 ; j++){
                                if(MyFrame.map[i][j] == u){
                                    MyFrame.map[i][j] *= -1;
                                }
                            }
                        }
                    }
                }
                Scores.gameTurn = 2;
            }else{
                for (int g=0 ; g<12 ; g++){
                    for (int k=0 ; k<12 ; k++){
                        if(MyFrame.map[g][k]==-9)
                            MyFrame.map[g][k]=1;
                        if (MyFrame.map[g][k]==-5)
                            MyFrame.map[g][k]=1;
                        if (MyFrame.map[g][k]<0)
                            MyFrame.map[g][k]*=-1;
                    }
                }
                for(int f = 0 ; f < 8 ; f++){
                    if(treasures[f] < 9 && treasures[f] > 0){
                        int u = treasures[f] * 100;
                        for(int i=0 ; i< 12 ; i++){
                            for(int j = 0 ; j < 12 ; j++){
                                if(MyFrame.map[i][j] == u){
                                    MyFrame.map[i][j] *= -1;
                                }
                            }
                        }
                    }
                }
                Scores.gameTurn = 1;
            }
        }
        if(Scores.gameTurn == 1) {
            if (MyFrame.map[x1][y1] == 5) {
                MyFrame.map[x1][y1] = -5;
                if (Scores.money1 >= 50)
                    Scores.money1 -= 50;
                if (Scores.money1 < 50) {
                    MyFrame.player1locX = 460;
                    MyFrame.player1locY = 900;
                    x1 = 1;
                    y1 = 10;
                }
            }
            if (MyFrame.map[x1][y1] == 3) {
                MyFrame.map[x1][y1] = -3;
                Scores.money1 += 100;
            }
            if (MyFrame.map[x1][y2] == 800){
                MyFrame.map[x1][y1]=-800;
                treasures[7]=8;
            }
            if (MyFrame.map[x1][y1] == 4) {
                new Market1();
            }
            if (MyFrame.map[x1][y1] == 6) {
                new Castle1();
            }
            if (MyFrame.map[x1][y1] == 700) {
                MyFrame.map[x1][y1]=-700;
                treasures[6]=7;
            }
            if (MyFrame.map[x1][y1] == 600) {
                MyFrame.map[x1][y1]=-600;
                treasures[5]=6;
            }
            if (MyFrame.map[x1][y1] == 500) {
                MyFrame.map[x1][y1]=-500;
                treasures[4]=5;
            }
            if (MyFrame.map[x1][y1] == 400) {
                MyFrame.map[x1][y1]=-400;
                treasures[3]=4;
            }
            if (MyFrame.map[x1][y1] == 200) {
                MyFrame.map[x1][y1]=-200;
                treasures[1]=2;
            }
            if (MyFrame.map[x1][y1] == 300) {
                MyFrame.map[x1][y1]=-300;
                treasures[2]=3;
            }
            if (MyFrame.map[x1][y1] == 100) {
                MyFrame.map[x1][y1]=-100;
                treasures[0]=1;
            }
        }
        if(Scores.gameTurn == 2) {
            if (MyFrame.map[x2][y2] == 5) {
                MyFrame.map[x2][y2] = -5;
                if (Scores.money2 >= 50)
                    Scores.money2 -= 50;
                if (Scores.money2 < 50) {
                    MyFrame.player2locX = 460;
                    MyFrame.player2locY = 900;
                    x2 = 1;
                    y2 = 10;
                }
            }
            if (MyFrame.map[x2][y2] == 3) {
                MyFrame.map[x2][y2] = -3;
                Scores.money2 += 100;
            }
            if (MyFrame.map[x2][y2] == 800) {
                MyFrame.map[x2][y2] = -800;
                treasures2[7] = 8;
            }
            if (MyFrame.map[x2][y2] == 4) {
                new Market1();
            }
            if (MyFrame.map[x2][y2] == 6) {
                new Castle1();
            }
            if (MyFrame.map[x2][y2] == 700) {
                MyFrame.map[x2][y2]=-700;
                treasures2[6]=7;
            }
            if (MyFrame.map[x2][y2] == 600) {
                MyFrame.map[x2][y2]=-600;
                treasures2[5]=6;
            }
            if (MyFrame.map[x2][y2] == 500) {
                MyFrame.map[x2][y2]=-500;
                treasures2[4]=5;
            }
            if (MyFrame.map[x2][y2] == 400) {
                MyFrame.map[x2][y2]=-400;
                treasures2[3]=4;
            }
            if (MyFrame.map[x2][y2] == 200) {
                MyFrame.map[x2][y2]=-200;
                treasures2[1]=2;
            }
            if (MyFrame.map[x2][y2] == 300) {
                MyFrame.map[x2][y2]=-300;
                treasures2[2]=3;
            }
            if (MyFrame.map[x2][y2] == 100) {
                MyFrame.map[x2][y2]=-100;
                treasures2[0]=1;
            }
        }

        //fight, if they are in the same location
        if (x1 == x2 && y1 == y2) {
            if (x1 != 1 || y1 != 10 || x2 != 1 || y2 != 10) {
                if (Scores.weapon1 != 0 || Scores.weapon2 != 0) {
                    if (Scores.weapon1 >= Scores.weapon2)
                        new Fight1();
                    else
                        new Fight2();
                }
                if (Scores.weapon1 == 0 && Scores.weapon2 == 0) {
                    MyFrame.player1locY = 900;
                    MyFrame.player1locX = 460;
                    MyFrame.player2locY = 900;
                    MyFrame.player2locX = 420;
                    Mouse1.x1 = 1;
                    Mouse1.y1 = 10;
                    Mouse1.x2 = 1;
                    Mouse1.y2 = 10;
                }
            }
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