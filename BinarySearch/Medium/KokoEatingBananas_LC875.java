package BinarySearch.Medium;

public class KokoEatingBananas_LC875 {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        int l = 1; int r = max;
        while(l<r) {
            int m = l + (r-l)/2; int k = 0;
            for(int i=0;i<piles.length;i++) {
                k += (piles[i] + m - 1) / m;
            }
            if (k <= h) r = m;
            else l = m + 1;
        }
        return l;
    }
}
