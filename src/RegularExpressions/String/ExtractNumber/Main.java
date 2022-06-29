package RegularExpressions.String.ExtractNumber;

class Main{
    long ExtractNumber(String S){
        Long max=Long.MIN_VALUE;
        String arr[]=S.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            if(Character.isDigit(arr[i].charAt(0)))
            {
                if(!arr[i].contains("9"))
                    max=Math.max(max,Long.parseLong(arr[i]));
            }
        }
        return max==Long.MIN_VALUE?-1:max;
    }
}
