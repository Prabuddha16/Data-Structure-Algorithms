package Interview.String.StringInputtedOrNot;


public class Main {
    public static void main(String[] agrs)
    {
        int c=0;
        String a[] = {"Geeks","Hello","Great","Geeks","Hello"};

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<i;j++)
            {
                c=0;
                if(a[i]==a[j])
                {
                    c++;
                    break;
                }
            }
            if(c==0)
                System.out.println("no");
            else
                System.out.println("yes");

        }
    }
}