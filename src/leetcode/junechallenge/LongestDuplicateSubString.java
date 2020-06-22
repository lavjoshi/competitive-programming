package leetcode.junechallenge;

public class LongestDuplicateSubString {

    public static void main(String args[]){
        String s = "banana";
        System.out.print(longestDupSubstring(s));
    }

    public static String longestDupSubstring(String S) {
        String temp="";
        for(int i=0;i<S.length();i++){
            temp = S.charAt(i) +"";
            for(int j=i+1;j<S.length();j++){
                String dup = temp+ S.charAt(j);
                if(S.contains(dup)){
                    temp = dup;
                }else{
                    break;
                }
            }
        }
        return temp;
    }
}
