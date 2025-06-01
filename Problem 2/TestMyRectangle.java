public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint topLeft = new MyPoint(1, 5); // Create the top-left and bottom-right points
        MyPoint bottomRight = new MyPoint(6, 1);

        MyRectangle rect = new MyRectangle(topLeft, bottomRight); // Create the rectangle using the two points

        System.out.println(rect); // Print out properties of the rectangle
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
    }
}