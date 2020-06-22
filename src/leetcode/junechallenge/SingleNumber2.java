package leetcode.junechallenge;

import java.util.Arrays;

public class SingleNumber2 {


    public static void main(String args[]){
        int a[] = {2,2,3,2};
        System.out.print(singleNumber(a));

    }
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;){

            if(i+2 <= nums.length && nums[i] == nums[i+1] && nums[i] == nums[i+2]){
                i=i+3;
            }else{

                return nums[i];
            }

        }
        return -1;
    }
}
