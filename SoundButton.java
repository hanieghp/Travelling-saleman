package TSM;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class SoundButton extends JButton{
    private boolean muted;
    private ImageIcon muteI;
    private ImageIcon unmuteI;
    private Sound sound;

    public SoundButton(String filepath , String muteIconPath , String unmuteIconPath){
        super();
        muted = false;
        muteI = new ImageIcon(muteIconPath);
        unmuteI = new ImageIcon(unmuteIconPath);
        sound = new Sound(filepath);
        setIcon(unmuteI);
        addActionListener(e -> {
            if(muted){
                sound.playe();
                setIcon(unmuteI);
                muted = false;
            }
            else{
                sound.stop();
                setIcon(muteI);
                muted = true;
            }
        });
    }
}
