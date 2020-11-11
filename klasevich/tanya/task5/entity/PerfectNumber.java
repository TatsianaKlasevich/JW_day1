package klasevich.tanya.task5.entity;

public class PerfectNumber {
    private int number;

    public PerfectNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PerfectNumber{");
        sb.append("number=").append(number);
        sb.append('}');
        return sb.toString();
    }
}
