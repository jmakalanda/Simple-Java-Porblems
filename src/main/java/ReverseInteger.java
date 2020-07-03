
public class ReverseInteger {
    // 7596;
    private int reverseInt = 0, tmp =0;
    public int reverse(int number) {

        do  {
            tmp = number%10;
            reverseInt = (reverseInt * 10) +tmp; //695
            number /= 10;

        } while (number > 0);

        return reverseInt;
    }
}
