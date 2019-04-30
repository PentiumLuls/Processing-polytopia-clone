package game;

import game.dimension.Dimension;
import game.dimension.DimensionMeasure;
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
        Dimension fieldSize = new Dimension(DimensionMeasure.IN_PIXELS, 0, 0, 200, 200);
        Dimension boardSize = new Dimension(0, 0, 10, 10);
        game.createBoard(boardSize, fieldSize);
    }

    public void draw() throws NoGameException {
        processing.clear();

        if (game == null) {
            throw new NoGameException("---No games actually---");
        }
        game.drawBoard(processing);
    }
}
