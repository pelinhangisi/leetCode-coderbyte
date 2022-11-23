import java.util.Arrays;

/*Question :

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.*/

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j< nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {5,2,4};
        int target = 6;
        System.out.println("index numbers for nums:" +Arrays.toString(twoSum(nums, target)));

        int[] nums2 = {3,9,7,65,5};
        int target2 = 70;
        System.out.println("index numbers for nums2:" + Arrays.toString(twoSum(nums2, target2)));

        int[] nums3 = {2,7,11,15};
        int target3 = 9;
        System.out.println("index numbers for nums3:" + Arrays.toString(twoSum(nums3, target3)));
    }
}
