package klasevich.tanya.task6.service;

public class Service {
    public int defineHour(int second) {
        return (int) Math.floor(second / 60 / 60);
    }

    public int defineMinute(int hour, int second) {
        return (int) Math.floor(second / 60 - 60 * hour);
    }

    public int defineSecond(int hour, int minute, int second) {
        return second - hour * 60 * 60 - minute * 60;
    }
}
