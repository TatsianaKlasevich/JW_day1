package klasevich.tanya.test;

import klasevich.tanya.task2.service.Service;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Service2Test {
    Service service = new Service();

    @Test
    public void testFindNumOfDays() {
        int actual = service.findNumOfDays(1986, 5);
        int expected = 31;

        assertEquals(actual, expected);
    }
}