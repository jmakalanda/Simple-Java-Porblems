import static org.junit.Assert.*;

public class SortArraysTest {

    @org.junit.Test
    public void sortIntegerArray() {
        int[] array= new SortArrays().sortIntegerArray(new int[] {9, 8, 7, 5, 3, 5, 4});
        for (int value: array)
         System.out.print(value + " ");
    }
}