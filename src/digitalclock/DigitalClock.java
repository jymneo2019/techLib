package digitalclock;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;



public class DigitalClock  extends JFrame{
    JLabel jlabclock;
    ClockThread ct;

    public DigitalClock(){
        jlabclock = new JLabel("");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(jlabclock);
        setSize(1200,120);
        setLocationRelativeTo(null);
        ct = new ClockThread(this);
        setVisible(true);

    }

    public static class Main {

        public static void main(String[] args) {
            //System.out.println("Hello world!");
            new DigitalClock();
            System.out.println("Hi");
        }
    }
}
