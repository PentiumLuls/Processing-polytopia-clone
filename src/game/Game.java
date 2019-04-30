package game;

import game.dimension.Dimension;
import processing.core.PApplet;

public class Game {
    private int round;
    private Board board;

    public Game() {
        round = 0;
    }

    public void drawBoard(PApplet processing) {
        board.draw(processing);
    }

    public void createBoard(Dimension dimension) {
        board = new Board(dimension);
        board.generate(dimension);
    }
}
