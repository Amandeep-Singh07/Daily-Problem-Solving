// Hashing in cpp

// Number hashing
// #include <bits/stdc++.h>
// using namespace std;

// int main(){
//     int n;
//     cin >> n;
//     int arr[n];
//     for (int i = 0; i < n;i++){
//         cin >> arr[i];
//     }

//     // Precompute
//     int hash[13] = {0};
//     for (int i = 0; i < n;i++){
//         hash[arr[i]] += 1;
//     }

//     int q;
//     cin >> q;
//     while(q--){
//         int number;
//         cin >> number;
//         // fetch
//         cout << hash[number] << endl;
//     }
// }


// // Character Hashing

// #include <bits/stdc++.h>
// using namespace std;

// int main(){
//     string s;
//     cin >> s;

//     // pre compute
//     int hash[256] = {0};
//     for (int i = 0; i < s.size();i++){
//         hash[s[i]]++;
//     }
//     int q;
//     cin >> q;

//     while(q--){
//         char c;
//         cin >> c;
//         // fetch
//         cout << hash[c] << endl;
//     }
// }

// Maps in cpp

// #include <bits/stdc++.h>
// using namespace std;

// int main(){
//     int n;
//     cin >> n;
//     int arr[n];
//     for (int i = 0; i < n;i++){
//         cin >> arr[i];
//     }

//     // pre-compute
//     map<int, int> mpp;
//     for (int i = 0; i < n;i++){
//         mpp[arr[i]]++;
//     }

//     // iterate in the map
//     for(auto it : mpp){
//         cout << it.first << "->" << it.second << endl;
//     } // it will store the data in sorted manner (ascending)

//     int q;
//     cin >> q;
//     while(q--){
//         int number;
//         cin >> number;
//         // fetch
//         cout << mpp[number] << endl;
        
//     }
// }

// character mapping
#include <bits/stdc++.h>
using namespace std;

int main(){
    string s;
    cin >> s;
  

    // pre-compute
    unordered_map<char, int> mpp;
    for (int i = 0; i < s.size();i++){
        mpp[s[i]]++;
    }

    // iterate in the map
    for(auto it : mpp){
        cout << it.first << "->" << it.second << endl;
    } // it will store the data in sorted manner (ascending)

    int q;
    cin >> q;
    while(q--){
        char number;
        cin >> number;
        // fetch
        cout << mpp[number] << endl;
        
    }
}

// SORTING AND FETCHING TAKES LOGARITHMIC ON N TIME COMPLEXITY WHILE DOING MAPPING
// IF WE USE unordered_map then it will reduce the time complexity to O(1).

// in unordered map we cannot store pair<int,int>,int but in map we can....
