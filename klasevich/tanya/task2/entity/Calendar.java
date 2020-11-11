package klasevich.tanya.task2.entity;

public class Calendar {
    private int year;
    private int month;

    public Calendar(int year, int month) {
        this.year = year;
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Calendar{");
        sb.append("year=").append(year);
        sb.append(", month=").append(month);
        sb.append('}');
        return sb.toString();
    }
}
