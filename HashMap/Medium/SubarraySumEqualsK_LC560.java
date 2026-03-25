package HashMap.Medium;

import java.util.HashMap;

public class SubarraySumEqualsK_LC560 {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        int cursum = 0;
        HashMap<Integer , Integer> prefixsum = new HashMap<>();
        prefixsum.put(0,1);
        for (int n:nums) {
            cursum += n;
            int diff = cursum - k;
            ans += prefixsum.getOrDefault(diff , 0);
            prefixsum.put(cursum , prefixsum.getOrDefault(cursum , 0) + 1);

        }

        return ans;
    }
}
