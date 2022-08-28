package Interview.Basic.FindPivotIndex;

public class Main {
    public int pivotIndex(int[] nums) {
        int sum=0;

        for(int i : nums){
            sum += i;;
        }

        int l = 0, r = sum;
        for(int i=0;i<nums.length;i++){
            r -= nums[i];
            if(l == r){
                return i;
            }
            l += nums[i];
        }
        return -1;
    }
}
