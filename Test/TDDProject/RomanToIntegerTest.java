package TDDProject;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanToIntegerTest {

    @Test
    public void romanToIntCase() {
        String[] inputs = {"III","LVIII","MCMXCIV"};
        int[] expectedResults = {3,58,1994};
        int[] actualResults = new int[3];
        for(int i =0; i< inputs.length; i++){
            actualResults[i] = new RomanToInteger().romanToInt2(inputs[i]);
        }

        assertArrayEquals(expectedResults,actualResults);
    }
}