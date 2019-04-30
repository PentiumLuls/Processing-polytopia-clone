
import game.GameManager;
import game.exception.NoGameException;
import processing.core.*;

public class Main extends PApplet {

    private GameManager gameManager;

    public static PApplet processing;

    public static void main(String args[]) {
        PApplet.main("Main");
    }

    @Override
    public void settings() {
        size(600, 800);
        processing = this;
        gameManager = new GameManager(processing);
    }

    @Override
    public void setup() {
        gameManager.createGame();
    }

    @Override
    public void draw() {
        try {
            gameManager.draw();
        } catch (NoGameException e) {
            e.printStackTrace();
        }
    }
}
