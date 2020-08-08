#include<bits/stdc++.h>
using namespace std;
int main(){
int n,t;
  cin>>n>>t;
  int a[n][t+1];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<t+1;j++){
      cin>>a[i][j];}
  }
  int max=0,c[n];int res=0;
  int temp[n];
  for(int i=0;i<n;i++)
  {temp[i]=0;c[i]=0;}
  for(int sec=2;sec<=t;sec+=2)
  {
    for(int j=0;j<n;j++){
      temp[j]+=(a[j][sec-2]+a[j][sec-1])*a[j][t];

      if(temp[j]>max)
        max=temp[j];
    }
    for(int j=0;j<n;j++)
    {
      if(max==temp[j])c[j]++;
    }
  }
  int index;
  for(int j=0;j<n;j++){
    if(c[j]>res){
      res=c[j];
      index=j+1;}
  }
  cout<<index;
  return 0;
}