package Array.Array.MajorityElement;

public class Main {
     /*
     Find the majority element in the array.
     A majority element in an array A of size N is an element that appears more than N/2 times in the array.
     */
    static int majorityElement(int[] a, int size)
    {
        int ans=0;
        int c=1;
        for(int i=0;i<size;i++){
            if(a[i]==a[ans]){
                c++;
            }else{
                c--;
            }
            if(c==0){
                ans=i;
                c=1;
            }
        }
        float co=0;
        for(int i=0;i<size;i++){
            if(a[i]==a[ans])
                co++;
        }
        if(co>(size/2))
            return a[ans];
        return -1;
    }

    //Moore's Sorting Algo
    public int majorityElement(int[] nums) {
        int ans=0;
        int c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[ans]){
                c++;
            }else{
                c--;
            }
            if(c==0){
                ans=i;
                c=1;
            }
        }
        return nums[ans];
    }

    void main(String[] args){
        int[] a = {3,1,3,3,2};
        int n = a.length;
        majorityElement(a,n);
        majorityElement(a);
    }
}
