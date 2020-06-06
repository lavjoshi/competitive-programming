package leetcode.junechallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueueReconstruction {


    public static void main(String []args){
        int people [][]= {
                {7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}
        };
        print(people);
        people = reconstructQueue(people);
        print(people);

    }

    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) ->{
            return a[0] == b[0] ? a[1] - b[1] : b[0] - a[0];
        });
        List<int[]> actualArr = new ArrayList();
        for(int[] arr : people){
            actualArr.add(arr[1],arr);
        }
        return actualArr.toArray(new int[people.length][2]);
    }

    public static void print(int [][] people){
        System.out.println();
        for(int[] arr : people){
            System.out.print(arr[0]+ "," + arr[1] + "--");
        }
    }
}
