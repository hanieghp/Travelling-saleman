package TSM;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Castle1 extends JFrame implements ActionListener {
    static int []queste={1, 2, 3, 4, 5, 6, 7, 8};
    JButton check;
    Icon checkI;
    int value_treasure=0;
    JButton cancel;
    Icon cancelI;

    int res=1;
    int sign_end=0;
    Image background = Toolkit.getDefaultToolkit().getImage("images//cas.GIF");


    Castle1() {
        check=new JButton();
        checkI = new ImageIcon("images//ButtonEnter.jpg");

        cancel=new JButton();
        cancelI = new ImageIcon("images//ButtonExit.jpg");

        this.setContentPane(new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponents(g);
                g.drawImage(background, 0, 0, 2000, 1050, null);
                repaint();
                check.setBounds(5, 800, 400, 80);
                cancel.setBounds(5, 900, 400, 80);
                if (res == 0) {
                    Font font = new Font("Serif", Font.PLAIN, 35);
                    g.setFont(font);
                    g.drawString("the coordinates is wrong try again!!!", 5, 75);
                }
                if (res == 2) {
                    Font font = new Font("Serif", Font.PLAIN, 35);
                    g.setFont(font);
                    g.drawString("Congratulation you found this treasure", 5, 75);
                }
            }
        });
        check = new JButton(checkI);
        cancel = new JButton(cancelI);
        this.add(check);
        this.add(cancel);
        check.addActionListener(this);
        cancel.addActionListener(this);
        pack();

        //set Frame
        setVisible(true);
        this.setBounds(0, 0, 3234, 2434);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Travelling Salesman");//set title

        //set Logo
        ImageIcon img1 = new ImageIcon("images//Logo.jpeg");
        this.setIconImage(img1.getImage());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cancel) {
            for (int s=0; s<8; s++){
                if(queste[s]==-1){
                    sign_end++;
                    if (sign_end==7){
                        if (Scores.score1>Scores.score2){
                            this.setVisible(false);
                            new winner1();
                        }
                        if (Scores.score2>Scores.score1){
                            this.setVisible(false);
                            new winner2();
                        }
                    }
                }
            }
            sign_end=0;
            int ans2 = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Attention", JOptionPane.YES_NO_CANCEL_OPTION);
            if (ans2 == 0) {
                setVisible(false);
            }
            if (ans2 == 1) {
                this.setVisible(true);
            }
            if (ans2 == -1) {
                this.setVisible(true);
            }
        }
        if (e.getSource() == check) {
            for (int s=0; s<8; s++){
                if(queste[s]==-1){
                    sign_end++;
                    if (sign_end==7){
                        if (Scores.score1>Scores.score2){
                            this.setVisible(false);
                            new winner1();
                        }
                        if (Scores.score2>Scores.score1){
                            this.setVisible(false);
                            new winner2();
                        }
                    }
                }
            }
            int num_quete=MyFrame.res;
            if (Scores.gameTurn==1) {
                outerloop:for (int i=0 ; i<8 ; i++) {
                    if (Mouse1.treasures[i] == num_quete) {
                        value_treasure = (i + 1) * 100;
                        MyFrame.player1locX = 460;
                        MyFrame.player1locY = 900;
                        Mouse1.x1 = 1;
                        Mouse1.y1 = 10;
                        res = 2;
                        int res4=MyFrame.res*-100;
                        for (int f=0; f<12; f++) {
                            for (int u = 0; u < 12; u++) {
                                if (MyFrame.map[f][u] == res4) {
                                    MyFrame.map[f][u] = 1;
                                }
                            }
                        }
                        int res2=MyFrame.res;
                        int r=res2-1;
                        queste[r]=-1;
                        for (int h = 0; h < 8; h++) {
                            if (queste[h] != -1) {
                                MyFrame.res = queste[h];
                            }
                        }
                        break outerloop;
                    }
                    if (Mouse1.treasures[i]!=num_quete){
                        res = 0;
                    }
                }
                Scores.score1 += value_treasure;
                value_treasure=0;
            }
            if (Scores.gameTurn==2) {
                outerloop:for (int i=0 ; i<8 ; i++) {
                    if (Mouse1.treasures2[i] == num_quete) {
                        value_treasure = (i + 1) * 100;
                        MyFrame.player2locX = 420;
                        MyFrame.player2locY = 900;
                        Mouse1.x2 = 1;
                        Mouse1.y2 = 10;
                        res = 2;
                        int res4=MyFrame.res*-100;
                        for (int f1=0; f1<12; f1++) {
                            for (int u = 0; u < 12; u++) {
                                if (MyFrame.map[f1][u] == res4) {
                                    MyFrame.map[f1][u] = 1;
                                }
                            }
                        }
                        int res2=MyFrame.res;
                        int r=res2-1;
                        queste[r]=-1;
                        for (int h = 0; h < 8; h++) {
                            if (queste[h] != -1) {
                                MyFrame.res = queste[h];
                            }
                        }
                        break outerloop;
                    }
                    if (Mouse1.treasures2[i] != num_quete) {
                        res = 0;
                    }
                }
                Scores.score2 += value_treasure;
                value_treasure=0;
            }
        }
    }
}
