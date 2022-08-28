package Interview.String.LongestString;

public class Main {
    String longest(String[] names, int n) {
        int max=0;
        for(int i=0;i<n;i++){
            if(names[i].length()>names[max].length()){
                names[max]=names[i];
            }
        }
        return names[max];
    }
}
