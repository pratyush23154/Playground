#include<iostream>
#include<math.h>
using namespace std;
void divisors(int n)
{
  int k=0,x=sqrt(n);
  int arr[x];
  for(int i=1;i<=sqrt(n);i++)
  {
    if(n%i==0)
    {
      if(n/i==i)
        cout<<i<<" ";
      else
      {
        cout<<i<<" ";
        arr[k]=n/i;
        k++;
      }
    }
  }
    for(int i=k-1;i>=0;i--)
      cout<<arr[i]<<" ";
}
    

int main()
{
  //Type your code here
  int n;
  cin>>n;
  divisors(n);
  return 0;
}