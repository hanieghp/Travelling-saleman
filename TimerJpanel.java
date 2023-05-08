package TSM;

import javax.swing.*;

public class TimerJpanel extends JPanel{
    private JLabel timeLabel = new JLabel("00:00:00");
    private TimerSet gameTimer = new TimerSet(timeLabel);

    public TimerJpanel() {
        add(timeLabel);
    }
}
