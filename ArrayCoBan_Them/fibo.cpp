#include <iostream>
using namespace std;

//long long fib(int n) {
//    if (n <= 1) return n;
//    return fib(n-1) + fib(n-2);
//}


long long fib(int n){
	if(n<=1) return n;
	long long pr1=1,pr2=0,crr;
	for(int i=2;i<=n;i++){
		crr = pr1+pr2;
		pr2=pr1;
		pr1=crr;
	}
	return pr1;
}

int main() {
    int n = 10;
    cout << "Fibonacci thu " << n << " la: " << fib(n);
    return 0;
}
