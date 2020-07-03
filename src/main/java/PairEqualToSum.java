import java.util.HashMap;
import java.util.Map;

public class PairEqualToSum {
    public int[] getPairEqualToSum(int[] numbers, int sum){
        //{3, 5, 7, 9, 6}
        Map<Integer, Integer> map = new HashMap<>();

        for(int x=0; x < numbers.length; x++){
            int delta = sum - numbers[x];
            if(map.containsKey(delta)){
                return new int[]{delta, numbers[x]};
            }else{
                map.put(numbers[x], x);
            }
        }

        return new int[]{-1, -1};
    }
}
