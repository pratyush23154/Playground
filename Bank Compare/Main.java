#include<bits/stdc++.h>
using namespace std;

int main()
{
double p;int t;
  cin>>p>>t;
  int n1;
  cin>>n1;
  float r1[n1];int t1[n1];
  for(int i=0;i<n1;i++)
    cin>>t1[i]>>r1[i];
  
    int n2;
  cin>>n2;
  float r2[n2];int t2[n2];
  for(int i=0;i<n2;i++)
    cin>>t2[i]>>r2[i];
 double emia,suma=0;
  for(int i=0;i<n1;i++)
  {
   r1[i]=r1[i]/1200;
    emia=(p*r1[i])/(1-(1/pow((1+r1[i]),t1[i]*12)));
    suma+=emia*12*t1[i];
  }
   double emib=0.0,sumb=0;
  for(int i=0;i<n2;i++)
  {
    r2[i]=r2[i]/1200;
    emib=(p*r2[i])/(1-(1/pow((1+r2[i]),t2[i]*12)));
    sumb+=emib*12*t2[i];
  }
  //cout<<suma<<" "<<sumb<<"\n";
  suma<=sumb?cout<<"Bank A":cout<<"Bank B";
  return 0;
}