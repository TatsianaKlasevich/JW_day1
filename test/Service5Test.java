package klasevich.tanya.test;

import klasevich.tanya.task5.service.Service;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Service5Test {
    Service service = new Service();

    @Test
    public void testCheckIfPerfectNumber() {
        boolean actual = service.checkIfPerfectNumber(496);
        boolean expected = true;

        assertEquals(actual, expected);
    }
}