#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

//vector<int> findDuplicates(vector<int> arr) {
//    sort(arr.begin(),arr.end());
//    vector<int> dup;
//    for(int i=1;i<arr.size();i++){
//    	if(arr[i] == arr[i-1] && (dup.empty() || dup.back() != arr[i] )){
//    		dup.push_back(arr[i]);
//    		
//		}
//	}
//	return dup;
//}
void findDuplicates(vector<int> arr) {
    sort(arr.begin(),arr.end());
    int mark=INT_MIN;
   	for(int i=1;i<arr.size();i++){
   		if(arr[i]==arr[i-1] && arr[i]!=mark){
   			mark=arr[i];
   			cout<<arr[i]<<" ";
		   }
	   }
}

int main() {
    vector<int> arr = {5, 3, 8, 2, 3,3,3, 1,-2,-5,-5, 5, 7, 8};
//    vector<int> dups = findDuplicates(arr);
	findDuplicates(arr);
    cout << "Phan tu trung lap: ";
//    for (int x : dups) cout << x << " ";
    return 0;
}
