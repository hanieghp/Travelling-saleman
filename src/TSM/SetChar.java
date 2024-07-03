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
    Image background = Toolkit.getDefaultToolkit().getImage("images//background.jpg");
    Image extend = Toolkit.getDefaultToolkit().getImage("images//chosseMap.JPG");
    static String player1name="player1";
    static String player2name="player2";
    SetChar(){

        name1 = new JTextField();
        name2 = new JTextField();


        enter=new JButton();
        back=new JButton();
        name3=new JButton();
        name4=new JButton();


        enterI = new ImageIcon("images//ButtonEnter.jpg");
        backI = new ImageIcon("images//ButtonBack.jpg");

        //name of characters
        showI = new ImageIcon("images//player11.jpg");
        showI1 = new ImageIcon("images//player21.jpg");

        Image playerG = Toolkit.getDefaultToolkit().getImage("images//girlChar.GIF");
        Image playerB = Toolkit.getDefaultToolkit().getImage("images//boyChar.GIF");
        Image choose = Toolkit.getDefaultToolkit().getImage("images//textArea.JPEG");
        Image choose1 = Toolkit.getDefaultToolkit().getImage("images//textArea.JPEG");
        Image imgP1=Toolkit.getDefaultToolkit().getImage("images//imgP1.JPG");
        Image imgP2=Toolkit.getDefaultToolkit().getImage("images//imgP2.JPG");
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
                g.drawImage(playerG, 710, 170, 160, 478, null);
                g.drawImage(playerB, 1190, 170, 160, 478, null);
                repaint();


                player1name = name1.getText();
                player2name = name2.getText();

                //if any player entered nothing
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

                //setting the name in Frame
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

        enter.addActionListener(this);
        back.addActionListener(this);
        name3.addActionListener(this);
        name4.addActionListener(this);

        //set Frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0, 0, 3234, 2434);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Travelling Salesman");//set title

        //set logo
        ImageIcon img1=new ImageIcon("images//Logo.jpeg");
        this.setIconImage(img1.getImage());
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
                for (int y=1; y<11; y++){//making map 9*9
                    MyFrame.map[11][y]=0;
                    MyFrame.map[10][y]=0;
                }
                for (int x=1; x<11; x++){
                    MyFrame.map[x][1]=0;
                }
            }
            if (choser.getItemAt(choser.getSelectedIndex()).equals("10*10")){
                for (int y=1; y<11; y++){//making map 10*10
                    MyFrame.map[10][y]=1;
                }
                for (int x=1; x<11; x++){
                    MyFrame.map[x][1]=1;
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

        //action listener back button
        if (e.getSource() == back){
            int ans1 = JOptionPane.showConfirmDialog(null, "Leave game and Back to menu?", "Attention", JOptionPane.YES_NO_CANCEL_OPTION);
            if (ans1 == 0) {//Back to menu
                this.setVisible(false);
                new Menu();
            }
            if (ans1 == 1) {//nothing
                this.setVisible(true);
            }
            if (ans1 == -1) {//nothing
                this.setVisible(true);
            }
        }
    }
}

