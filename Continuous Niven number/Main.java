#include<bits/stdc++.h>
using namespace std;
int base(int n,int b)
{int r=0,d,s[1000],k=0;
  while(n>0)
  {
    d=n%b;
    s[k++]=d;
    n=n/b;
  }
for(int i=k-1;i>=0;i--)
  r=(r*10)+s[i];
  return r;
}
int sod(int n)
{
  int s=0;
  while(n>0)
  {
    int d=n%10;
    s+=d;
    n/=10;
  }
  return s;
}
int main()
{
	int b,t,x,ans,summ,num,temp;
  cin>>b>>t;int i,c=0,flag=0;
  for(i=b;;i++)
  {

    int num=base(i,b);
    int summ=sod(num);
    if(i%summ==0)
      c++;
    else
    {
      if(c==t)
        break;
        c=0;
    }
  }
  cout<<base(i-t,b)<<endl;
	return 0;
}