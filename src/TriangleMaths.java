public class TriangleMaths {
    boolean isRightTriangle(Triangle triangle) {
        double edge1, edge2, edge3;
        if (triangle.getEdge1() > triangle.getEdge2()) {
            if (triangle.getEdge1() > triangle.getEdge3()) {
                edge1 = triangle.getEdge1();
                edge2 = triangle.getEdge2();
                edge3 = triangle.getEdge3();
            } else {
                edge1 = triangle.getEdge3();
                edge2 = triangle.getEdge2();
                edge3 = triangle.getEdge1();
            }
        } else {
            if (triangle.getEdge2() > triangle.getEdge3()) {
                edge1 = triangle.getEdge2();
                edge2 = triangle.getEdge1();
                edge3 = triangle.getEdge3();
            } else {
                edge1 = triangle.getEdge3();
                edge2 = triangle.getEdge2();
                edge3 = triangle.getEdge1();
            }
        }
        return edge1 * edge1 == edge2 * edge2 + edge3 * edge3;
    }

    boolean isTriangle(Triangle triangle) {
        return Math.abs(triangle.getEdge1() - triangle.getEdge2()) < triangle.getEdge3() &&
                triangle.getEdge3() < triangle.getEdge1() + triangle.getEdge2();
    }
}
