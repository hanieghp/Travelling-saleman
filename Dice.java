package TSM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

//public class Dice extends JPanel{
//    static int value;
//    public Dice() {
//        this.value = 1;
//        addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent e) {
//                roll();
//            }
//        });
//    }
//
//    public void roll() {
//        this.value = (int) (Math.random() * 6) + 1;
//        repaint();
//    }
//
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        g.setColor(Color.WHITE);
//        g.fillRect(0, 0, getWidth(), getHeight());
//        g.setColor(Color.BLACK);
//        g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
//        int dotSize = getWidth() / 6;
//        switch (value) {
//            case 1:
//                drawDot(g, getWidth() / 2, getHeight() / 2, dotSize);
//                break;
//            case 2:
//                drawDot(g, getWidth() / 3, getHeight() / 3, dotSize);
//                drawDot(g, 2 * getWidth() / 3, 2 * getHeight() / 3, dotSize);
//                break;
//            case 3:
//                drawDot(g, getWidth() / 3, getHeight() / 3, dotSize);
//                drawDot(g, getWidth() / 2, getHeight() / 2, dotSize);
//                drawDot(g, 2 * getWidth() / 3, 2 * getHeight() / 3, dotSize);
//                break;
//            case 4:
//                drawDot(g, getWidth() / 3, getHeight() / 3, dotSize);
//                drawDot(g, 2 * getWidth() / 3, getHeight() / 3, dotSize);
//                drawDot(g, getWidth() / 3, 2 * getHeight() / 3, dotSize);
//                drawDot(g, 2 * getWidth() / 3, 2 * getHeight() / 3, dotSize);
//                break;
//            case 5:
//                drawDot(g, getWidth() / 3, getHeight() / 3, dotSize);
//                drawDot(g, 2 * getWidth() / 3, getHeight() / 3, dotSize);
//                drawDot(g, getWidth() / 2, getHeight() / 2, dotSize);
//                drawDot(g, getWidth() / 3, 2 * getHeight() / 3, dotSize);
//                drawDot(g, 2 * getWidth() / 3, 2 * getHeight() / 3, dotSize);
//                break;
//            case 6:
//                drawDot(g, getWidth() / 3, getHeight() / 4, dotSize);
//                drawDot(g, 2 * getWidth() / 3, getHeight() / 4, dotSize);
//                drawDot(g, getWidth() / 3, getHeight() / 2, dotSize);
//                drawDot(g, 2 * getWidth() / 3, getHeight() / 2, dotSize);
//                drawDot(g, getWidth() / 3, 3 * getHeight() / 4, dotSize);
//                drawDot(g, 2 * getWidth() / 3, 3 * getHeight() / 4, dotSize);
//                break;
//        }
//    }
//
//    private void drawDot(Graphics g, int x, int y, int size) {
//        g.fillOval(x - size / 2, y - size / 2, size, size);
//    }
//}
public class Dice extends JPanel implements ActionListener{
    private JLabel diceL;
    private Timer timer;
    public static int result = 0;
    private int counter=0;
    private boolean rolling = false;
    private Random random = new Random();
    public static int value;

    Dice(){
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                roll();
            }
        });
        setPreferredSize(new Dimension(10,10));
        setLayout(new BorderLayout());
        diceL = new JLabel(new ImageIcon("F:\\my photoshops\\Dice1.png"));
        add(diceL,BorderLayout.CENTER);
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                if(counter > 10){
                    rolling = false;
                    result = random.nextInt(6)+1;
                    diceL.setIcon(new ImageIcon("F:\\my photoshops\\Dice"+result+".png"));
                    timer.stop();
                }
                else{
                    value = random.nextInt(6)+1;
                    diceL.setIcon(new ImageIcon("F:\\my photoshops\\Dice"+value+".png"));
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
