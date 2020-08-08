#include<bits/stdc++.h>
using namespace std;

int main()
{
  int p,t;
  float r,i,ra,pa;double fa;
  cin>>p>>t>>r;
  if(p<=0 || t<=0 ||r<0)
    return 0;
  else
  {
  ra=p;
  while(t--)
  {
    pa=ra/(1+r/1200.00);
    i=ra-pa;
    ra=ra+p-i;
  }
    ra=ra-p; 
    fa=ceil(ra-0.5);
    if(fa>ra)
      fa=ceil(ra);
    else
      fa=floor(ra);
   
    cout<<fa;
  }
  return 0;
}