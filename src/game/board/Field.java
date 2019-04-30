package game.board;

import game.dimension.Dimension;
import processing.core.PApplet;
import processing.core.PImage;

public class Field {

    private int color = 200;

    private Dimension dimension;
    private PImage rootImage;

    public Field(Dimension dimension, PImage rootImage) {
        this.dimension = dimension;
        this.rootImage = rootImage;
    }

    public void draw(PApplet processing, Dimension fieldSize) {
        int x = dimension.getX() * (fieldSize.getWidth() / 2);
        int y = dimension.getY() * (fieldSize.getHeight() / 2);
        int isoX = x - y;
        int isoY = (x + y) / 2;

        //isoX = cartX - cartY;
        //isoY = (cartX + cartY) / 2;
        processing.image(rootImage,
                isoX + processing.width / 2 + (int) (fieldSize.getHeight() * 0.1) * dimension.getY(),
                isoY + (int) (fieldSize.getHeight() * 0.0655) * dimension.getX(),
                dimension.getWidth() * fieldSize.getWidth(),
                dimension.getHeight() * fieldSize.getHeight());
    }

    private void drawCoordinates(PApplet processing, Dimension fieldSize) {
        processing.fill(0);
        processing.text(dimension.getX() + ":" + dimension.getY(),
                dimension.getX() * fieldSize.getWidth(),
                dimension.getY() * fieldSize.getHeight() + fieldSize.getHeight());
    }
}
