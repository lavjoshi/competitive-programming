package leetcode.junechallenge;

import java.util.*;

public class ReconstructItinerary {


    public static void main(String args[]){
        List<String> list;
        List<List<String>> listList = new ArrayList<>();
        list = new ArrayList<>();
        list.add("JFK");
        list.add("KUL");
        listList.add(list);
        list = new ArrayList<>();
        list.add("JFK");
        list.add("NRT");
        listList.add(list);
        list = new ArrayList<>();
        list.add("NRT");
        list.add("JFK");
        listList.add(list);
//       [["JFK","KUL"],["JFK","NRT"],["NRT","JFK"]]

        findItinerary(listList);


    }
    public static List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> map = new  HashMap();
        for(List<String> ticket : tickets){
            map.putIfAbsent(ticket.get(0),new PriorityQueue<>());

            map.get(ticket.get(0)).add(ticket.get(1));
        }
        LinkedList<String> result = new LinkedList<>();
        dfs(map,"JFK",result);
        System.out.print(result);
        return result;
    }

    public static void dfs( Map<String, PriorityQueue<String>> map,String current,LinkedList<String> result){


        PriorityQueue<String> pq = map.get(current);
        while(pq!=null && !pq.isEmpty()){
            String s = pq.poll();
            dfs(map,s,result);
        }
        result.addFirst(current);

    }
}
