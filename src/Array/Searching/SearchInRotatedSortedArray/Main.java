package Array.Searching.SearchInRotatedSortedArray;

public class Main {
    //t1
    public int search(int[] arr, int target) {
        int low = 0, high = arr.length-1;

        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>=arr[low]){
                if(target>=arr[low] && target<=arr[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(target>=arr[mid] && target<=arr[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }

    //t2
    public boolean searchII(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            if(nums[left] == target || nums[right] == target)
                return true;
            int mid = (left + right) / 2;
            if(nums[mid] == target)
                return true;

            if(target>nums[left] && target < nums[mid])
                right = mid - 1;
            else if(target<nums[right] && target > nums[mid])
                left = mid + 1;
            else{
                left++;
                right--;
            }
        }
        return false;
    }
}
