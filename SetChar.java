package TSM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("DuplicatedCode")
public class SetChar extends JFrame implements ActionListener {
    static int ans3;
    static int ans;
    static JLabel nameshow1;
    static JLabel nameshow2;
    static JTextField name1;
    static JTextField name2;
    JButton enter;
    JButton back;
    JButton name3;
    JButton name4;
    Icon enterI;
    Icon backI;
    Icon showI;
    Icon showI1;
    Image background = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\background.jpg");
    static String player1name="player1";
    static String player2name="player2";
    SetChar(){

        name1 = new JTextField();
        name2 = new JTextField();


        enter=new JButton();
        back=new JButton();
        name3=new JButton();
        name4=new JButton();


        enterI = new ImageIcon("F:\\my photoshops\\KZAS6624.jpg");
        backI = new ImageIcon("F:\\my photoshops\\KZAS6623.jpg");
        showI = new ImageIcon("F:\\my photoshops\\player11.jpg");
        showI1 = new ImageIcon("F:\\my photoshops\\player21.jpg");


        Image choose = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\EUTK2552.JPEG");
        Image choose1 = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\EUTK2552.JPEG");
        Image imgP1=Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG_1963.JPG");
        Image imgP2=Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG_1964.JPG");
        this.setContentPane(new JPanel(){
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponents(g);
                name1.setBounds(255, 240, 190, 63);
                name2.setBounds(255, 440, 190, 63);
                back.setBounds(100, 770, 400, 80);
                enter.setBounds(100, 670, 400, 80);
                name3.setBounds(695, 670, 220, 50);
                name4.setBounds(1170, 670, 220, 50);


                g.drawImage(background, 0, 0, 3380, 1130, null);
                g.drawImage(imgP1, 610, 130, 380, 630, null);
                g.drawImage(imgP2, 1090, 130, 380, 630, null);
                g.drawImage(choose, 80, 195, 396, 137, null);
                g.drawImage(choose1, 80, 395, 396, 137, null);


                player1name = name1.getText();
                player2name = name2.getText();

                if(name1.getText() == null){
                    ans3=1;
                }
                if(name2.getText() == null){
                    ans3=2;
                }

                nameshow1 = new JLabel(player1name);
                nameshow2 = new JLabel(player2name);
                this.add(nameshow1);
                this.add(nameshow2);
            }
        });
        enter = new JButton(enterI);
        back = new JButton(backI);
        name3 = new JButton(showI);
        name4 = new JButton(showI1);

        this.add(name1);
        this.add(name2);
        this.add(back);
        this.add(enter);
//        this.add(name3);
//        this.add(name4);

        enter.addActionListener(this);
        back.addActionListener(this);
        name3.addActionListener(this);
        name4.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Travelling Salesman");
        this.setBounds(0, 0, 300, 120);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(400, 500);
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(600, 600);
        ImageIcon img1=new ImageIcon("F:\\my photoshops\\EZMW0610.jpeg");
        this.setIconImage(img1.getImage());
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == enter) {
            player1name = name1.getText();
            player2name = name2.getText();
            if(name1.getText() == null){
                ans3=1;
            }
            if(name2.getText() == null){
                ans3=2;
            }
            nameshow1 = new JLabel(player1name);
            nameshow2 = new JLabel(player2name);


            this.add(name3);
            this.add(name4);
        }
        if (e.getSource() == name3) {
            this.setVisible(false);
            ans=0;
            if(name1.getText() == null){
                ans3=1;
            }
            if(name2.getText() == null){
                ans3=2;
            }
//            new Map();
        }
        if (e.getSource() == name4) {
            this.setVisible(false);
            ans=1;
            if(name1.getText() == null){
                ans3=1;
            }
            if(name2.getText() == null){
                ans3=2;
            }
//            new Map();
        }
        if (e.getSource() == back){
            int ans1 = JOptionPane.showConfirmDialog(null, "Leave game and Back to menu?", "Attention", JOptionPane.YES_NO_CANCEL_OPTION);
            if (ans1 == 0) {
                this.setVisible(false);
                new Menu();
            }
            if (ans1 == 1) {
                this.setVisible(true);
            }
            if (ans1 == -1) {
                this.setVisible(true);
            }
        }
    }
}

