package Interview.Basic.MoveZeroesToLast;

public class Main {
    public void moveZeroes(int[] nums) {
        int firstZero =0;
        for(int i =0; i< nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[firstZero];
                nums[firstZero] = nums[i];
                nums[i] = temp;
                firstZero++;
            }
        }
    }

    public void moveZero(int[] arr){
        int n=arr.length;
        int l=0;
        int h=n-1;

    }
}
