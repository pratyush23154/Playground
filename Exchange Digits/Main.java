#include<bits/stdc++.h>
using namespace std;
int minimum=INT_MAX;
int is_pos=0;
int perma(string str,int ind,int size,int b)
{
  if(ind==size)
  {
    int cv=stoi(str);
    if(cv-b>0 && cv<minimum){
      minimum=cv;is_pos=1;}
  }
  else{
  for(int j=ind;j<=size;j++){
    swap(str[ind],str[j]);
  perma(str,ind+1,size,b);
        swap(str[ind],str[j]);}
}
  return minimum;
}
int main(){
 int a,b;
  cin>>a>>b;
  string str=to_string(a);
  int l=str.length();
 int res= perma(str,0,l-1,b);
  is_pos==0?cout<<-1:cout<<res;
  return 0;
}