package TSM;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

public class Sound {
    public static Clip clip;

    public Sound(String soundFilePath) {
        try {
            File soundFile = new File(soundFilePath);
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(soundFile));
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    public static void playe() {
        clip.start();
    }
    public static void stop(){
        clip.stop();
    }
}
