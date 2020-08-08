#include<iostream>
using namespace std;

int main()
{
int t;
  cin>>t;
  while(t--)
  {
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
      cin>>a[i];
    int time=0,sum=a[0];
    for(int i=0;i<n-1;i++)
    {
      sum+=a[i+1];
      time+=sum;
    }
    cout<<time;
  }
  return 0;
}