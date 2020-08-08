#include<iostream>
using namespace std;

int main()
{
int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  int f=0,max=0,maxi=0,i;
  for(i=0;i<n-1;i++)
  {
    f++;
    if(a[i]>a[i+1])
    {
      if(f>max)
      {
        max=f;
        maxi=i-f+1;
      }
      f=0;
    }
  }
 f++;
  if(f>max)
  {
    max=f;
    maxi=i-f+1;
  }
  for(i=maxi;i<maxi+max;i++)
    cout<<a[i]<<" ";
}