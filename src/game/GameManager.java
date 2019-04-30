package game;

import game.dimension.Dimension;
import game.exception.NoGameException;
import processing.core.PApplet;

public class GameManager {

    private final PApplet processing;
    private Game game;

    public GameManager(PApplet processing) {
        this.processing = processing;
    }

    public void createGame() {
        game = new Game();
        game.createBoard(new Dimension(0, 0, 100, 200));
    }

    public void draw() throws NoGameException {
        processing.clear();

        if (game == null) {
            throw new NoGameException("---No games actually---");
        }
        game.drawBoard(processing);
    }
}
