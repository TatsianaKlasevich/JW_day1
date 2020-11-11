package klasevich.tanya.task9.main;

import klasevich.tanya.task9.view.View;
import klasevich.tanya.task9.service.Service;
import klasevich.tanya.task9.entity.Shape;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape(9);

        Service service = new Service();
        double length = service.countCircleLength(shape.getRadius());
        double area = service.countCircleArea(shape.getRadius());

        View view = new View();
        view.print1(length);
        view.print2(area);
    }
}
