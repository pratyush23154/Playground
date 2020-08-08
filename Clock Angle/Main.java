#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n;
  cin>>n;
  float longitude;
  cin>>longitude;
  float time=(n/360.00*longitude)*60;//cout<<time<<" ";
  int hours=(int)time/60;
  int H=hours%12;
  float mins=(int)time-(hours*60);
  float ang=5.5*mins-30*H;
//  if(ang==360.00)
  //  cout<<"0.00";
  if(ang<0)
     cout<<fixed<<setprecision(2)<<ang+360;
  else
  cout<<fixed<<setprecision(2)<<ang;

  return 0;
}