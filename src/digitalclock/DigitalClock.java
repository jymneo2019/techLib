package digitalclock;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JFrame;



public class DigitalClock  extends JFrame{
    JLabel jlabclock;
    ClockThread ct;
    int kl=0;

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
