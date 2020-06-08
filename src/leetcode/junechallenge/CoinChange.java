package leetcode.junechallenge;

import java.util.HashMap;
import java.util.Map;

public class CoinChange {


    private static Map<String,Integer> map = new HashMap();


    public static void main(String args[]){
        int [] coins = {1,2,5};
       System.out.println( change(5,coins));
    }
    public static int change(int amount, int[] coins) {
        return findWays(coins,amount,0);
    }

    public static int findWays(int[] coins, int target, int i){
        if(target == 0){
            return 1;
        }

        if(target < 0){
            return 0;
        }
        if(i == coins.length && target > 0){
            return 0;
        }
        String key = target +"-"+i;
        if(map.containsKey(key)){
            return map.get(key);
        }

        map.put(key,findWays(coins,target-coins[i],i) + findWays(coins,target,i+1));
        return map.get(key);

    }
}
