package leetcode.dec2021;

public class Robbers {

    public static int rob(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }
        if(nums.length == 1){
            return nums[0];
        }
        int dp[] = new int[nums.length];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);

        for(int i=2;i<nums.length;i++){
            dp[i] = Math.max(nums[i] + dp[i-2], dp[i-1]);
        }
        return dp[nums.length-1];

    }
    }

    public static void main(String s[]){
        int nums[] = {2,7,9,3,1,3,4,5,6,2,2,2,3,5,6,7};
        System.out.println(rob(nums));
    }
}
