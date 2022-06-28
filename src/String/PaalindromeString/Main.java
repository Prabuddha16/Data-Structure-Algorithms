package String.PaalindromeString;
//using recursion
    class Main {
        public static boolean isPalindrome(int i, int j, String A){
            if (i >= j) {
                return true;
            }
            if (A.charAt(i) != A.charAt(j)) {
                return false;
            }
            return isPalindrome(i + 1, j - 1, A);
        }
        public static boolean isPalindrome(String A)
        {
            return isPalindrome(0, A.length() - 1, A);
        }

        public static void main(String[] args)
        {
            String A = "aabbababbaa";
            A = A.toLowerCase();
            boolean str = isPalindrome(A);
            System.out.println(str);
        }
    }

    //without recursion
    class Solution{
        int isPalindrome(String s) {
            int i=0;
            int j=s.length()-1;
            while(i<j)
            {
                if(s.charAt(i)!=s.charAt(j))
                    return 0;
                i++;
                j--;
            }
            return 1;
        }
    }
