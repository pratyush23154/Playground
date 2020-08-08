#include <iostream>
#include<math.h>
using namespace std;
long int msop(long int a[],long int b[],long int n,long int k)
{  
 long  int sop=0,diff=0,temp;
  for(long int i=0;i<n;i++)
   {
    long int prod=a[i]*b[i];
     sop+=prod;
   	if (prod < 0 && b[i] < 0)  // b[i] is -ve
			temp = (a[i] + 2 * k) * b[i];
			
		else if (prod < 0 && a[i] < 0) // pro -ve and a[i] -ve
			temp = (a[i] - 2 * k) * b[i];
			
		else if (prod > 0 && a[i] < 0) // pro +ve and a[i] -ve
			temp = (a[i] + 2 * k) * b[i];
			
		else if (prod > 0 && a[i] > 0) // pro +ve and a[i] +ve
			temp = (a[i] - 2 * k) * b[i];
     long int d=abs(prod-temp);
     if(d>diff)
       diff=d;
   }
  return(sop-diff);
}
int main() 
{
   // Try out your code here
long int n,k;
  cin>>n>>k;
  long int a[n],b[n];
  for(long int i=0;i<n;i++)
    cin>>a[i];
   for(long int i=0;i<n;i++)
    cin>>b[i];
  cout<<msop(a,b,n,k);
    return 0;
}