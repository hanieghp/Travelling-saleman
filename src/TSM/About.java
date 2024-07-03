package TSM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame {
    Image img2 = Toolkit.getDefaultToolkit().getImage("images//About.JPEG");//Background Image
    About(){
        Icon backB = new ImageIcon("images//ButtonOk.JPEG");

        this.setContentPane(new JPanel() {
            @Override
            public void paintComponent(Graphics g){
                g.drawImage(img2,0, 0, 2000, 1205,null);

                JButton back = new JButton(backB);
                back.setBounds(1300,700,400,80);
                this.add(back);
                back.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame now = (JFrame)
                                SwingUtilities.getWindowAncestor(back);
                        now.dispose();
                        new Menu();
                    }
                });
            }
        });

        //Set the Frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0, 0, 3234, 2434);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.setTitle("About");//Title for Frame


        //Set logo
        ImageIcon img1=new ImageIcon("images//Logo.JPEG");
        this.setIconImage(img1.getImage());
    }
}
