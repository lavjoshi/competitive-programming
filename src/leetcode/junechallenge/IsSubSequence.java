package leetcode.junechallenge;
/*
Given a string s and a string t, check if s is subsequence of t.

A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ace" is a subsequence of "abcde" while "aec" is not).

Follow up:
If there are lots of incoming S, say S1, S2, ... , Sk where k >= 1B, and you want to check one by one to see if T has its subsequence. In this scenario, how would you change your code?
 */
public class IsSubSequence {


    public static void main(String args[]){
        System.out.println(isSubsequence("abc","ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        int count =0;
        if(s.isEmpty() && t.isEmpty()){
            return true;
        }
        if(s.isEmpty() && !t.isEmpty()){
            return true;
        }
        if(!s.isEmpty() && t.isEmpty()){
            return false;
        }
        while(i < t.length() ){
            if(t.charAt(i) == s.charAt(j)){
                j++;
                count++;
            }
            if(count == s.length()){
                return true;
            }
            i++;
        }
        if(count == s.length()){
            return true;
        }
        return false;
    }
}
