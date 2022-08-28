package Interview.Array.BoyerMoreMajorityVoteAlgo.MooreAlgo;
//o(n) / o(1)
public class Main {
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
}
