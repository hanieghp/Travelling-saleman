package TSM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame {
    Image img2 = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\EIPZ4266.JPEG");
    About(){
        Icon backB = new ImageIcon("F:\\my photoshops\\GFGW5745.JPEG");
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
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("About");
        this.setBounds(0, 0, 1920, 1080);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(400, 500);
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(600, 600);
        ImageIcon img1=new ImageIcon("F:\\my photoshops\\EZMW0610.JPEG");
        this.setIconImage(img1.getImage());
    }
}
