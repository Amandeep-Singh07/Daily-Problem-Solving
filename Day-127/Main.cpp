// reversing an array
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void rev(int arr[],int size){
    int start = 0;
    int end = size - 1;

    for (int i = 0; i < size;i++){
        if(start<end){
            swap(arr[start], arr[end]);
        }
        start++;
        end--;
    }
    for (int i = 0; i < size;i++){
        cout<<arr[i]<<" ";
    }
}

int main(){

    int arr[100];
    int n;
    cin >> n;

    for (int i = 0; i < n;i++){
        cin>>arr[i];
    }

    rev(arr, n);
}