#include <bits/stdc++.h>
using namespace std;
int main() 
{
 int k;
  cin>>k;
  int ax,ay,bx,by;
  cin>>ax>>ay>>bx>>by;
  int a[20][20];
  for(int i=0;i<k;i++)
    for(int j=0;j<k;j++)
      cin>>a[i][j];
  int curr_xpos=bx,curr_ypos=by;
// 0-up,1-down,2-left,3-right
  unsigned int min_step=-1,min_barr=-1,i;
  for(int i=0;i<4;i++)
  {int dir=i;
     int curr_row=bx,curr_col=by;unsigned int step=0,barr=0;
    while(1)
    {
      if(curr_row<0 || curr_row>=k || curr_col<0 || curr_col>=k)
        break;
      if(curr_row==ax && curr_col==ay)
      {
        if(step<min_step)
        {
          min_step=step;
          min_barr=barr;
      }
        else if(min_step==step && barr<min_barr)
          min_barr=barr;
        break;
      }
      step++;
      if(a[curr_row][curr_col]==1 || a[curr_row][curr_col]==2)
        barr++;
     
    switch(dir)
    {
      case 0:
          if(a[curr_row][curr_col]==1){
            curr_col++;dir=3;}
         else if(a[curr_row][curr_col]==2){
            curr_col--;dir=2;}
        else
          curr_row--;
        break;
      case 1:
            if(a[curr_row][curr_col]==1){
            curr_col--;dir=2;}
         else if(a[curr_row][curr_col]==2){
            curr_col++;dir=3;}
        else
          curr_row++;
        break;
              case 2:
            if(a[curr_row][curr_col]==1){
            curr_row++;dir=1;}
         else if(a[curr_row][curr_col]==2){
            curr_row--;dir=0;}
        else
          curr_col--;
        break;
              case 3:
            if(a[curr_row][curr_col]==1){
            curr_row--;dir=0;}
         else if(a[curr_row][curr_col]==2){
            curr_row++;dir=1;}
        else
          curr_col++;
        break;
        }
    }
  }
  if(min_step!=-1)
    cout<<min_step<<" "<<min_barr;
  else
    cout<<"-1";
    return 0;
}