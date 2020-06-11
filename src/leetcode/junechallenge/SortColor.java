package leetcode.junechallenge;

public class SortColor {

    public static void main(String args[]){
        int nums[]={2,0,2,1,1,0};
        sortColors(nums);
        for(int i : nums){
            System.out.print(i);
        }
    }

    public static void sortColors(int[] nums) {
        int i=0;
        int j=0;
        int k = nums.length -1;
        while(j < k){
            if(nums[j] == 2){
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k--] = temp;
            }else if(nums[j] == 0){
                int temp = nums[j];
                nums[j++] = nums[i];
                nums[i++] = temp;
            }else if(nums[j] == 1){
                j++;
            }
        }
    }
}
