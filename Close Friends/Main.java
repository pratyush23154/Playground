#include<iostream>
using namespace std;
int main(){
int k,n,t;
  cin>>k>>n>>t;
  int a[n][n];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
  }
  int p[n],r[n];
  for(int i=0;i<n;i++)
    cin>>p[i];
  for(int i=0;i<n;i++)
    cin>>r[i];
  int z;
  for(int i=0;i<n;i++)
  {z=0;
    for(int j=0;j<n;j++)
      a[i][j]=a[i][j]*p[z++];
  }
  int count=0,value=0,wtp=0;
  for(int i=0;i<n;i++)
  {
    value=p[i];
    wtp=value*r[i];
    for(int j=0;j<n;j++)
    {
      if(value>=k && wtp<=t)
      {
        count++;
        break;}
      wtp+=a[i][j]*r[j];
      value+=a[i][j];
    }
    value=0;wtp=0;
  }
  cout<<count;
  return 0;
}