
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class AppFrame extends JFrame {
    public AppFrame() {
        ImageIcon image = new ImageIcon(getClass().getResource("/resources/app-icon.png"));
        setIconImage(image.getImage());
        setTitle("Conway's Game of Life");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(500, 550);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setVisible(true);
    }
}
