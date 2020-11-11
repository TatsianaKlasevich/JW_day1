package klasevich.tanya.task10.main;

import klasevich.tanya.task10.entity.Function;
import klasevich.tanya.task10.service.Service;
import klasevich.tanya.task10.view.View;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Function function = new Function(2, 34, 4);

        Service service = new Service();
        Map<Integer,Double> map = service.count(function.getA(), function.getB(), function.getH());

        View view = new View();
        view.print(map);

    }
}
