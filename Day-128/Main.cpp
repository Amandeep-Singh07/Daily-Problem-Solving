#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int printMax(int arr[], int n){
    int maxi = INT_MIN;

    for (int i = 0; i < n;i++){

        maxi = max(maxi, arr[i]);

        // if(arr[i]>max){
        //     max = arr[i];
        // }
    }
    return maxi;
}

int printMin(int arr[], int n){
    int min = INT_MAX;

    for (int i = 0; i < n;i++){
        if(arr[i]<min){
            min = arr[i];
        }
    }
    return min;
}

int main(){
    int size;
    cin >> size;

    int arr[100];

    for (int i = 0; i < size;i++){
        cin >> arr[i];
    }

    // printMax(arr, size);
    cout << "Maximum is :" << printMax(arr, size) << endl;
    cout << "Minimum is :" << printMin(arr, size) << endl;
}