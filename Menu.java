package TSM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {

    Image img1 = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG_2903.GIF");

    JButton button;
    JButton aboutB;
    JButton exitB;
    JButton startB;
    Menu() {
        Icon startIcon = new ImageIcon("F:\\my photoshops\\KZAS6621.jpg");
        Icon exitIcon = new ImageIcon("F:\\my photoshops\\KZAS66222.jpg");
        Icon aboutIcon = new ImageIcon("F:\\my photoshops\\KZAS6622.JPEG");
        startB = new JButton(startIcon);
        this.setContentPane(new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(img1, 0, 0, 2000, 1000, null);
                repaint();
                startB = new JButton(startIcon);
                this.add(startB);
                startB.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame nowS = (JFrame)
                                SwingUtilities.getWindowAncestor(startB);
                        nowS.dispose();
                        new SetChar();
                    }
                });
                aboutB = new JButton(aboutIcon);//About
                aboutB.setBounds(75,900,400,80);
                this.add(aboutB);
                aboutB.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame now = (JFrame)
                                SwingUtilities.getWindowAncestor(aboutB);
                        now.dispose();
                        new TSM.About();
                    }
                });
            }

        });
        pack();
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Travelling Sales Man");
        this.setBounds(600, 200, 300, 120);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        exitB = new JButton(exitIcon);//Exit
        exitB.setBounds(1450, 900, 400, 80);
        exitB.addActionListener(this);
        this.add(exitB);
        button = new JButton(startIcon);
        button.setBounds(750,900,400,80);
        button.addActionListener(this);
        this.add(button);
        ImageIcon img1 = new ImageIcon("F:\\my photoshops\\EZMW0610.JPEG");
        this.setIconImage(img1.getImage());
        this.setBounds(0, 0, 3234, 2434);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        this.setSize(3234, 2434);
//        this.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            this.setVisible(false);
            new TSM.SetChar();
        }
        if (e.getSource() == exitB) {
            int ans = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Attention", JOptionPane.YES_NO_CANCEL_OPTION);
            if (ans == 0) {
                this.setVisible(false);
            }
            if (ans == 1) {
                this.setVisible(true);
            }
            if (ans == -1) {
                this.setVisible(true);
            }
        }
    }
}