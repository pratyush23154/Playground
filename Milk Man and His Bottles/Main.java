#include<bits/stdc++.h>
using namespace std;

int main()
{
int n;
  cin>>n;
  while(n--)
  {
    int ltr,c=0;
    int cans[]={1,5,7,10};
    int m=sizeof(cans)/sizeof(cans[0]);
    cin>>ltr;
    int tables[ltr+1];
    tables[0]=0;
    for(int i=1;i<=ltr;i++)
    {tables[i]=INT_MAX;
    }
    for(int i=1;i<=ltr;i++)
    {
      for(int j=0;j<m;j++)
      {
        if(cans[j]<=i)
        {
          int temp=tables[i-cans[j]];
          if(temp!=INT_MAX && temp+1<tables[i])
            tables[i]=temp+1;
        }
      }
    }
    cout<<tables[ltr]<<"\n";
    }
  return 0;
}