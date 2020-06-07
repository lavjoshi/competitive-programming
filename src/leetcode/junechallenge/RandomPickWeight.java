package leetcode.junechallenge;
/*
Given an array w of positive integers, where w[i] describes the weight of index i, write a function pickIndex which randomly picks an index in proportion to its weight.

Note:

1 <= w.length <= 10000
1 <= w[i] <= 10^5
pickIndex will be called at most 10000 times.
Input:
["Solution","pickIndex"]
[[[1]],[]]
Output: [null,0]
 */
public class RandomPickWeight {

    private static int sum ;
    private static int arr[];
    public static void solution(int[] w) {
        sum = 0 ;
        arr= new int[w.length];
        for(int i=0;i<w.length;++i){
            sum += w[i];
            arr[i] =sum;


        }
    }

    public int pickIndex() {
        int i = (int)(Math.random()*sum);
        return search(i+1);
    }


    public int search(int val){
        int low=0;
        int high=arr.length-1;

        while(low<high){
            int mid = low + (high-low)/2;
            if(arr[mid] < val){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return low;
    }
}
