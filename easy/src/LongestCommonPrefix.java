/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Input: strs = ["flower","flow","flight"]
Output: "fl"

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.*/

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0){
            return "";
        }

        String result = strs[0];
        int i = 1;
        while(i < strs.length)
        {
            while(strs[i].indexOf(result) != 0)
            {
                result = result.substring(0,result.length()-1);
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {

        String[] strs = new String[]{"flower","flow","flight"};
        String result = longestCommonPrefix(strs);
        System.out.println(result);

        String[] strs2 = new String[]{"dog","racecar","car"};
        String result2 = longestCommonPrefix(strs2);
        System.out.println(result2);

        String[] strs3 = new String[]{"pelin","perde","pergel"};
        String result3 = longestCommonPrefix(strs3);
        System.out.println(result3);
    }
}
