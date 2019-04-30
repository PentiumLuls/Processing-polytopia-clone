package game;

import game.board.Field;
import game.dimension.Dimension;
import game.dimension.DimensionMeasure;
import processing.core.PApplet;

public class Board {
    private Field[][] fields;
    private Dimension view;
    private Dimension fieldSize;

    public Board(Dimension view) {
        this.view = view;
        fieldSize = new Dimension(DimensionMeasure.IN_PIXELS, 0, 0, 30, 30);
    }

    public void draw(PApplet processing) {
        for (int i = view.getX(); i < view.getWidth(); i++) {
            for (int j = view.getY(); j < view.getHeight(); j++) {
                fields[i][j].draw(processing, fieldSize);
            }
        }
    }

    public void generate(Dimension dimension) {
        fields = new Field[dimension.getWidth() - dimension.getX()][dimension.getHeight() - dimension.getY()];
        fields = generateFields(fields, view);
    }

    private Field[][] generateFields(Field[][] fields, Dimension dimension) {
        Field[][] newFields = fields.clone();

        for (int i = dimension.getX(); i < dimension.getWidth(); i++) {
            for (int j = dimension.getY(); j < dimension.getHeight(); j++) {
                newFields[i][j] = new Field(new Dimension(i, j, 1, 1));
            }
        }
        return newFields;
    }
}
