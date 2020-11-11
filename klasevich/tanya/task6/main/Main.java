package klasevich.tanya.task6.main;

import klasevich.tanya.task6.view.View;
import klasevich.tanya.task6.service.Service;
import klasevich.tanya.task6.entity.Second;

public class Main {
    public static void main(String[] args) {
        Second second = new Second(18456500);

        Service service = new Service();
        int hours = service.defineHour(second.getSecond());
        int minutes = service.defineMinute(hours, second.getSecond());
        int sec = service.defineSecond(hours, minutes, second.getSecond());

        View view = new View();
        view.print(second.getSecond(), hours, minutes, sec);


    }
}
