package game.board;

import game.GameImage;
import game.dimension.Dimension;
import game.dimension.DimensionMeasure;
import processing.core.PImage;

public class FieldFactory {

    private Dimension dimension;
    private PImage rootImage;

    public FieldFactory() {
        dimension = new Dimension(0, 0, 1, 1);
    }

    public FieldFactory setCoordinates(int x, int y) {
        dimension.setX(x);
        dimension.setY(y);
        return this;
    }

    public FieldFactory setRootImage(GameImage imageType) {
        rootImage = GameImage.getImage(imageType);
        return this;
    }

    public Field build() {
        dimension.setMeasure(DimensionMeasure.IN_FIELDS);
        dimension.setWidth(1);
        dimension.setHeight(1);

        return new Field(dimension, rootImage);
    }
}
