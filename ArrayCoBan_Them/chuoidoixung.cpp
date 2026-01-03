#include <iostream>
#include <string>
using namespace std;

bool isPalindrome(const string& s) {
    int left = 0, right = s.size() - 1;
    while (left < right) {
      	if(s[left] != s[right]){
      		return false;
		}
		left++;right--;
    }
    return true;
}

int main() {
    string str = "racecar";
    if (isPalindrome(str))
        cout << str << " la Palindrome\n";
    else
        cout << str << " khong phai Palindrome\n";
    return 0;
}
