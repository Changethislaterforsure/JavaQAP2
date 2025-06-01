public class TestMyLine {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 2); // Create two points
        MyPoint p2 = new MyPoint(4, 6);

        MyLine line = new MyLine(p1, p2); // Create a line using the two points

        System.out.println("My Line: " + line);  // Print line info
        System.out.println("Length: " + line.getLength());
        System.out.println("Gradient (radians): " + line.getGradient());
    }
}