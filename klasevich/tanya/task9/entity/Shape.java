package klasevich.tanya.task9.entity;

public class Shape {
    private int radius;

    public Shape(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Shape{");
        sb.append("radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }
}
