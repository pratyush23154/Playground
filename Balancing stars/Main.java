#include<iostream>
#include<stack>
using namespace std;

int main()
{
  string s;
  cin>>s;
  stack<char>a;
  int flag=0,count=0;
  for(int i=0;i<s.length();i++)
  {
    if(s[i]=='{' || s[i]=='[' || s[i]=='(')
    {
      flag=1;
      a.push(s[i]);
    }
    if(!a.empty())
    {
      if(s[i]=='}')
      {
        if(a.top()=='{')
        {
          a.pop();
          continue;
        }
        else
          break;
      }
            if(s[i]==']')
      {
        if(a.top()=='[')
        {
          a.pop();
          continue;
        }
        else
          break;
      }
            if(s[i]==')')
      {
        if(a.top()=='(')
        {
          a.pop();
          continue;
        }
        else
          break;
      }
      if(s[i]=='*')
      {
        if(s[i+1]=='*')
        {
          if(a.top()=='(' || a.top()=='{' || a.top()=='[')
            count++;
        }
      }
    }
    else
    {
      if(flag==1)
      {
        flag=0;
        break;
      }
    }
  }
  if(a.empty() && flag==1)
    cout<<"Yes "<<count;
  else
    cout<<"No "<<count;
  return 0;
}