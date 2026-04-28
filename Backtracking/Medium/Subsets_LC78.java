package Backtracking.Medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets_LC78 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> l = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        rec(0,nums);
        return res;
    }
    public void rec(int i , int[] nums) {
        if (i >= nums.length) {
            res.add(new ArrayList<>(l));
            return;
        }
        l.add(nums[i]);
        rec(i+1, nums);
        l.remove(l.size() - 1);
        rec(i+1,nums);
    }
}
