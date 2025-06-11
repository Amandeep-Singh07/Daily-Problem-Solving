#include <iostream>


#include <string>
#include <cmath>

bool isArmstrong(int num) {
    std::string s = std::to_string(num);
    int n = s.length();
    int sum = 0;
    for (char c : s) {
        int digit = c - '0';
        sum += pow(digit, n);
    }
    return sum == num;
}


// normal approach
// class Solution {
//     public:
//         bool isArmstrong(int n) {
//             int temp=n;
//             int q=n;
//             int count=0;
//             int sum=0;
//             while(n!=0){
//                 int d=n%10;
//                 count++;
//                 n/=10;
//             }
//             while(temp!=0){
//                 int f=temp%10;
//                 sum+=(int)round(pow(f,count));
//                 temp/=10;
//             }
    
//             if(sum==q){
//                 return true;
//             }
//             return false;
//         }
//     };
