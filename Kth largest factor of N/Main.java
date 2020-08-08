#include<bits/stdc++.h>
using namespace std;

int main()
{
  //Type your code here
  unsigned int n;
  int k,count=0;
  cin>>n>>k;
  if(k==1)
    cout<<n;
  else{k--;
  for(int i=n/2;i>=1;i--)
  {
    if(n%i==0)
      count++;
      if(count==k){
        cout<<i;break;
      }
  }
    if(count!=k)cout<<1;
  }
  return 0;
}