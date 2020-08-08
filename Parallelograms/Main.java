#include<iostream>
using namespace std;
int pairs(int angle[],int n,int i)
{
  for(int j=i+1;j<n;j++)
  {
    if(angle[i]==angle[j])
      return 1;
}
  return 0;
}
int main()
{
  int n,i,count=0,pllgm,ang;
  cin>>n;
  int angle[n];
  for(i=0;i<n;i++)
        cin>>angle[i];
  for(i=0;i<n;i++)
  {
    if(pairs(angle,n,i)==1)
      count++;
  }
  cout<<count*(count-1)/2;
  return 0;
}