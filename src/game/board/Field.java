package game.board;

import game.dimension.Dimension;
import processing.core.PApplet;

public class Field {

    private int color = 200;

    private Dimension dimension;

    public Field(Dimension dimension) {
        this.dimension = dimension;
    }

    public void draw(PApplet processing, Dimension fieldSize) {
        processing.fill(color);
        processing.rect(dimension.getX() * fieldSize.getWidth(), dimension.getY() * fieldSize.getHeight(),
                dimension.getWidth() * fieldSize.getWidth(), dimension.getHeight() * fieldSize.getHeight());

        processing.fill(0);
        processing.text(dimension.getX() + ":" + dimension.getY(),
                dimension.getX() * fieldSize.getWidth(), dimension.getY() * fieldSize.getHeight() + fieldSize.getHeight());
    }
}
