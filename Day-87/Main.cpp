// print name n time using recursion

// #include <bits/stdc++.h>
// using namespace std;

// void f(int i,int n){
//     if(i>n)
//         return;
//     cout << "Amandeep" << endl;
    
//     f(i + 1, n);
// }

// int main(){
//     int n;
//     cin >> n;
//     f(1, n);
// }


// // print linearly from n to 1 using recursion
// // time complexity O(n), space complexity O(n) due to recursive stack space.
// #include <bits/stdc++.h>
// using namespace std;

// void f(int i,int n){
//     if(n==i)
//         return;

//     cout << n-i << endl;
    
//     f(i + 1, n);
// }

// int main(){
//     int n;
//     cin >> n;
//     f(0, n);
// }


// reverse an array using recursion

#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void f(int i,int arr[], int n ){
    if(i>=n/2)
        return;
    swap(arr[i], arr[n - i - 1]);
    f(i + 1, arr, n);
}



int main(){
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n;i++){
        cin >> arr[i];
    }

    f(0, arr, n);

    for (int i = 0; i < n;i++){
        cout << arr[i] << " ";
    }
}