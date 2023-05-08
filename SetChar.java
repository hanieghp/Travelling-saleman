package TSM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

@SuppressWarnings("DuplicatedCode")
public class SetChar extends JFrame implements ActionListener {
    static String options[] = {"9*9", "10*10"};
    static final JComboBox choser = new JComboBox(options);
    static int ans3=0;
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
    Image extend = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\QNECE1398.JPG");
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

        Image playerx = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG_2898.GIF");
        Image playery = Toolkit.getDefaultToolkit().getImage("F:\\my photoshops\\IMG_2899.GIF");
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
                enter.setBounds(80, 770, 400, 80);
                back.setBounds(80, 870, 400, 80);
                name3.setBounds(695, 670, 220, 50);
                name4.setBounds(1170, 670, 220, 50);



                g.drawImage(background, 0, 0, 3380, 1130, null);
                g.drawImage(imgP1, 610, 130, 380, 630, null);
                g.drawImage(imgP2, 1090, 130, 380, 630,  null);
                g.drawImage(choose, 80, 195, 396, 137, null);
                g.drawImage(choose1, 80, 395, 396, 137, null);
                g.drawImage(extend, 80, 595, 396, 137, null);
                g.drawImage(playerx, 710, 170, 160, 478, null);
                repaint();
                g.drawImage(playery, 1190, 170, 160, 478, null);
                repaint();


                player1name = name1.getText();
                player2name = name2.getText();
                if (name1.getText()==""){
                    player1name="player1";
                }
                if (name2.getText()==""){
                    player1name="player1";
                }
                if (name1.getText()==null){
                    player1name="player1";
                }
                if (name2.getText()==null){
                    player1name="player1";
                }
                if (player2name==null){
                    player1name="player1";
                }
                if (player1name==""){
                    player1name="player1";
                }
                if (player2name==""){
                    player1name="player1";
                }
                if (player1name==null){
                    player1name="player1";
                }
                if (player2name==null){
                    player1name="player1";
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
        this.add(choser);
//        this.add(name3);
//        this.add(name4);

        enter.addActionListener(this);
        back.addActionListener(this);
        name3.addActionListener(this);
        name4.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Travelling Salesman");
        this.setBounds(0, 0, 3234, 2434);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        ImageIcon img1=new ImageIcon("F:\\my photoshops\\EZMW0610.jpeg");
        this.setIconImage(img1.getImage());
        this.setBounds(0, 0, 3234, 2434);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        this.setSize(3234, 2434);
//        this.setResizable(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == enter) {
            player1name = name1.getText();
            player2name = name2.getText();
            if (name1.getText()==""){
                ans3=1;
            }
            if (Objects.equals(name2.getText(), "")){
                ans3=2;
            }
            if (Objects.equals(name2.getText(), "") && Objects.equals(name1.getText(), "")){
                ans3=3;
            }
            if (name1.getText()==null){
                ans3=1;
            }
            if (player2name==null){
                ans3=2;
            }
            if (player2name==null && player1name==null){
                ans3=3;
            }
            if (Objects.equals(player1name, "")){
                ans3=1;
            }
            if (Objects.equals(player2name, "")){
                ans3=2;
            }
            if (Objects.equals(player2name, "") && Objects.equals(player1name, "")){
                ans3=3;
            }
            if (player1name==null){
                ans3=1;
            }
            if (player2name==null){
                ans3=2;
            }
            if (player2name==null && player1name==null){
                ans3=3;
            }
            nameshow1 = new JLabel(player1name);
            nameshow2 = new JLabel(player2name);
            this.add(name3);
            this.add(name4);
            choser.setBounds(225, 660, 200, 43);
            if (choser.getItemAt(choser.getSelectedIndex()).equals("9*9")){
                for (int y=1; y<11; y++){
                    MyFrame.map[11][y]=0;
                    MyFrame.map[10][y]=0;
                }
                for (int x=1; x<11; x++){
                    MyFrame.map[x][1]=0;
//                    MyFrame.map[x][0]=0;
                }
            }
            if (choser.getItemAt(choser.getSelectedIndex()).equals("10*10")){
                for (int y=1; y<11; y++){
//                    MyFrame.map[11][y]=1;
                    MyFrame.map[10][y]=1;
                }
                for (int x=1; x<11; x++){
                    MyFrame.map[x][1]=1;
//                    MyFrame.map[x][0]=0;
                }
            }
        }
        if (e.getSource() == name3) {
            this.setVisible(false);
            ans=0;
            new MyFrame();
        }
        if (e.getSource() == name4) {
            this.setVisible(false);
            ans=1;
            new MyFrame();
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

