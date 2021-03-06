#include<bits/stdc++.h>
#include<map>
#include<vector>
using namespace std ;

class node{
public:
	int data ;
	node* left ;
	node* right ;
	node(int d){
		data = d;
		left = NULL ;
		right = NULL ;
	}
} ;

node *solve()
{
    int d;
    cin>>d;
    queue<node *>q;
    node *root=new node(d);
    q.push(root);
    int c1,c2;
    while(!q.empty())
    {
        node *f=q.front();
        q.pop();
        cin>>c1>>c2;
        if(c1!=-1)
        {
            f->left=new node(c1);
            q.push(f->left);
        }
        if(c2!=-1)
        {
            f->right=new node(c2);
            q.push(f->right);
        }
    }
    return root;
}


void order(node* root, int p, map<int, vector<int>> &m){

	if(root == NULL) 
		return ;
	m[p].push_back(root->data) ;
	order(root->left,p-1,m) ;
	order(root->right,p+1,m) ;
	return ; 
}
int main()
{
    int n;
    cin>>n;
	node* root = solve() ;
	int p = 0 ;
	map<int,vector<int>> m ;
	order(root,p,m) ;
	for(auto s:m){
		//cout << s.first << " " ;
		for(int l:s.second){
			cout << l << " " ;
		}
	}
	return 0;
}