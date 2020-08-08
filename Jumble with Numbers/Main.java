#include<iostream>
using namespace std;
int main()
{
  int t1,t2,m;
  cin>>t1>>t2>>m;
  if(t1>0 && t2>0 && m>0)
  {
    int temp,c=0,flag=0;
    for(int i=1;i<=t2;i++)
    {
      temp=i*(2*i-1);
      if(temp>=t1 && temp<=t2)
        c++;
      if(c==m){cout<<temp;flag=1;break;}
    }
  if(flag==0)
    cout<<"No number is present at this index";
  }
  else
       cout<<"Invalid Input";
  return 0;
}