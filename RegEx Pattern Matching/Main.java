#include <iostream>
using namespace std;

int main() 
{
string str;
  cin>>str;
  string regex;
  cin>>regex;
  int flag=1;
  int start=0;
  for(int i=0;i<str.length();i++)
  {
    if(regex[start]==str[i]){
      start++;continue;}
    if(regex[start]=='+'&& str[i]==regex[start-1])
      continue;
       if(regex[start]=='+'&& str[i]==regex[start+1])
         start+=2;
    else{
      flag=0;
    break;
    }
  }
  if(flag==1)
    cout<<"Matched";
  else
    cout<<"Does not match";
    return 0;
}