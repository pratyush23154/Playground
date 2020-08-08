#include<iostream>
using namespace std;
int is_prime(int n)
{
  if(n<=3)
    return 1;
    for(int i=2;i<=n/2;i++)
    {
      if(n%i==0)
        return 0;
    }
    return 1;
}

int concatt(int a,int b)
{
string s1=to_string(a);
  string s2=to_string(b);
  string s=s1+s2;
  return stoi(s);
}


int main()
{
	// Type your code here
  int n;
  cin>>n;
      int a[n],k=0,c=0;
    for(int i=2;i<=n;i++)
    {
      if(is_prime(i))
        a[k++]=i;
    }
for(int i=0;i<k;i++)
{
  for(int j=i+1;j<k;j++)
  {
    if(i==j)
      continue;
    int p=concatt(a[i],a[j]);int q=concatt(a[j],a[i]);
    c+=is_prime(p)+is_prime(q);
  }
}
    cout<<c;
	return 0;
}