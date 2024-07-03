package TSM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.InputStream;

public class Menu extends JFrame {//Menu Frame
    Image img1 = Toolkit.getDefaultToolkit().getImage("images//menu.png");//get the menu background
    JButton startB;
    JButton aboutB;
    JButton exitB;
    JButton continueB;

    //animation data
    private BufferedImage img ;
    private BufferedImage[] idlani;
    private int anitick , aniindex , anispeed = 15 ;
    Menu() {
        //setting Image for Buttons
        Icon startIcon = new ImageIcon("images//ButtonStart.jpg");
        Icon exitIcon = new ImageIcon("images//ButtonExit.jpg");
        Icon aboutIcon = new ImageIcon("images//ButtonAbout.JPEG");
        Icon contiIcon = new ImageIcon("images//ButtonContinue.JPEG");
//        importimage();
//        loadanimation();
        this.setContentPane(new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(img1, 0, 0, 2000, 1000, null);
                repaint();

                //About Button
                aboutB = new JButton(aboutIcon);
                aboutB.setBounds(75,900,400,80);
                this.add(aboutB);
                aboutB.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame now = (JFrame)
                                SwingUtilities.getWindowAncestor(aboutB);
                        now.dispose();
                        new About();
                    }
                });

                //Start Button
                startB = new JButton(startIcon);
                startB.setBounds(750,550,400,80);
                this.add(startB);
                startB.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame now = (JFrame)
                                SwingUtilities.getWindowAncestor(startB);
                        now.dispose();
                        new SetChar();
                    }
                });

                //Continue Button
                continueB = new JButton(contiIcon);
                continueB.setBounds(750,650,400,80);
                this.add(continueB);
                continueB.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        MyFrame.count = 1;
                        JFrame now = (JFrame)
                                SwingUtilities.getWindowAncestor(continueB);
                        now.dispose();
                        new MyFrame();
                    }
                });

                //Exit Button
                exitB = new JButton(exitIcon);
                exitB.setBounds(1450, 900, 400, 80);
                this.add(exitB);
                exitB.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame now = (JFrame)
                                SwingUtilities.getWindowAncestor(exitB);
                        int ans = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Attention", JOptionPane.YES_NO_CANCEL_OPTION);
                        if (ans == 0) {
                            now.dispose();
                        }
                        if (ans == 1) {
                            now.setVisible(true);
                        }
                        if (ans == -1) {
                            now.setVisible(true);
                        }
                    }
                });
            }
        });
        pack();

        //Set the Frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Travelling Sales Man");//Title for Frame
        this.setBounds(0, 0, 3234, 2434);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        //Set logo
        ImageIcon img1 = new ImageIcon("images//Logo.JPEG");
        this.setIconImage(img1.getImage());

    }

//    private void loadanimation() {
//        idlani = new BufferedImage[10];
//        for (int i=0 ; i < idlani.length ; i++){
//            idlani[i]= img.getSubimage(i*621, 0 , 621 , 810);
//        }
//
//    }
//    private void importimage(){
//
//        InputStream is = getClass().getResourceAsStream("res//MenuSheet.png");
//        try {
//            img = ImageIO.read(is);
//        }catch (IOException e){
//            throw new RuntimeException();
//        }finally {
//            try {
//                is.close();
//            }catch (IOException e){
//                e.printStackTrace();
//            }
//
//        }
//    }
//    private void updateanimationtic() {
//        anitick++ ;
//        if(anitick >= anispeed){
//            anitick = 0 ;
//            aniindex++;
//            if(aniindex >= idlani.length){
//                aniindex=0;
//            }
//        }
//
//    }
//
//    public void paint(Graphics g){
//        g.setColor(new Color( 0,0,0));
//        updateanimationtic();
//        g.drawImage(idlani[aniindex] , 0 , 0 , 1920 , 1080 ,  null);
//        repaint();
//    }
}