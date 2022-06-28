package Array.TwoPointer.NextPermutation;


import java.util.ArrayList;
import java.util.List;

class Solution{
        static List<Integer> nextPermutation(int N, int[] arr){
            List<Integer> res= new ArrayList<>();
            if(arr==null) return res;
            if(N==1){
                res.add(arr[0]);
                return res;
            }

            int i=N-2;
            while(i>=0 && arr[i] >= arr[i+1]) i--;
            if(i>=0){
                int j=N-1;
                while(j>=0 && arr[j]<=arr[i]) j--;
                swap(arr,i,j);
            }
            reverse(arr,i+1,N-1);
            makeList(arr,res);
            return res;
        }
        static void swap(int[] a,int i,int j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        static void reverse(int[] a,int i,int j){
            while(i<j){
                swap(a,i++,j--);
            }
        }

        static void makeList(int[] a, List<Integer> l){
            for(int i : a){
                l.add(i);
            }
        }
    }
