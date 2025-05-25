
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ControlButton extends JButton {
    public ControlButton(String text) {
        setText(text);
    }

    public void setOnClick(ActionListener listener) {
        addActionListener(listener);
    }
}
