package klasevich.tanya.task5.service;

public class Service {
    public boolean checkIfPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            return true;
        }
        return false;
    }
}
