#include <bits/stdc++.h>
using namespace std;
#define MAX(a,b) (a>b)?a:b
int sum(int n,int k,int curr,int a[],int res[])
{
  if(curr>=n)
    return 0;
  if(res[curr]!=-1)
    return res[curr];
  int picked=a[curr]+sum(n,k,curr+k+1,a,res);
  int not_picked=sum(n,k,curr+1,a,res);
  res[curr]=MAX(picked,not_picked);
  return res[curr];
}
int temp(int n,int k,int a[])
{
  int res[n];
  for(int i=0;i<n;i++)
    res[i]=-1;
  return sum(n,k,0,a,res);
}

int main() 
{
  string s;
  cin>>s;
  stringstream ss(s);
  vector<int> v;
  int n,k;
  for(int i;ss>>i;)
  {
    v.push_back(i);
    if (ss.peek()==',')
      ss.ignore();
  }
 n=v[0];
  k=v[1];
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
    cout<<temp(n,k,a);
    return 0;
}