import org.junit.Test;

import static org.junit.Assert.*;

public class PairEqualToSumTest {

    @Test
    public void getPairEqualToSum() {
        int[] resultArray = new PairEqualToSum().getPairEqualToSum(new int[]{2,3,4, 2,9,}, 7);

        for (int value: resultArray){
            System.out.print(value + " ");
        }
    }
}