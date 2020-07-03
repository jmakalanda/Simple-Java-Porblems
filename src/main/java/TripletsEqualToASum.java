public class TripletsEqualToASum {
    public void isTripletsEqualTo(int[] numbers, int sum){
        int[] output = new int[3];
        // {9,2,3,4,3, 4, 0, 4, 1}
        for(int x=0; x < numbers.length -2 ;x++){
            if(numbers[x] <= sum){
                int comp = sum - numbers[x];
                for(int y=x+1 ; y<numbers.length -1; y++){
                    if(numbers[y] <= comp){
                        int comp2 = comp - numbers[y];
                        for(int z=y+1; z<numbers.length; z++){
                            if(comp2 == numbers[z]){
                                System.out.println(numbers[x] + " " + numbers[y] + " " + numbers[z]);
                                z=numbers.length;
                                y=numbers.length;
                            }
                        }
                    }

                }
            }
        }
    }
    public void printArray(int[] array){
        for(int index=0 ; index< array.length; index++){
            System.out.print(array[index] + " ");
        }
        System.out.println("");

    }
}
