#include <bits/stdc++.h>
using namespace std;
int is_prime(long long int n)
{
  if(n==3)
    return 1;
  for(long long int i=2;i<=sqrt(n);i++)
    if(n%i==0)
      return 0;
  return 1;
}

int main() 
{
long long int n,c=0,sum=2,m;
  cin>>n;
  m=n;
     if(n>1000000&&n<100000000)
    {
        n=n/1000;
    
    }
    if(n>=100000000)
    {
        n=n/10000;
    }
      
  for(long long int i=3;i<=n;i++)
  {
    if(is_prime(i))
    {
      sum+=i;
      if(is_prime(sum) && sum<=m)
        c++;
    }
  }
  cout<<c;
    return 0;
}