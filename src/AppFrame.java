
import javax.swing.BoxLayout;
import javax.swing.JFrame;


public class AppFrame extends JFrame {
    public AppFrame() {
        setTitle("Conway's Game of Life");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(500, 550);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setVisible(true);
    }
}
