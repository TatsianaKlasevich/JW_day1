package klasevich.tanya.task6.entity;

public class Second {
    private int second;

    public Second(int second) {
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Second{");
        sb.append("second=").append(second);
        sb.append('}');
        return sb.toString();
    }
}
