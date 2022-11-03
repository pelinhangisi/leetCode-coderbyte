
// Given an integer x, return true if x is a palindrome, and false otherwise.

/*  Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.

    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
   */

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if(x == 0){
            return true;
        }
        if(x < 0 || x%10 == 0) {
            return false;
        }

        int reversed = 0;
        while(x > reversed){
            int lastDigit = x%10;
            x /= 10;
            reversed = (reversed*10) + lastDigit;
        }

        if(x == reversed || x == reversed/10){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        int x = 121;
        System.out.println("x : " + isPalindrome(x));

        int y = 10;
        System.out.println("y : " + isPalindrome(y));

        int z = 1256996521;
        System.out.println("z : " + isPalindrome(z));
    }

}
