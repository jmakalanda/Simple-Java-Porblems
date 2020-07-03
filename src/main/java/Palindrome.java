public class Palindrome {
    public boolean isPalindrome(String word){

        String reverse ="";
        System.out.println(word.length());
        for(int index=word.length() -1 ; index >= 0 ; index--){
            reverse = reverse + word.charAt(index);
        }
        System.out.println(word + " vs " + reverse);
        if (word.equals(reverse))
            return true;

        return false;
    }
}
