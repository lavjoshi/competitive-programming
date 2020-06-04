package leetcode.junechallenge;

import com.sun.deploy.util.StringUtils;

public class ReverseString {


    public static void main(String a[]){
        char s[] = {'H','a','n','n','a','h'};
        System.out.println(new String(s));
        reverseString(s);
        System.out.println(new String(s));


    }

    public static void reverseString(char[] s) {

        int i = 0;
        int j = s.length-1;
        while(i<j){
            char temp = s[j];
            s[j--] = s[i];
            s[i++] = temp;
        }
    }
}
