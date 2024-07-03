package TSM;

import javax.swing.*;
import java.awt.event.*;

public class TimerSet implements ActionListener {
    private int seconds = 0;
    private int minutes = 0;
    private int hours = 0;
    private JLabel timeLabel;

    public TimerSet(JLabel timeLabel) {
        this.timeLabel = timeLabel;
        Timer timer = new Timer(1000, this);
        timer.start();
    }

    public void actionPerformed(ActionEvent e) {
        seconds++;
        if (seconds == 60) {
            seconds = 0;
            minutes++;
        }
        if (minutes == 60) {
            minutes = 0;
            hours++;
        }
        String time = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        timeLabel.setText(time);
    }
}
