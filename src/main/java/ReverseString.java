public class ReverseString {
    public String reverse(String string){

        char[] reverseString = new char[string.length()];

        int j=0;
        for(int i=string.length()-1 ; i >= 0 ;i--){
            reverseString[j] = string.charAt(i);
            j++;
        }

        return String.copyValueOf(reverseString);
    }
}
