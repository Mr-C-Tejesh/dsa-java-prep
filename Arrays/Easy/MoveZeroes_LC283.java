public class MoveZeroes_LC283 {
    public void moveZeroes(int[] nums) {
        int s = 0;
        for (int f=0;f<nums.length;f++) {
            if (nums[f] != 0) {
                int temp = nums[s];
                nums[s] = nums[f];
                nums[f] = temp;
                s++;
            }
        }
    }
}
