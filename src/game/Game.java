package game;

import game.dimension.Dimension;
import game.dimension.DimensionMeasure;
import processing.core.PApplet;

public class Game {
    private int round;
    private Board board;
    private Dimension fieldSize;

    public Game() {
        round = 0;
    }

    public void drawBoard(PApplet processing) {
        board.draw(processing);
    }

    public void createBoard(Dimension dimension, Dimension fieldSize) {
        board = new Board(dimension, fieldSize);
        board.generate(dimension);
        this.fieldSize = fieldSize;
    }
}
