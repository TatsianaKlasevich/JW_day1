package klasevich.tanya.task8.main;

import klasevich.tanya.task8.view.View;
import klasevich.tanya.task8.service.Service;
import klasevich.tanya.task8.entity.Function;

public class Main {
    public static void main(String[] args) {


        Function function = new Function(-3);

        Service service = new Service();
        double result = service.count(function.getX());


        View view = new View();
        view.print(result);
    }
}
