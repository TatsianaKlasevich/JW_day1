package klasevich.tanya.task8.service;

public class Service {

    public double count(int x) {
        if (x >= 3) {
            return -x * x + 3 * x + 9;
        }
        return 1.0 / (x * x * x - 6);
    }
}
