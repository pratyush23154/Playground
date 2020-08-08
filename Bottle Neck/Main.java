#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a[n],check[n];
  for(int i=0;i<n;i++){
    cin>>a[i];
    check[i]=-1;
}
  int start=0;
  sort(a,a+n);
  for(int i=1;i<n;i++)
  {
    if(a[start]<a[i] && check[i]==-1)
    {
      start++;
      check[i]=1;
    }
  }
  cout<<n-start;
  return 0;
}