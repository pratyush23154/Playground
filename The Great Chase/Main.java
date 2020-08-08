#include<iostream>
using namespace std;

int main()
{
  int t;
  cin>>t;
  while(t--)
  {
    int initial_dist,zoron_dist,zand_dist;
    cin>>initial_dist>>zoron_dist>>zand_dist;
    int flag=0;
    for(int i=2;i<=zand_dist;i++)
    {
      if((initial_dist+zoron_dist)%i==0 && zand_dist%i==0)
        flag=1;
    }
    if(flag==0)
      cout<<"-1"<<endl;
    else
    {
      int ans;
      for(int i=initial_dist+zoron_dist;;i+=zoron_dist)
        if(i%zand_dist==0){
          ans=i/zand_dist;
          break;}
      cout<<ans<<endl;
    }
 
  }
  return 0;
}