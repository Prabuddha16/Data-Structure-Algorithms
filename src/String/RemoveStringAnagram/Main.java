package String.RemoveStringAnagram;


import java.util.*;

class GFG{
    static List<String> removeAnagrams(String[] arr, int N)
    {
        Vector<String> ans = new Vector<>();
        HashSet<String> found = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String word = arr[i];
            word = sort(word);
            if (!found.contains(word)) {
                ans.add(arr[i]);
                found.add(word);
            }
        }

        Collections.sort(ans);
       // for (String an : ans) {
           // System.out.print(an + " ");
        //}
        return ans;
    }
    static String sort(String inputString)
    {
        char[] tempArray = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    public static void main(String[] args)
    {
        String[] arr
                = { "geeks", "keegs",
                "code", "doce" };
        int N = 4;

        List<String> res = removeAnagrams(arr, N);
        System.out.println(res);
    }
}

