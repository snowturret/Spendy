package middleTier;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created by xiwang on 3/13/17.
 */
public class AutoSlide extends JPanel {
    private int counter = 0;
    private ImageIcon[] image = new ImageIcon[10];
    private JLabel label;

    /**
     * add images into an array of imageIcon; using timer to iterate the image and set different images to JLabel;
     */
    public AutoSlide() {
        for (int i = 0; i < image.length; ++i)
            image[counter++] = new ImageIcon("src/pic" + i +".png");


        label = new JLabel();
        add(label);

        Timer timer = new Timer(2300, new TimerListener());
        timer.start();

    }

    /**
     * set listener; reset new imageIcon based on the delay time;
     */
    class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            counter++;
            counter %= image.length;
            label.setIcon(image[counter]);
        }
    }

    public static void main(String args[]) throws IOException {
        AutoSlide i1 = new AutoSlide();
    }
}


