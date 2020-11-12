package klasevich.tanya.test;

import klasevich.tanya.task3.service.Service;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Service3Test {
    Service service;
    double radius;
    double areaInner;

    @BeforeClass
    public void setUp() {
        service = new Service();
        radius = service.countRadius(36);
        areaInner = service.findAreaInnerSquare(radius);
    }


    @Test
    public void testFindAreaInnerSquare() {
        double actual = service.findAreaInnerSquare(radius);
        double expected = 18;

        assertEquals(actual, expected, 0.001);

    }

    @Test
    public void testFindHowManyTimesLess() {
        double actual = service.findHowManyTimesLess(36, areaInner);
        double expected = 0.5;

        assertEquals(actual, expected, 0.001);

    }

    public static class Service4Test {

        @Test
        public void testCheckIfEvenTwoNumbers() {
        }
    }
}