import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class ControlPanel extends JPanel{
    ControlButton playButton;
    ControlButton pauseButton; 
    ControlButton stepButton;
    ControlButton resetButton;
    
    public ControlPanel() {
        playButton = new ControlButton("▶");
        pauseButton = new ControlButton("⏸");
        stepButton = new ControlButton("⏭");
        resetButton = new ControlButton("♻");
        
        add(resetButton);
        add(pauseButton);
        add(playButton);
        add(stepButton);

        setMaximumSize(new Dimension(500, 40));
    }

    public void setPlayButtonOnClick(ActionListener listener) {
        playButton.setOnClick(listener);
    }
    public void setPauseButtonOnClick(ActionListener listener) {
        pauseButton.setOnClick(listener);
    }
    public void setStepButtonOnClick(ActionListener listener) {
        stepButton.setOnClick(listener);
    }
    public void setResetButtonOnClick(ActionListener listener) {
        resetButton.setOnClick(listener);
    }
}
