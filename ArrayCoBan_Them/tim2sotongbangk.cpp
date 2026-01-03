#include <iostream>
#include <vector>
#include <unordered_map>
using namespace std;

pair<int, int> twoSumHash(const vector<int>& arr, int k) {
    unordered_map<int,int> mp ;
    for(int i=0;i<arr.size();i++){
    	int need = k - arr[i];
    	if(mp.find(need) != mp.end()){
    		return {mp[need],i};
		}
		mp[arr[i]]=i;
	}
	return {-1,-1};
}

int main() {
    vector<int> arr = {2, 7, 11, 15};
    int k = 9;
    auto ans = twoSumHash(arr, k);
    cout << ans.first << " " << ans.second << endl; 
}
