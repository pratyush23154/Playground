#include<iostream>
using namespace std;

int main()
{
  //Type your code here
  int n;
  cin>>n;
  int c1,c2,c5,bal;
  c5=(n-4)/5;
bal=n-(c5*5);
  if(bal%2==0)
    c1=2;
  else
    c1=1;
  c2=(n-(c5*5)-c1)/2;
  cout<<c1+c2+c5<<" "<<c5<<" "<<c2<<" "<<c1;
  return 0;
}