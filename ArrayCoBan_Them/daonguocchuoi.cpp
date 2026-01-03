#include <iostream>
#include <string>
using namespace std;

string reverseString(string s) {
	int l=0,r=s.size()-1;
	while(l<r){
		char tmp = s[l];
		s[l]=s[r];
		s[r]=tmp;
		l++;
		r--;
	}
	return s;
}

int main() {
    string str = "hello";
    cout << "Chuoi dao nguoc: " << reverseString(str);
    return 0;
}
