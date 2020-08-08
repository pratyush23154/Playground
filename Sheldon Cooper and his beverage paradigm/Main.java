#include<bits/stdc++.h>
using namespace std;
bool bev(int a[],int n,int x)
{
  int m,start,end,k,flag=0,i=0;
    for(int j=i+1;j<n;j++)
    {
       k=a[i];m=x-k;
      start=j;
      end=n-1;
      while(start<end)
      {
      if(a[start]+a[end]==m)
        return true;
      else if(a[start]+a[end]>m && start<end)
        end--;
      else if(a[start]+a[end]<m && start<end)
        start++;
    }
  i++;
    }
return false;
}
int main(){
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  int x;
  cin>>x;
  sort(a,a+n);
int ans=bev(a,n,x);
  if(ans==1)
    cout<<"TRUE";
  else
    cout<<"FALSE";
  return 0;
}