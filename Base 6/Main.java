#include<iostream>
using namespace std;

int main()
{
int n,dd,r;
  cin>>n;
  int d[n],h[n],k=0,m=0,sum,s[n],c=0;
  for(int i=0;i<n;i++)
    cin>>d[i];
  for(int i=0;i<n;i++)
  {r=0,sum=0;
    while(d[i]>0)
    {
      dd=d[i]%6;
      sum+=dd;
      r=(r*10)+dd;
      d[i]=d[i]/6;
    }
   s[m++]=sum;
   h[k++]=r;
  }
  for(int i=0;i<m;i++)
  {
    for(int j=i+1;j<m;j++)
    if(s[i]>s[j])
       c++;
  }
cout<<c;
  return 0;
}