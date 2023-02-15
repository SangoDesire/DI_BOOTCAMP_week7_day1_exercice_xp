public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        super();
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{this.x, this.y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {

        return """
                (%s, %s)
                """.formatted(this.x, this.y);
    }

    /**
     * distance from this point to the given point at (x, y)
     *
     * @param x
     * @param y
     * @return distance from this point to the given point at (x, y)
     */
    public double distance(int x, int y) {
        return Math.sqrt((Math.pow((x - this.x), 2)) + (Math.pow((y - this.y), 2)));
    }

    public double distance(MyPoint point) {
        return Math.sqrt((Math.pow((point.getX() - this.x), 2)) + (Math.pow((point.getY() - this.y), 2)));
    }

    public double distance() {
        return Math.sqrt((Math.pow((-this.x), 2)) + (Math.pow((-this.y), 2)));
    }
}
