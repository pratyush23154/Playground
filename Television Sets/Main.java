#include <bits/stdc++.h>
using namespace std;

int main() 
{
int n,r1,r2,target;
  cin>>n>>r1>>r2>>target;
  int month[]={31,28,31,30,31,30,31,31,30,31,30,31};
  vector<int>patients;
  for(int i=0;i<12;i++)
  {
    for(int j=0;j<month[i];j++)
    {
      int cnt=pow((6-i-1),2)+abs(j+1-15);
      patients.push_back(cnt);
    }
  }
  int cost,finalcost,normal,count,flag=0;
  for(int tvs=0;tvs<=n;tvs++)
  {
    normal=n-tvs;
    finalcost=0;
    for(int j=0;j<patients.size();j++)
    {
      if(patients[j]>n)
        cost=r1*tvs+r2*normal;
      else if(patients[j]<=normal)
        cost=r2*patients[j];
      else
        cost=r2*normal+r1*(patients[j]-normal);
          finalcost+=cost;
    }

    if(finalcost>=target)
    {
      cout<<tvs;
     break;
    }
    else
      finalcost=0;
  }
  if(finalcost<target)
    cout<<n;
    return 0;
}