package leetcode.junechallenge;
/*
Given an integer, write a function to determine if it is a power of two.
 */
public class PowerOfTwo {


    public static void main(String args[]){
        System.out.println(isPowerOfTwo(1024));
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(74));
    }

    public static boolean  isPowerOfTwo(int n) {

        return check(n,0);
    }

    public static boolean  check(int n,int i){
        if(n == 0){
            return false;
        }
        if(n == 1){
            return true;
        }
        if(n%2 != 0){
            return false;
        }
        return check(n/2,i+1);
    }
}
