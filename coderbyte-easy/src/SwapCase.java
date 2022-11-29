/*Have the function SwapCase(str) take the str parameter and swap the case of each character
For example : if str is "Hello Wolrd" the output should be hELLO wORLD.
Let numbers and symbols stay the way they are */


public class SwapCase {

    public static String SwapCase(String str) {

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) {
                arr[i] = Character.toLowerCase(arr[i]);
            } else {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }
        str = String.valueOf(arr);
        return str;
    }


    public static void main(String[] args) {
        System.out.println("Input : Hello-LOL, Output : " + SwapCase("Hello-LOL"));
        System.out.println("Input : Sup DUDE!!?, Output : " + SwapCase("Sup DUDE!!?"));
    }
}
