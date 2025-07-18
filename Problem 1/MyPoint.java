public class MyPoint {
    private int x;
    private int y;

    public MyPoint() { // Default constructor sets point at (0,0)
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {  // Constructor that sets point to given x and y
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

    public int[] getXY() { // Returns both coordinates as an array
        return new int[] { x, y };
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double distance(MyPoint another) {
        return distance(another.getX(), another.getY());
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}