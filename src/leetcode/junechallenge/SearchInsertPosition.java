package leetcode.junechallenge;
/*
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.
 */
public class SearchInsertPosition {

    public static void main(String args[]){
        int nums[] = {1,3,5,6};
        System.out.println(searchInsert(nums,5));
//        nums = new int[]{1,3,5,6};

        System.out.println(searchInsert(nums,2));
        System.out.println(searchInsert(nums,7));
        System.out.println(searchInsert(nums,0));
    }

    public static int searchInsert(int[] nums, int target) {
        int low=0;
        int high = nums.length;

        while(low < high){
            int mid = low + (high-low)/2;
            if(nums[mid] < target){
                low = mid +1;
            }else{
                high = mid;
            }
        }
        return low;
    }
}
