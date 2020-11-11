package klasevich.tanya.task5.main;

import klasevich.tanya.task5.service.Service;
import klasevich.tanya.task5.view.View;
import klasevich.tanya.task5.entity.PerfectNumber;

public class Main {
    public static void main(String[] args) {

        PerfectNumber number = new PerfectNumber(496);

        Service service = new Service();
        boolean result = service.checkIfPerfectNumber(number.getNumber());

        View view = new View();
        view.print(result);
    }
}
