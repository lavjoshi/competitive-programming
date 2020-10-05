package leetcode.aug;

public class TitleToNumber {


    public static void main(String s[]){
        System.out.print(titleToNumber("ZY"));
    }
    public static int titleToNumber(String s) {
        int sum = 0;
        int x=0;
        for(int i=s.length()-1;i>=0;i--){
            int temp = s.charAt(i) - 'A' +1;
            if(x==0){
                sum+= temp ;
                x++;
                continue;
            }
            int powSum = (int)Math.pow(26,x);
            sum += powSum * temp;
            x++;
        }
        return sum;
    }
}
