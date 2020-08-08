#include<iostream>
using namespace std;

int main()
{
 int n;
  cin>>n;
  long h[n],cap[n];
  for(int i=0;i<n;i++){
    cin>>h[i];
    cap[i]=i+1;
  }
  int m;
  cin>>m;
  long b[m];
  for(long i=0;i<m;i++)
    cin>>b[i];
  int p[m],c[n],max;c[0]=0;int flag;
    for(int i=0;i<m;i++)
    {flag=0;
      for(int j=n-1;j>=0;j--)
      {
      if(b[i]<=h[j] && cap[j]){
        p[i]=j+1;cap[j]--;flag=1;break;}
    }
    if(flag==0)
      p[i]=0;
  }
  for(int i=0;i<m;i++)
    cout<<p[i]<<" ";
  return 0;
}