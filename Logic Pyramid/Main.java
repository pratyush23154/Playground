#include<bits/stdc++.h>
using namespace std;
int main()
{
int n;
  cin>>n;
  int k=2;
  for(int i=1;i<=n;i++)
  {
  for(int space=5*(n-i);space>0;space--)
    cout<<" ";
    for(int j=1;j<=i;j++)
    {
      cout<<setfill('0')<<setw(5)<<k*(2*k-1)<<"     ";
          k+=2;
    }

    cout<<endl;
  }
  return 0;
}