package Heap.Medium;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements_LC347 {
    public int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) return nums;       
        HashMap <Integer,Integer> map = new HashMap<>();
        for (int i: nums) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<int[]> minheap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        for (int i: map.keySet()) {
            int[] arr = {i,map.get(i)};
            minheap.offer(arr);
            if (minheap.size() > k) minheap.poll();
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) res[i] = minheap.poll()[0];
        return res;
    }
}
