package leetcode.july;

import java.util.LinkedList;
import java.util.List;

public class PlusOne {

    public static void main(String a[]){
        int arr[] = {9};
        System.out.print(plusOne(arr));
    }

    public static int[] plusOne(int[] digits) {

        int i=digits.length-1;
        int res[] ;
        LinkedList<Integer> result = new LinkedList<>();
        int carry = 0;
        while(i>=0){
            int temp = carry+digits[i];
            if(i == digits.length-1){
                temp++;
            }
            if(temp>9){
                carry = temp/10;
                temp = temp%10;
            }else{
                carry =0;
            }
//            res[i] = temp;
            result.addFirst(temp);
            i--;
        }

        if(carry != 0){
            result.addFirst(carry);
        }

        res = new int[result.size()];
        int x=0;
        for(Integer intt : result){
            res[x] = intt;
            x++;
        }
        return res;
    }
}
