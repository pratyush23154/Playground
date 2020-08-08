#include<iostream>
using namespace std;
int count(int i,int j)
{
  int c=0;
  while(i &&  j)
  {
    c++;
    if(i>=j)
      i-=j;
    else
      j-=i;
  }
  return c;
}
int main()
{
  int p,q,r,s,sum=0;
  cin>>p>>q>>r>>s;
  for(int i=p;i<=q;i++)
  for(int j=r;j<=s;j++)
    sum+=count(i,j);
  cout<<sum;
  return 0;
}