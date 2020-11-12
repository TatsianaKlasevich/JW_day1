package klasevich.tanya.test;

import klasevich.tanya.task1.service.Service;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Service1Test {
    Service service;
    int lastFigure;

    @BeforeClass
    public void setUp() {
        service = new Service();
        lastFigure = service.lastFigure(235);
    }


    @Test
    public void testSquareOfLastFigure() {
        int actual = service.squareOfLastFigure(lastFigure);
        int expected = 5;

        assertEquals(actual, expected);
    }
}
