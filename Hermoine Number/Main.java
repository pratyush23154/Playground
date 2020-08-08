#include<bits/stdc++.h>
using namespace std;
long long int fact(long long int n)
{
  if(n<=1)
    return 1;
  else
    return (n*fact(n-1))%1000000007;
}
int main(){
int n;cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  int q;
  cin>>q;
  while(q--)
{
    long long int x=1,h=1;
  int l,r;cin>>l>>r;
  for(int i=l;i<=r;i++)
      x=(x*fact(a[i-1]))%1000000007;
for(int i=0;i<r-l;i++)
  h=(h*x)%1000000007;
  cout<<h%1000000007<<endl;
}
  return 0;
}