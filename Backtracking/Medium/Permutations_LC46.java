package Backtracking.Medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations_LC46 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        bt(nums,0);
        return res;
    }
    public void bt(int[] nums, int i) {
        if (i == nums.length) {
            List<Integer> r = new ArrayList<>();
            for (int n:nums) {
                r.add(n);
            }
            res.add(r);
            return;
        }
        for (int n=i;n<nums.length;n++) {
            swap(i,n , nums);
            bt(nums,i+1);
            swap(i,n , nums);
        }
        
    }
    public void swap(int a , int b , int[] nums) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
