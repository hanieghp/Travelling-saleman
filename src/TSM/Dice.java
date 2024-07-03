package TSM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Dice extends JPanel implements ActionListener{
    private JLabel diceLable;
    private Timer timer;
    public static int result = 0;
    private int counter = 0;
    private boolean rolling = false;
    private Random random = new Random();
    public static int value;

    Dice(){
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                roll();
            }
        });

        setLayout(new BorderLayout());
        diceLable = new JLabel(new ImageIcon("images//Dice1.png"));//showing the first picture 1
        add(diceLable,BorderLayout.CENTER);
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                if(counter > 10){
                    rolling = false;
                    result = random.nextInt(6)+1;
                    diceLable.setIcon(new ImageIcon("images//Dice" + result + ".png"));//the number of dice
                    timer.stop();
                }
                else{
                    value = random.nextInt(6)+1;
                    diceLable.setIcon(new ImageIcon("images//Dice" + value + ".png"));
                }
            }
        });
    }
    public void roll(){
        if(!rolling){
            rolling = true;
            counter = 0;
            timer.start();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
