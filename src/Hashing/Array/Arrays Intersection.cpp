#include <iostream>
#include <unordered_map>
#include <vector>
#include <algorithm>
using namespace std;
int main()
{
    unordered_map<int, int> f;
    int n;
    cin >> n;
    int t;
    for (int i = 0; i < n; i++)
    {
        cin >> t;
        f[t]++;
    }
    vector<int> ans;
    for (int i = 0; i < n; i++)
    {
        cin >> t;
        if (f.find(t) != f.end() && f[t] > 0)
        {
            f[t]--; 
            ans.push_back(t);
        }
    }
    sort(ans.begin(), ans.end());
    cout << "[";
    for (int i = 0; i < ans.size(); i++)
    {
        cout << ans[i];
        if (i < ans.size() - 1)
            cout << ", ";
    }
    cout << "]";
    return 0;
}