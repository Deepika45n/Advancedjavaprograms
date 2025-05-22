/*Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
pressed by implementing the event handling mechanism with addActionListener( )*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitalClockHourGlassApp extends JFrame {
    private JLabel messageLabel;

    public DigitalClockHourGlassApp() {
        setTitle("Swing Event Handling");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create label to display messages
        messageLabel = new JLabel("Press a button");

        // Create buttons with images
        JButton digitalClockButton = new JButton("Digital Clock");
        JButton hourGlassButton = new JButton("Hour Glass");

        // Add images (Ensure the image paths are correct)
        digitalClockButton.setIcon(new ImageIcon("digital_clock.png"));
        hourGlassButton.setIcon(new ImageIcon("hour_glass.png"));

        // Add action listeners
        digitalClockButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Digital Clock is pressed");
            }
        });

        hourGlassButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Hour Glass is pressed");
            }
        });

        // Add components to frame
        add(digitalClockButton);
        add(hourGlassButton);
        add(messageLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new DigitalClockHourGlassApp();
    }
}
