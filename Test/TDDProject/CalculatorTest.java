package TDDProject;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest{

    @Test
    public void divideTestCase1() throws Exception {
        int actualResult = new Calculator().divide(10,2);
        assertEquals(actualResult, 5);
    }

    @Test
    public void divideTestCase2() throws Exception {
        int actualResult = new Calculator().divide(-10,-1);
        assertEquals(actualResult, 10);
    }

    @Test(expected = Exception.class)
    public void divideTestCase3() throws Exception {
        int actualResult = new Calculator().divide(-10,0);
        //assertEquals(actualResult, 10);
    }
}