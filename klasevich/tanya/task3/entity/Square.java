package klasevich.tanya.task3.entity;

public class Square {
    private int area;

    public Square(int area) {
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Square{");
        sb.append("area=").append(area);
        sb.append('}');
        return sb.toString();
    }
}
