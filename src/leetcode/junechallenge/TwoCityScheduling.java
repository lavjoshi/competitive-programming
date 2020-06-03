package leetcode.junechallenge;

import java.util.Arrays;
import java.util.Comparator;

/*
There are 2N people a company is planning to interview. The cost of flying the i-th person to city A is costs[i][0], and the cost of flying the i-th person to city B is costs[i][1].

Return the minimum cost to fly every person to a city such that exactly N people arrive in each city.
Input: [[10,20],[30,200],[400,50],[30,20]]
Output: 110
Explanation:
The first person goes to city A for a cost of 10.
The second person goes to city A for a cost of 30.
The third person goes to city B for a cost of 50.
The fourth person goes to city B for a cost of 20.

The total minimum cost is 10 + 30 + 50 + 20 = 110 to have half the people interviewing in each city.
 */
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
