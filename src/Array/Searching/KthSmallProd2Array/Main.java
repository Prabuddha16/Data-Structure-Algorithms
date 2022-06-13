package Array.Searching.KthSmallProd2Array;

public class Main {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        long left = (long)-1e11;
        long right = (long)1e11;
        while(left < right){
            long mid = left + (right - left) / 2;
            if(countSmaller(nums1, nums2, mid) >= k){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left - 1;
    }

    private long countSmaller(int[] nums1, int[] nums2, long product){
        long count = 0;
        for(int i = 0; i < nums1.length; i++){
            if(nums1[i] >= 0){
                int left = 0;
                int right = nums2.length;
                while(left < right){
                    int mid = left + (right - left) / 2;
                    if((long) nums1[i] * nums2[mid] < product){
                        left = mid + 1;
                    } else {
                        right = mid;
                    }
                }
                count += left;
            } else {
                int left = 0;
                int right = nums2.length;
                while(left < right){
                    int mid = left + (right - left) / 2;
                    if((long) nums1[i] * nums2[mid] >= product){
                        left = mid + 1;
                    } else {
                        right = mid;
                    }
                }
                count += nums2.length - left;
            }
        }
        return count;
    }
}
