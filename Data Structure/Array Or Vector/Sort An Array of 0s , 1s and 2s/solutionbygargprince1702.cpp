//An Array is given with 0s, 1s and 2s and you need to sort the array.
#include<iostream>
using namespace std;
int main()
{
	int arr[] = {0,2,1,0,0,1,1,0};
	int n = sizeof(arr)/sizeof(arr[0]); // n is size of array
	int zeros = 0 ,  ones = 0 ; int twoes = 0;//initalize 0,1,2 be 0 in starting
	for(int i;i<n;i++)
	{
		if(arr[i]==0)
		zeros++;
		if(arr[i]==1)
		ones++;
		if(arr[i]==2)
		twoes++;
	}
	for(int i = 0;i<zeros;i++)
	{
		cout<<'0'<<" ";
	}
	for(int i = zeros;i<zeros+ones;i++)
	{
		cout<<'1'<<" ";
	}
	for(int i = zeros+ones ;i<n;i++)
	{
		cout<<'2'<<" ";
	}
	return 0;
}
