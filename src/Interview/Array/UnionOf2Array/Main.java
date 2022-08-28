package Interview.Array.UnionOf2Array;
//t=min(m,n) s=min(n,m)
import java.util.*;
class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            int n,m;
            n=sc.nextInt();
            m=sc.nextInt();
            int[] a =new int[n];
            int[] b =new int[m];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(int i=0;i<m;i++)
            {
                b[i]=sc.nextInt();
            }
            Solution ob=new Solution();
            System.out.println(ob.doUnion(a,n,b,m));
        }

    }
}

class Solution{

    //m-1
    public static int doUnion(int[] a, int n, int[] b, int m)
    {
        int min = Math.min(n, m);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < min; i++) {
            set.add(a[i]);
            set.add(b[i]);
        }
        if (n > m) {
            for (int i = m; i < n; i++) {
                set.add(a[i]);
            }
        }
        else if (n < m) {
            for (int i = n; i < m; i++) {
                set.add(b[i]);
            }
        }
        return set.size();
    }

    //m-2
    void union(int a[],int b[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }
        System.out.println(set);
    }
}
