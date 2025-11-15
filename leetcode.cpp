#include <iostream>
#include <vector>
using namespace std;

void rotateArray(vector<int>& arr, int k) {
    int n = arr.size();
    k = k % n; // Handle k > n cases

    vector<int> temp(arr.end() - k, arr.end()); // Store last k elements
    for (int i = n - 1; i >= k; i--) {
        arr[i] = arr[i - k]; // Shift elements to the right
    }
    for (int i = 0; i < k; i++) {
        arr[i] = temp[i]; // Copy back stored elements
    }
}

int main() {
    vector<int> arr = {1,2,3,4,5,6,7,8,9};
    int k = 3;
    rotateArray(arr, k);
    for (int num : arr) cout << num << " ";

    return 0;
}
