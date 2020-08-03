package leetcode.aug;

public class IsPalindrome {

    public static void main(String a[]){
        String s= "A man, a plan, a canal: Panama";
        System.out.print(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        char c[] = s.toCharArray();
        while(i<j){
            if(!Character.isLetterOrDigit(c[i])){
                i++;
            }else if(!Character.isLetterOrDigit(c[j])){
                j--;
            }else if(Character.toLowerCase(c[i]) == Character.toLowerCase(c[j])){
                i++;
                j--;
            }else {
                return false;
            }

        }
        return true;
    }
}
