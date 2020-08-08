#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    int T;
  cin>>T;
  while(T--)
  {
    int n,t;
    cin>>n>>t;
    int e[n];
    for(int i=0;i<n;i++)
      cin>>e[i];
    int p,d;
    cin>>p>>d;
    for(int i=0;i<n;i++)
    {
      if(p>e[i]){t--;
        p=p+(p-e[i]);}
      else 
        break;
    }
    if(p>=d &&t>0)
      cout<<"YES";
    else
      cout<<"NO";
    }
    return 0;
}
