package TSM;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Maps_buttons extends JFrame implements ActionListener {
    JButton backA;
    JButton exitA;
    Maps_buttons() {
        Icon backIcon1 = new ImageIcon("F:\\my photoshops\\KZAS6623.jpg");
        Icon exitIcon1 = new ImageIcon("F:\\my photoshops\\KZAS66222.jpg");
        backA = new JButton(backIcon1);
        exitA = new JButton(exitIcon1);
        backA.setBounds(1550, 830, 395, 80);
        exitA.setBounds(1550, 920, 395, 80);
        this.add(backA);
        this.add(exitA);
        exitA.addActionListener(this);
        backA.addActionListener(this);
    }
    public void actionPerformed (ActionEvent e){
        if (e.getSource() == backA) {
            int ans1 = JOptionPane.showConfirmDialog(null, "Leave game and Back to menu?", "Attention", JOptionPane.YES_NO_CANCEL_OPTION);
            if (ans1 == 0) {
                JFrame nowb = (JFrame)
                        SwingUtilities.getWindowAncestor(backA);
                nowb.dispose();
                Sound.stop();
                new Menu();
            }
            if (ans1 == 1) {
                this.setVisible(true);
            }
            if (ans1 == -1) {
                this.setVisible(true);
            }
        }
        if (e.getSource() == exitA) {
            int ans2 = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Attention", JOptionPane.YES_NO_CANCEL_OPTION);
            if (ans2 == 0) {
                JFrame now = (JFrame)
                        SwingUtilities.getWindowAncestor(exitA);
                now.dispose();
            }
            if (ans2 == 1) {
                this.setVisible(true);
            }
            if (ans2 == -1) {
                this.setVisible(true);
            }
        }
    }
}
