package klasevich.tanya.task4.main;

import klasevich.tanya.task4.view.View;
import klasevich.tanya.task4.service.Service;
import klasevich.tanya.task4.entity.RowOfNumbers;

public class Main {
    public static void main(String[] args) {
        RowOfNumbers numbers = new RowOfNumbers(new int[]{16, 353, 28, 1});

        Service service = new Service();
        boolean result = service.checkIfEvenTwoNumbers(numbers.getNumbers());

        View view = new View();
        view.print(result);

    }
}
