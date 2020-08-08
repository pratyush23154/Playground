#include<bits/stdc++.h>
using namespace std;
#include<string.h>

#define MAX_SIZE 15

int permute(int a[], int n, int d, int order[], 
             int used[], int index, int *least_multiple)
{
  	int i;
    if(index == n)
    {
		int number = 0;
        for(i=0; i<n; i++)
        {
            number = number * 10 + a[order[i]];
        }
        
		if(number % d == 0)
		{
			*least_multiple = number;
			return 1;
		}
        
        return 0;
    }
    
    for(i=0; i<n; i++)
    {
        if(used[i] == 1)
        {
            continue;
        }
        
        used[i] = 1;
        order[index] = i;
        if(1 == permute(a, n, d, order, 
					    used, index + 1, 
						least_multiple))
		{
			return 1;
		}
        used[i] = 0;
    }
	
	return 0;
}

int get_least_permuted_multiple(int a[], int n, int d)
{
    int order[MAX_SIZE] = {}, used[MAX_SIZE] = {};
	int least_multiple_permuted = -1;
    int isSuccess = permute(a, n, d, order, used, 0, &least_multiple_permuted);
	return least_multiple_permuted;
}

int main()
{
  // Get the n elements as an input and store in arr
  int n, d, digit_arr[MAX_SIZE], digits_cnt;
  cin>>n>>d;
  int i;
	digits_cnt = 0;
	
	do
	{
		digit_arr[digits_cnt++] = n % 10;
		n = n / 10;
	} while(n > 0);
  sort(digit_arr, digit_arr+digits_cnt);
  
  int least_multiple_permuted = get_least_permuted_multiple(digit_arr, digits_cnt, d);
  cout<<least_multiple_permuted;
  
  return 0;
}