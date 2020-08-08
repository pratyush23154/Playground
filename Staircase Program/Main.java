#include <iostream>
using namespace std;
long int total_ways(int c,int n,long int res[])
{
    int temp;
  if(c>n)
    return 0;
  else if(c==n)
    return 1;
  else if(res[c]!=-1)
    return res[c];
    temp= total_ways(c+1,n,res)+total_ways(c+2,n,res);
  res[c]=temp;
  return temp;
}

int main() 
{
   int n;
  cin>>n;
  long int res[n+1];
  for(int i=0;i<=n;i++)
    res[i]=-1;
   cout << total_ways(0,n,res);
    return 0;
}