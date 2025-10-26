	#include <iostream>
	using namespace std;
	int main ()
	{
	    int i=1,n,sum=0;
	    cout<<"Enter a positive integer ";
	    cin>>n;
	    for ( i=1;i<=n;i++) 
	    {
	     sum+=i;
	}
	cout<<i;
	    cout<<"sum of first "<<n<<" natural number is "<<sum;
	    return 0;
}
