#include<iostream>
using namespace std;

int main()
{
int t;
  cin>>t;
  while(t--)
  {
    int n,c,time=1;
    cin>>n;
    int a[n];
    char alpha[n],a1[n],a2[n],ch='a';
    for(int i=0;i<n;i++)
    {
      cin>>a[i];
      alpha[i]=ch++;
      a1[i]=alpha[i];
    }
    while(1)
    {c=0;
    for(int i=0;i<n;i++)
    {
      a2[a[i]-1]=a1[i];
    }
      for(int i=0;i<n;i++)
      {
      if(a2[i]==alpha[i])
        c++;
      }
    if(c==n)
      break;
      else
      {
        for(int i=0;i<n;i++)
          a1[i]=a2[i];
      }
      time++;
  }
    cout<<time<<endl;
  }
  return 0;
}