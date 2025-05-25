
import java.awt.event.ActionEvent;
import javax.swing.Timer;



public class App {
    public static void main(String[] args) throws Exception {
        int rows = 20;
        int columns = 20;

        Board gameOfLife = new Board(columns, rows);
        AppFrame mw = new AppFrame();
        ControlPanel controlPanel = new ControlPanel();
        Timer timer = new Timer(200, (ActionEvent e) -> {
            gameOfLife.update();
            gameOfLife.display();
        });

        controlPanel.setPlayButtonOnClick(e -> timer.start());
        controlPanel.setPauseButtonOnClick(e -> timer.stop());
        controlPanel.setStepButtonOnClick(e -> {gameOfLife.update(); gameOfLife.display();});
        controlPanel.setResetButtonOnClick(e -> {gameOfLife.reset(); gameOfLife.display();});

        mw.add(gameOfLife);
        mw.add(controlPanel);
    }
}
