package Backtracking_Recursion.Recursion.AllPossibleSubsets;

import java.util.*;

//for unique elements with null subset
public class Main {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();
        sol.add(new ArrayList<>());
        for(int num:nums){
            int n = sol.size();
            for(int i=0; i<n; i++){
                List<Integer> ans = new ArrayList<>(sol.get(i));
                ans.add(num);
                sol.add(ans);
            }
        }
        return sol;
    }
}

//for duplicates with null subset
class Solve {
    List<List<Integer>> sol = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(new ArrayList<>(), nums, 0);
        return sol;
    }
    private void backtrack(List<Integer> curr, int[] nums, int start) {
        sol.add(new ArrayList<>(curr));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                // skip duplicates
                continue;
            }
            curr.add(nums[i]);
            backtrack(curr, nums, i + 1);
            curr.remove(curr.size() - 1);
        }
    }
}

//for unique elements subsets without null
class Solution
{
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A)
    {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> temp=new ArrayList<>();
        solve(0,A,temp,ans);

        Collections.sort(ans,new MIN());
        return ans;

    }
    static void solve(int start,ArrayList<Integer> A, ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> ans)
    {
        ans.add(new ArrayList<Integer>(temp));

        if(start>=A.size()) return ;
        for(int i=start;i<A.size();i++)
        {
            temp.add(A.get(i));
            solve(i+1,A,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
    static class MIN implements Comparator<ArrayList<Integer>>
    {
        public int compare(ArrayList<Integer> a,ArrayList<Integer> b)
        {
            for(int i=0;i<Math.min(a.size(),b.size());i++)
            {
                if(a.get(i)>b.get(i)) return 1;
                else if(a.get(i)<b.get(i)) return -1;
                else continue;
            }
            return a.size()-b.size();
        }
    }
}
