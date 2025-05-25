
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Tile extends JButton{
    public Tile() {
        setBackground(Color.BLACK);
    }

    public void setOnClick(ActionListener listener) {
        this.addActionListener(e -> {
            if (getBackground().equals(Color.BLACK))
                setBackground(Color.WHITE);
            else setBackground(Color.BLACK);
            
            listener.actionPerformed(e);
        });
    }

    public void setAlive(){
        setBackground(Color.WHITE);
    }

    public void setDead(){
        setBackground(Color.BLACK);
    }
}
