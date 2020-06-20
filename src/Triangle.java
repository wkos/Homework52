public class Triangle {
    private double edge1;
    private double edge2;
    private double edge3;

    public Triangle(double edge1, double edge2, double edge3) {
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }

    public double getEdge1() {
        return edge1;
    }

    public double getEdge2() {
        return edge2;
    }

    public double getEdge3() {
        return edge3;
    }

    @Override
    public String toString() {
        return "" + edge1 + ", " + edge2 + ", " + edge3;
    }
}
