//#include <iostream>
//using namespace std;
//
//void findMinMax(int arr[], int n) {
//	int max=INT_MIN,min=INT_MAX;
//	for(int i=0;i<n;i++){
//		if(arr[i]<min){
//			min=arr[i];
//		}
//		if(arr[i]>max){
//			max=arr[i];
//		}
//	}
//	cout<<min<<" "<<max;
//}
//
//int main() {
//    int arr[] = {5, 2, 9, 1, 7, 3};
//    int n = sizeof(arr) / sizeof(arr[0]);
//
//    findMinMax(arr, n);
//    return 0;
//}

#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int arr[] = {5, 2, 9, 1, 7, 3};
    int n = sizeof(arr) / sizeof(arr[0]);

    sort(arr, arr + n);

    cout << "Gia tri nho nhat: " << arr[0] << endl;
    cout << "Gia tri lon nhat: " << arr[n - 1] << endl;

    return 0;
}

