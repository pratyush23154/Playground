#include<iostream>
using namespace std;

int main()
{
  //Type your code here
  int s,r;
  cin>>s>>r;
  int a[s];
  for(int i=0;i<s;i++)
    cin>>a[i];
  int bmin[r],bmax[r],c=0;
  for(int i=0;i<r;i++)
    cin>>bmin[i]>>bmax[i];
  for(int i=0;i<r;i++)
  {for(int j=0;j<s;j++){
    if(a[j]>=bmin[i] && a[j]<=bmax[i])
      c++;
  }
   cout<<c<<" ";
   c=0;
  }
}