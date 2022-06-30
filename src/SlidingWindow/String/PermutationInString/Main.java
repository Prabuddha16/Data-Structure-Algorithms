package SlidingWindow.String.PermutationInString;

public class Main {
    public boolean checkInclusion(String s1, String s2) {

        //if s1 itself is larger return false
        if(s1.length()>s2.length()) {
            return false;
        }

        //store frequency of s1 and s2. for s1 character add 1 and for s1 subtract 1
        int[] freq = new int[26];

        // prepare freq map till s1 length
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a'] += 1;
            freq[s2.charAt(i) - 'a'] -= 1;
        }

        //loop till length exhaust. at a time we will compare total s1.length characters.
        for(int i=0;i<s2.length()-s1.length();i++) {

            //check if s1 and s2 are anagram of each other.
            if(checkAnagram(freq)) {
                return true;
            }

            //if not update freq map to remove s2 first character and add s2 next character
            freq[s2.charAt(i) - 'a'] += 1;
            freq[s2.charAt(i + s1.length()) - 'a'] -= 1;
        }

        //check for last comparison
        return checkAnagram(freq);
    }

    //check if freq map has all zero. it will be true for anagram
    private boolean checkAnagram(int[] freq) {
        for(int i=0;i<freq.length;i++) {
            if(freq[i]!=0) {
                return false;
            }
        }
        return true;
    }
}
