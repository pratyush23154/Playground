#include <iostream>
using namespace std;
void sascii(string s)
{
  int freq[256]={0},c=0;
  for(int i=0;i<s.length();i++)
  {
    freq[s[i]]++;
  }
  for(int i=0;i<s.length();i++)
  {
    if(freq[s[i]]==((int)s[i])-96)
       c++;
       }
       if(c==s.length())
       cout<<"YES ";
       else
       cout<<"NO ";
}
      

int main() 
{
int t;
  cin>>t;
  while(t--)
  {
    string s;
    cin>>s;
    sascii(s);
  }
    return 0;
}