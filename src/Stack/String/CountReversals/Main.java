package Stack.String.CountReversals;

import java.util.Stack;

public class Main {
    int countRev (String s)
    {
        Stack<Character> st = new Stack<>();
        int count=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(st.empty()){
                if(s.charAt(i)=='}'){
                    ans++;
                }

                st.push('{');
            }else{
                if(s.charAt(i)=='}')
                    st.pop();
                else{
                    st.push('{');
                }
            }
        }
        if(st.size()%2==0){
            ans+=st.size()/2;
            return ans;
        }
        return -1;
    }
}
