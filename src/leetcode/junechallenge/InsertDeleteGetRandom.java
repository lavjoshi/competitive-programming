package leetcode.junechallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
Design a data structure that supports all following operations in average O(1) time.

insert(val): Inserts an item val to the set if not already present.
remove(val): Removes an item val from the set if present.
getRandom: Returns a random element from current set of elements. Each element must have the same probability of being returned.
 */
public class InsertDeleteGetRandom {   /** Initialize your data structure here. */
List<Integer> list;
    Map<Integer,Integer> map ;
    public InsertDeleteGetRandom() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        list.add(val);
        map.put(val,list.size()-1);
        return true;

    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        int indexToRemove = map.get(val);
        list.set(indexToRemove, list.get(list.size()-1));
        map.put(list.get(indexToRemove),indexToRemove);
        map.remove(val);
        list.remove(list.size()-1);
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        int i = (int)(Math.random() * list.size());
        return list.get(i);

    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */