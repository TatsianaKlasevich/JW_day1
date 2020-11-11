package klasevich.tanya.task1.service;

public class Count {
    public int squareOfLastFigure(int x) {
        switch (x) {
            case 0:
                return 0;
            case 1:
            case 9:
                return 1;


            case 2:
            case 8:
                return 4;


            case 3:
            case 7:
                return 9;

            case 4:
            case 6:
                return 6;

            case 5:
                return 5;

        }
        return x;
    }

    public int lastFigure(int x) {
        return x % 10;

    }
}
