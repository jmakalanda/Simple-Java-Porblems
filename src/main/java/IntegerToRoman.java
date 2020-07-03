public class IntegerToRoman {
    public String convert(int number){
        //123 -> CXXIII

        String romanString="";

        int x =10;
        if(number<10){
            romanString = getRomanLessThanTen(number);
        }else if (number < 100){
            romanString = getRomanLessThanHundred(number);

        }else if(number < 1000) {
            romanString = getRomanLessThanThousand(number);
        }else if(number < 4000){
            romanString = getRomanLessThanThreeThousand(number);
        }else{
            throw new RuntimeException("Number grater than or equal to 4k and not allowed!!");
        }

        return romanString;

    }

    private String getRomanLessThanThreeThousand(int number) {
        int temp = number - (number%1000);
        String romanString = getRomanLessThanThreeThousandAndGreaterThanNineHandrad(temp);
        number -= temp;
        temp = number - (number%100);
        romanString += getRomanLessThanThousandGreaterThanNinetyNine(temp);
        number -= temp;
        temp = number - (number%10);
        romanString += getRomanLessThanHundredGreaterThanNine(temp);
        number -= temp;
        romanString += getRomanLessThanTen(number);
        return romanString;
    }

    private String getRomanLessThanThreeThousandAndGreaterThanNineHandrad(int number) {
        switch(number){
            case 1000: return "M";
            case 2000: return "MM";
            case 3000: return "MMM";
            default: return "";
        }
    }

    private String getRomanLessThanThousand(int number) {
        int temp = number - (number%100);
        String romanString = getRomanLessThanThousandGreaterThanNinetyNine(temp);
        number -= temp;
        temp = number - (number%10);
        romanString += getRomanLessThanHundredGreaterThanNine(temp);
        number -= temp;
        romanString += getRomanLessThanTen(number);
        return romanString;
    }

    private String getRomanLessThanThousandGreaterThanNinetyNine(int number) {
        switch(number){
            case 100: return "C";
            case 200: return "CC";
            case 300: return "CCC";
            case 400: return "CD";
            case 500: return "D";
            case 600: return "DC";
            case 700: return "DCC";
            case 800: return "CCM";
            case 900: return "CM";
            default: return "";
        }
    }


    private String getRomanLessThanHundred(int number) {

        int tmp = number - (number %10);
        String romanString = getRomanLessThanHundredGreaterThanNine(tmp);
        number -= tmp;
        romanString += getRomanLessThanTen(number);

        return romanString;
    }

    private String getRomanLessThanHundredGreaterThanNine(int number) {
        String romanString = "";
        switch(number){
            case 10: return "X";
            case 20: return "XX";
            case 30: return "XXX";
            case 40: return "XL";
            case 50: return "L";
            case 60: return "LXX";
            case 70: return "LXXX";
            case 80: return "XXC";
            case 90: return "XC";
            default: return "";
        }
    }

    private String getRomanLessThanTen(int number) {
        String romanString = "";
        switch(number){
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "IV";
            case 5: return "V";
            case 6: return "VI";
            case 7: return "VII";
            case 8: return "VIII";
            case 9: return "IX";
            default: return "";
        }
    }
}
