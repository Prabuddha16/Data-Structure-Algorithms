package Backtracking_Recursion.Recursion.SubsetSum;

//t=2^n s=2^n

class Main {
    static void subsetSums(int[] arr, int l, int r, int sum)
    {
        if (l > r) {
            System.out.print(sum + " ");
            return;
        }
        subsetSums(arr, l + 1, r, sum + arr[l]);
        subsetSums(arr, l + 1, r, sum);
    }

    public static void main(String[] args)
    {
        int[] arr = { 5, 4, 3 };
        int n = arr.length;

        subsetSums(arr, 0, n - 1, 0);
    }
}




/*
class Solution{
    private ArrayList<Integer> ls=new ArrayList<>();
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int  n){
        getSum(0,arr,n,0);
        Collections.sort(ls);
        return ls;
    }
    public  void getSum(int i,ArrayList<Integer> arr,int n,int sum){
        if(i==n){
            ls.add(sum);
            return;
        }
        getSum(i+1,arr,n,sum+arr.get(i));
        getSum(i+1,arr,n,sum);
    }
}
*/

