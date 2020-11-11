package klasevich.tanya.task1.main;

import klasevich.tanya.task1.entity.Number;
import klasevich.tanya.task1.service.Count;
import klasevich.tanya.task1.view.View;

public class Main {
    public static void main(String[] args) {
        Number number = new Number(235);

        Count count = new Count();
        int lastFigure = count.lastFigure(number.getX());
        int square = count.squareOfLastFigure(lastFigure);

        View view = new View();
        view.print(number.getX(), square);


    }
}
