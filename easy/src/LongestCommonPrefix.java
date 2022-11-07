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

        for(int i = 0; i<strs[0].length(); i++){
            char c = strs[0].charAt(i);
            for(int j =1; j< strs.length; j++){
                if(i >= strs[i].length() || c != strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {

        String[] strs = new String[]{"flower","flow","flight"};
        String prefix = longestCommonPrefix(strs);
        System.out.println(prefix);

        String[] strs2 = new String[]{"dog","racecar","car"};
        String prefix2 = longestCommonPrefix(strs2);
        System.out.println(prefix2);

        String[] strs3 = new String[]{"pelin","perde","pergel"};
        String prefix3 = longestCommonPrefix(strs3);
        System.out.println(prefix3);
    }
}
