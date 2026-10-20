// classwork
// #include <bits/stdc++.h>
// using namespace std;

// int main() {
//     int h, w;
//     cin >> h >> w;

//     cout << (h / w);
//     return 0;
// }

// you have to code a program where there are two runners first runner -> runs by 1 steps , second runner -> runs by 2 steps , track is total 28 steps return element at which point the first runner world be when second runner is at finish line.

// #include <bits/stdc++.h>
// using namespace std;

// int main(){
//     int run1, run2;
//     run1 = 0;
//     run2 = 0;
//     int total = 28;
//     for (int i = 0; i <= total;i++){
//         run1++;
//         run2 += 2;
//         if(run2==total){
//             break;
//         }
//     }
//     cout<< "the distance covered by runner1 when runner2 is at finish line is "<<run1;

//     return 0;
// }

// when 2 runners are running a circle but one is twice faster than the other, where will they meet ?

// #include <iostream>
// using namespace std;

// int main(){
//     int track = 100;
//     int r1, r2;
//     r1 = r2 = 0;
//     int point = 0;
//     for (int i = 0; i <= track;i++){
//         r1++;
//         r2 = r1*2;
        

//     }
//     cout << r1;
//     return 0;
// }

// Find the last digit of the number

// #include <iostream>
// using namespace std;

// int main(){
//     int n;
//     cin >> n;

//     cout << n%10;

//     return 0;
// }

// Reverse the string 

// #include <iostream>
// using namespace std;

// int main(){
//     int n;
//     cin >> n;

//     while(n!=0){
//         int d = n % 10;
//     }
//         return 0;
// }









// Array => a  continuous memory which is used to define a same data type.

// Vector is a dynamic array !!!!
// defining a vector =>>>    vector<int> arr ;
// v.push_back(element);
// v.size();
// vector<int> v(3,-1);






// Problem:-) There is a survey in which hospitals were tracked for number of patient visits per day.
// You are given input -: n- number of hospitals
// arr[i]=> list of number of patient visits per day for each hospital.

// output=> the mean number of total patients visits every day of the year.

// #include <iostream>
// #include <vector>
// using namespace std;

// int main() {
//     int n;
//     cin >> n;

//     vector<int> arr(n);
//     long long sum = 0;

//     for (int i = 0; i < n; i++) {
//         cin >> arr[i];
//         sum += arr[i];
//     }

//     double mean = (double)sum / n;

//     cout << mean << endl;

//     return 0;
// }






// Multidimensional array -> it is an array of arrays !!

// how to define it-> vector<vector<int>> arr(n,vector<int>(m,0)) // here n is row size and m is column size

// #include <bits/stdc++.h>
// using namespace std;

// int main(){
//     int n,m;
//     cin >> n>> m;
//     vector<vector<int>> arr(n, vector<int>(m, 7));

//     for (int i = 0; i < n;i++){
//         for (int j = 0; j < m;j++){
//             cout << arr[i][j] << " ";
//         }
//         cout << endl;
//     }

//     return 0;
// }














// #include<bits/stdc++.h>
// using namespace std;

// int main(){
//     int n;
//     cin >> n;
//     vector<vector<int>> hashMap(6, vector<int>());
//     int temp;
//     for (int i = 0; i < n;i++){
//         cin >> temp;
//         hashMap[temp / 100].push_back(temp);
//     }
//     int m = 0;
//     for (int i = 0; i < 6;i++){
//         m = hashMap[i].size();
//         cout << "Element in " << i << "th row->";
//         if(m==0){
//             cout << "X";
//         }
//         else{
//             for (int j = 0; j < m;j++){
//                 cout << hashMap[i][j] << " ";
//             }
//         }
//         cout << endl;
//     }
//     return 0;
// }








