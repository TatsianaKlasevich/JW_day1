package klasevich.tanya.task3.main;

import klasevich.tanya.task3.entity.Square;
import klasevich.tanya.task3.service.Service;
import klasevich.tanya.task3.view.View;

public class Main {
    public static void main(String[] args) {

        Square square = new Square(36);

        Service service = new Service();
        double radius = service.countRadius(square.getArea());

        double area = service.findAreaInnerSquare(radius);

        double times = service.findHowManyTimesLess(square.getArea(), area);

        View view = new View();
        view.print1(area);
        view.print2(times);
    }
}
