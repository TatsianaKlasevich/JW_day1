package klasevich.tanya.task1.entity;

public class Number {
    private int x;

    public Number(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Number{");
        sb.append("x=").append(x);
        sb.append('}');
        return sb.toString();
    }
}

