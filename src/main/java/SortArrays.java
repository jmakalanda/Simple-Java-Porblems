public class SortArrays {
    public String[] sortStringArray(String[] array){



        return null;
    }

    public int[] sortIntegerArray(int[] array){
        int temp;
        for(int scanIndex=array.length ; scanIndex > 0 ;scanIndex--) {
            for (int index = 0; index < array.length - 1; index++) {
                if (array[index] > array[index + 1]) {
                    //swap values
                    temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }
            }
        }
        return array;
    }

}
