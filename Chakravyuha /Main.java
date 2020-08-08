#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a[n][n],i,j,count=0,k=2,points[10000];points[0]=0;points[1]=0;
  for(i=0;i<(n+1)/2;i++)
  {
    for(j=i;j<n-i-1;j++)
    {
      a[i][j]=++count;
      if(count%11==0)
      {
        points[k++]=i;
        points[k++]=j;
      }
    }
    
     for(j=i;j<n-i-1;j++)
    {
      a[j][n-i-1]=++count;
      if(count%11==0)
      {
        points[k++]=j;
        points[k++]=n-1-i;
      }
    }
    for(j=n-i-1;j>=i;j--)
    {
      a[n-i-1][j]=++count;
      if(count%11==0)
      {
        points[k++]=n-i-1;
        points[k++]=j;
      }
    }
    
    for(j=n-i-2;j>i;j--)
    {
      a[j][i]=++count;
      if(count%11==0)
      {
        points[k++]=j;
        points[k++]=i;
      }
    }
    }
  
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      cout<<a[i][j]<<"\t";
    }
    cout<<"\n";
  }
  cout<<"Total Power points : "<<k/2<<"\n";
  for(int i=0;i<k;i+=2)
    cout<<"("<<points[i]<<", "<<points[i+1]<<")"<<"\n";
  }