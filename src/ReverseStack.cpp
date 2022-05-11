#include <bits/stdc++.h>
using namespace std;

class Solution{
public:
    vector<int> Reverse(stack<int> St){
       vector<int>ans;
       while(!St.empty())
       {
           int x=St.top();
           St.pop();
           ans.push_back(x);
       }
       return ans;
    }
};

int main(){
    int T;
    cin>>T;
    while(T--){
        int N;
        cin>>N;
        stack<int> St;
        for(int i=0;i<N;i++){
            int x;
            cin>>x;
            St.push(x);
        }
        Solution ob;
        vector<int> ans=ob.Reverse(St);
        for(int i=0;i<N;i++){
            cout<<ans[i];
            if(i!=N-1)
                cout<<" ";
        }
        cout<<endl;
    }
}