package Array.ShortUnsortedContigSubArray;

public class Main {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[n-1];
        int high = 0, low = 1;

        for(int i=0, j=n-1; i < n; i++, j--){
            if(nums[i] < max)
                high = i;
            if(nums[j] > min)
                low = j;
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[j]);
        }
        return high - low + 1;
    }
}
