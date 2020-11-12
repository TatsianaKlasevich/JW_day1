package klasevich.tanya.test;

import klasevich.tanya.task4.service.Service;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Service4Test {
    Service service = new Service();

    @Test
    public void testCheckIfEvenTwoNumbers() {
        boolean actual = service.checkIfEvenTwoNumbers(new int[]{16, 353, 28, 1});
        boolean expected = true;

        assertEquals(actual, expected);
    }
}