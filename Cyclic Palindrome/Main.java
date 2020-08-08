#include<iostream>
using namespace std;
bool palin(string s)
{
  for(int i=0,j=s.length()-1;i<s.length(),i<j;i++,j--)
  {
    if(s[i]!=s[j])
      return false;
  }
  return true;
}
void head(string &s)
{
    string str=s;
    for(int i=0;i<s.length();i++)
    str[i]=s[(i+1)%s.length()];
    s=str;
}
void tail(string &s)
{
    string str=s;
 str[0]=s[s.length()-1];
  for(int i=s.length()-1;i>0;i--)
    str[i]=s[i-1];
    s=str;
}
int main(){
  // Type your code here
  int T;
  cin>>T;
  while(T--)
  {
    string s,s1,s2,str1,str2;
    cin>>s;
    s1=s2=s;
    int res=-1,c=0;
    if(palin(s))
      res=0;
    else
    {
    for(int i=0;i<s.length();i++)
    {
    head(s1);
    tail(s2);
    if( palin(s1) || palin(s2) ){
      res=i+1;break;}
    }   
    }
     cout<<res<<"\n";
   
  }
  return 0;
}