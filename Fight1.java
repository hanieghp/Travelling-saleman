package TSM;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class Fight1 extends JFrame {

    // private Total_Map total_map ;
    JFrame frame ;
    Total_Map total_map =new Total_Map() ;
    private BufferedImage img ;
    private BufferedImage[] idlani;
    private int anitick , aniindex , anispeed = 15 ;
    Fight1(){
        importimage();
        loadanimation();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420 , 420);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
        this.add(total_map);

        int two=Scores.money2;
        int one=Scores.money1;
        two-=(Scores.weapon2-Scores.weapon1)*Scores.money1/(Scores.weapon1+Scores.weapon2);
        one+=(Scores.weapon1-Scores.weapon2)*Scores.money2/(Scores.weapon1+Scores.weapon2);
        Scores.money1=one;
        Scores.money2=two;
        Scores.weapon1=Scores.weapon1-Scores.weapon2;
        Scores.weapon2=0;
        Move2.x=0;
        Move2.y=0;
    }

    private void loadanimation() {
        idlani = new BufferedImage[13];
        for (int i=0 ; i < idlani.length ; i++){
            idlani[i]= img.getSubimage(i*2224, 0 , 2224 , 1668);
        }

    }
    private void importimage(){
        InputStream is = getClass().getResourceAsStream("");

        try {
            img = ImageIO.read(is);
        }catch (IOException e){
            throw new RuntimeException();
        }finally {
            try {
                is.close();
            }catch (IOException e){
                e.printStackTrace();
            }

        }
    }
    private void updateanimationtic() {
        anitick++ ;
        if(anitick >= anispeed){
            anitick = 0 ;
            aniindex++;
            if(aniindex >= idlani.length){
                aniindex=0;
            }
        }

    }

    public void paint(Graphics g){

        g.setColor(new Color( 0,0,0));
        //g.drawOval(100 , 100 , 200 , 200);
        updateanimationtic();
        g.drawImage(idlani[aniindex] , 0 , 0 , 1920 , 1080 ,  null);

        repaint();

    }
}
