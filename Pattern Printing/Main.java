#include<iostream>
using namespace std;

int main()
{
  //Type your code here
  int n;
  cin>>n;
  int val=10;
  int b=((n*n)+1)*10;
  for(int i=n;i>0;i--)
  {
    int star=n-i;
    while(star>0){
      cout<<"**";
    star--;
    }
    for(int l1=1;l1<=i;l1++){
      cout<<val;
    val+=10;
    }
    for(int l2=1;l2<i;l2++)
    {
      cout<<b;
      b+=10;
    }
    cout<<b/10<<"\n";
    b=b-20*(i-1);
  }
  return 0;
}