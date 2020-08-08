#include<bits/stdc++.h>
using namespace std;
int main(){
  int t;
  cin>>t;
  while(t--)
  {
    int r,n;cin>>r>>n;long long int fact[n+2];  long long int arrange,res;
    if(r>=n)
      cout<<"1"<<"\n";
    else
    {
 
      int pa=n/r;
      int pb=pa+1;
      int tb=n%r;
     int  ta=r-tb;
      fact[0]=1;
      for(int i=1;i<=n+1;i++)
        fact[i]=i*fact[i-1];
      res=fact[n]/(pow(fact[pa],ta) * pow(fact[pb],tb) * fact[ta] * fact[tb] );
      if(pb>=4)
        arrange=res*(pow(fact[pa-1]/2,ta)) * (pow(fact[pb-1]/2,tb));
      else
        arrange=res;
      cout<<arrange<<"\n";
    }
  }
  return 0;
}