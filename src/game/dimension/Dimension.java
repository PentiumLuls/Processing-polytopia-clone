package game.dimension;

public class Dimension {

    private DimensionMeasure measure;

    private int x;
    private int y;
    private int width;
    private int height;

    /**
     * Store x, y position and width, height
     *
     * @param x         start point on field by x
     * @param y         start point on field by y
     * @param width     end point on field by x
     * @param height    end point on field by y
     */
    public Dimension(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        measure = DimensionMeasure.IN_FIELDS;
    }

    public Dimension(DimensionMeasure measure, int x, int y, int width, int height) {
        this.measure = measure;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Dimension setMeasure(DimensionMeasure measure) {
        this.measure = measure;
        return this;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
