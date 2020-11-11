package klasevich.tanya.task2.main;

import klasevich.tanya.task2.view.View;
import klasevich.tanya.task2.entity.Calendar;
import klasevich.tanya.task2.service.Service;

public class main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar(1986, 5);

        Service service = new Service();
        int days = service.findNumOfDays(calendar.getYear(), calendar.getMonth());

        View view = new View();
        view.print(calendar.getYear(), calendar.getMonth(), days);


    }
}
