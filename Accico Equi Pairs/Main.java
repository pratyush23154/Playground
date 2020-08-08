#include <iostream>
using namespace std;
int sum(int x,int y,int a[])
{
  int s=0;
  for(int i=x;i<=y;i++)
    s+=a[i];
  return s;
}
int main() 
{
int n;
  cin>>n;
  int p[n];
  for(int i=0;i<n;i++)
    cin>>p[i];
int flag=0,a,b;
  for(int i=0;i<n;i++)
  {a=i;
    for(int j=i+2;j<n;j++)
    {
        b=j;
      if(sum(0,a-1,p)==sum(a+1,b-1,p) && sum(a+1,b-1,p)==sum(b+1,n-1,p)){
        cout<<"Indices which form equi pair {"<<a<<","<<b<<"}"<<endl;
        cout<<"Slices are {0,"<<a-1<<"},{"<<a+1<<","<<b-1<<"},{"<<b+1<<","<<n-1<<"}";
        flag=1;break;
      }
    }
      if(flag==1)
        break;
    }
      if(flag==0)
        cout<<"Array does not contain any equi pair";
    return 0;
}