#include<iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  if(n==1)
    cout<<"You cannot generate christmas tree";
  else if(n>20)
    cout<<"Tree is no more";
  else
  {
    int parts=n-1;
    int branches=n;
    int leaves=2*n-1;
      for(int i=0;i<branches;i++)
    {
      for(int spaces=branches-i-1;spaces>=0;spaces--)
      {
        cout<<" ";}
      for(int j=0;j<i*2+1;j++)
        cout<<"*";
      cout<<endl;
    }
      for(int m=0;m<2*n+1;m++)
        cout<<"*";
       cout<<endl;
    
    
    for(int k=1;k<parts;k++)
    {
    for(int i=1;i<branches-k+1;i++)
    {
      for(int spaces=branches-i-1;spaces>=0;spaces--)
      {
        cout<<" ";}
      for(int j=0;j<i*2+1;j++)
        cout<<"*";
      cout<<endl;
    }
      if(k==0)
      {for(int m=0;m<2*n+1;m++)
        cout<<"*";
       cout<<endl;
      }
    }
       for(int i=0;i<n;i++)
      cout<<" ";
    cout<<"*"<<endl;
     for(int i=0;i<n;i++)
      cout<<" ";
    cout<<"*";
    
    
  }
  return 0;
}