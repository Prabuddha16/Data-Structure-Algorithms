package Interview.Array.DutchNationalFlagAlgo.SortColorsTwoPointers;

public class Main {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0;
        int m = 0;
        int h = n-1;
        while(m <= h){
            if(nums[m]==0){
                swap(nums,l,m);
                l++;
                m++;
            }else if(nums[m]==1){
                m++;
            }else{
                swap(nums,m,h);
                h--;
            }
        }
    }

    public void swap(int[] arr, int l, int r){
        int t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }
}
