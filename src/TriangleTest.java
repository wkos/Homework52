public class TriangleTest {
    public static void main(String[] args) {
        double edge1 = 3;
        double edge2 = 4;
        double edge3 = 5;

        Triangle triangle = new Triangle(edge1, edge2, edge3);
        TriangleMaths triangleMaths = new TriangleMaths();

        if (edge1 <= 0 || edge2 <= 0 || edge3 <= 0 || !triangleMaths.isTriangle(triangle)) {
            System.out.println("Z boków: " + triangle.toString() + " nie da się zbudować trójkąta");
        } else {
            if (triangleMaths.isRightTriangle(triangle)) {
                System.out.println("Trójkąt o bokach " + edge1 + ", " + edge2 + " i " + edge3 +
                        " jest prostokątny");
            } else {
                System.out.println("Trójkąt o bokach " + edge1 + ", " + edge2 + " i " + edge3 +
                        " nie jest prostokątny");
            }
        }
    }
}
