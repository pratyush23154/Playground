#include<bits/stdc++.h>
using namespace std;
bool areAnagram(string str1, string str2)
{
    int n1 = str1.length();
    int n2 = str2.length();
    if (n1 != n2)
        return false;
    sort(str1.begin(), str1.end());
    sort(str2.begin(), str2.end());
    for (int i = 0; i < n1; i++)
        if (str1[i] != str2[i])
            return false;
    return true;
}
int is_anagram(string s,string temp)
{
  int flag=0;
  for(int i=0;i<s.length();i++)
  {
    rotate(s.begin(),s.begin()+1,s.end());
    if(temp.find(s)!=string::npos){
      flag=1;break;}
  }
    return flag;
}
int left_rotate(string s,int n)
{
  for(int i=0;i<n;i++)
  {
    s[s.length()-1]=s[0];
    s[i]=s[i+1];
  }
  return s[0];
}
int main()
{
  string s;
  cin>>s;
  int q;
  cin>>q;
  char dir[q];int r[q];
  for(int i=0;i<q;i++)
    cin>>dir[i]>>r[i];
  string str,temp=s;
  for(int i=0;i<q;i++)
  {
     if(dir[i]=='L'){
        rotate(s.begin(),s.begin()+r[i],s.end());
          str+=s[0];
     }
      else if(dir[i]=='R'){
        rotate(s.rbegin(),s.rbegin()+r[i],s.rend());
        str+=s[0];
      }
    }
bool is_true = false;
    int pos = str.length();
    for(int i = 0; i < temp.length(); i++){
         string r = temp.substr(i, pos);
         if(areAnagram(str, r))
         {
             is_true = true;
             break;
         }
    }
    if(is_true == true)
        cout<<"YES";
    else
        cout<<"NO";

  return 0;
}