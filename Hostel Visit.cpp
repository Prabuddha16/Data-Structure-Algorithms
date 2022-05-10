#include<iostream>
#include<queue>
using namespace std;

int main(){
	long long int n,k;
	cin>>n>>k;
	priority_queue<long long int> p;
	for(int i=0; i<n; i++){
		long long int itr,x,y;
		cin>>itr;
		if(itr==1){
			cin>>x>>y;
			long long int distance = (x*x)+(y*y);
			if(p.size()<k){
				p.push(distance);
			}
			else if(distance<p.top()){
				p.pop();
				p.push(distance);
			}
		}
		else if(itr==2){
			cout<<p.top()<<endl;
		}
	}
}