package klasevich.tanya.task3.service;


public class Service {
    public double countRadius(int area) {
        return Math.sqrt(area) / 2;
    }

    public double findAreaInnerSquare(double radius) {
        double InnerSide = findInnerSide(radius);
        return InnerSide * InnerSide;

    }

    private double findInnerSide(double radius) {
        return Math.sqrt(2 * radius * radius);
    }

    public double findHowManyTimesLess(double areaOuter, double areaInner) {
        return areaInner / areaOuter;
    }
}
