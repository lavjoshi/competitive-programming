package leetcode.junechallenge;

import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduling {



    public static void main(String args[]){
        int arr[][] = {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};
        System.out.println(twoCitySchedCost(arr));
    }

    public static int twoCitySchedCost(int[][] costs) {
        int max = costs.length /2 ;
        int cityA = 0;
        int cityB = 0;
        int cost = 0;
        Comparator<int[]> c =  new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Math.abs(o2[0]-o2[1]) - Math.abs(o1[0]-o1[1]);
            }
        };
        Arrays.sort(costs,c);
        for(int i=0;i<costs.length;i++){
            if(cityA == max){
                cost += costs[i][1];
                cityB++;
            }else if(cityB == max){
                cost += costs[i][0];
                cityA++;
            }else if(costs[i][0] > costs[i][1]){
                cost += costs[i][1];
                cityB++;
            }else{
                cost += costs[i][0];
                cityA++;
            }



        }

        return cost;
    }

}
