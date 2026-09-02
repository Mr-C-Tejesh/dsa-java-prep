package Backtracking.Medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum_LC39 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> l = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        cob(0,candidates,target);
        return res;
    }
    public void cob(int i , int[] can, int t) {        
        if (t<0) return;
        if(i==can.length) return;
        if (t==0) {
            res.add(new ArrayList<>(l));
            return;
        }
        l.add(can[i]);
        cob(i,can,t-can[i]);
        l.remove(l.size()-1);
        cob(i+1,can,t);
    }
}
