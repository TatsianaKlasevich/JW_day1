package klasevich.tanya.task4.service;

public class Service {
    public boolean checkIfEvenTwoNumbers(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        if (count >= 2) {
            return true;
        }
        return false;
    }
}
