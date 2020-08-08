#include <iostream>
#include<algorithm>
using namespace std;

int main() 
{
   // Try out your code here
   long int n,b,win=1;
    cin>>b>>n;
   long int z[n];
    for(long int i=0;i<n;i++)
      cin>>z[i];
  sort(z,z+n);
    for(long int i=0;i<n;i++)
        b=b-((z[i]%2)+(z[i]/2));
    if(b<=0)
      cout<<"NO";
    else
      cout<<"YES";
    return 0;
}
