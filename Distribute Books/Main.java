#include<iostream> 
using namespace std;

long long int der(long long int n) 
{ 
    long long int a[n+1],i;
  a[0] = 1;   a[1] = 0;  a[2]=1;

  for (i = 3; i <= n; i++) 
      a[i] = ((i-1)*(a[i-1] + a[i-2])) % 100000007;
  
  return a[n]; 
}
int main () 
{ 
   long long int n;
  cin >> n;
  cout << der(n); 
  return 0; 
}
