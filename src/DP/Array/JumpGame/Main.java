package DP.Array.JumpGame;

public class Main {
    public boolean canJump(int[] nums) {
        boolean[] possible = new boolean[nums.length];
        possible[nums.length-1]= true;

        for(int i=nums.length-1; i>=0; i--){
            int Maxjump = nums[i];
            int jump = 0;
            while(jump <= Maxjump && i + jump < nums.length){
                if(possible[jump + i]){
                    possible[i] = true;
                    break;
                }
                jump++;
            }
        }
        return possible[0];
    }
}
