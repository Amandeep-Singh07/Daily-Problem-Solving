// Largest of three numbers
// #include <iostream>
// using namespace std;

// int main() {
//     int a, b, c;

//     cin >> a >> b >> c;
//     if(a>=b && a>=c ){
//         cout<< a;
//     }
//     else if(b>=a && b>=c){
//         cout<< b;
//     }
//     else{
//         cout<< c;
//     }

//     return 0;
// }

// Sum of digits
// #include <iostream>
// using namespace std;

// int main() {
//     int a;
//     cin >> a;
//     int sum = 0;

//     while (a!=0)
//     {
//         sum += a % 10;
//         a /= 10;
//     }

//     cout << sum;
//     return 0;
// }

// Reverse of a number

// #include <iostream>
// using namespace std;

// int main() {
//     int a;
//     cin >> a;
//     int rev = 0;

//     while (a!=0)
//     {
//         int d = a % 10;
//         rev = rev*10 + d;
//         a /= 10;
//     }

//     cout << rev;
//     return 0;
// }

// Count number of digits
// #include <iostream>
// using namespace std;

// int main() {
//     int a;
//     cin >> a;
//     int count = 0;

//     while (a!=0)
//     {
        
//         count++;
//         a /= 10;
//     }

//     cout << count;
//     return 0;
// }


// Check prime number

// #include <iostream>
// using namespace std;

// int main() {
//     int a;
//     cin >> a;
//     bool prime = true;
//     if(a<2){
//         prime = false;
//     }
//     for (int i = 2; i * i <= a;i++){
//         if(a%i==0){
//             prime = false;
//             break;
//         }
//     }

//     if(prime){
//         cout << a<< " is a prime number";
//     }
//     else{
//         cout << "Not a prime number";
//     }

//         return 0;
// }

// Print factors of a number;

// #include <iostream>
// using namespace std;

// int main() {
//     int a;
//     cin >> a;

//     for (int i = 1; i <= a;i++){
//         if(a%i==0){
//             cout << i<<" ";
//         }
//     }

//         return 0;
// }

// Print fibonacci series

// #include <iostream>
// using namespace std;

// int main() {
//     int n;
//     cin >> n;

//     if(n<0){
//         cout << "Not allowed";
//     }
//     int a = 0, b = 1;

//     for (int i = 1; i <= n;i++){
//         cout << a<<" ";
//         int c = a + b;
//         a = b;
//         b= c;
//     }

//         return 0;
// }


// Factorial of a number

// #include <iostream>
// using namespace std;

// int main() {
//     int n;
//     cin >> n;

//     if(n<0){
//         cout << "Not applicable";
//     }
//     long long factorial=1;
//     for (int i = 1; i <= n;i++){
//         factorial *= i;
//     }
//     cout << factorial;
//     return 0;
// }


// PYQ cognizant question

// 1. Stuck Key Report

// Stuck Key Report

// A candidate at a campus typing assessment has a faulty keyboard: sometimes a key gets stuck and the same character is recorded several times in a row. The proctoring tool receives the single line of text that was recorded and has to report how many times a key got stuck.

// A GLITCH is a maximal group of two or more consecutive identical characters in the recorded line. "Maximal" means the group cannot be extended to the left or to the right by another copy of the same character, so a group of three identical characters in a row is one GLITCH, not two.

// Characters are compared exactly as they are. Upper case and lower case are different characters, so 'A' and 'a' never form a glitch together.

// Input

// The input consists of exactly one line containing the recorded text S. S contains only English letters (upper case or lower case) and digits, with no spaces and no other characters. The length of S is between 1 and 100000, inclusive.

// Output

// Print exactly one line containing a single integer: the number of glitches in S. Print nothing else. If there is no glitch, print 0.

// Sample Input 1
// aaabbxyyz
// Sample Output 1
// 3

// Explanation: The maximal groups are "aaa", "bb", "x", "yy", "z". Three of them have length two or more ("aaa", "bb" and "yy"), so the answer is 3. Note that "aaa" counts as one glitch even though it has three characters.

// Sample Input 2
// abcaBC
// Sample Output 2
// 0

// #include <iostream>
// using namespace std;

// int main(){
//     string s;
//     cin >> s;

//     int count = 0;
//     for (int i = 0; i < s.length();i++){

//     }
// }





// 2. Surge Minutes

// Surge Minutes

// A monitoring team at a data center writes down how many requests a server handled in each of n consecutive minutes.

// A minute is called a surge minute if the number of requests handled in that minute is strictly greater than the number handled in the minute immediately before it AND strictly greater than the number handled in the minute immediately after it.

// The very first minute and the very last minute are never surge minutes, because one of their two neighbouring minutes does not exist. If a reading is equal to a neighbouring reading, it is not strictly greater than it, so that minute is not a surge minute.

// Given all the readings in order, report how many surge minutes there are.

// Input

// The first line contains a single integer n, the number of minutes.

// The second line contains exactly n integers separated by single spaces: the i-th of them is the number of requests handled during minute i. (When n is 1, the second line contains one integer.)

// Output

// Print a single integer on one line: the number of surge minutes. Print nothing else.

// Sample Input 1
// 6
// 1 3 2 5 4 4
// Sample Output 1
// 2

// Explanation: minute 2 has reading 3, which is greater than 1 before it and greater than 2 after it; minute 4 has reading 5, which is greater than 2 before it and greater than 4 after it. Minute 5 has reading 4, which is not greater than the 4 after it. Minutes 1 and 6 are the ends, so they are never counted. That gives 2 surge minutes.

// Sample Input 2
// 5
// 1 2 3 4 5
// Sample Output 2
// 0


// #include <iostream>
// using namespace std;

// int main(){
//     int n;
//     cin >> n;
//     int arr[n];

//     for (int i = 0; i < n;i++){
//         cin >> arr[i];
//     }
//     int count = 0;

//     for (int i = 1; i < n-1;i++){
//         if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
//             count++;
//         }
//     }
//     cout << count;
// }




// // Check whether a number is armstrong number ?
// // 153= 1 cube + 5 cube + 3 cube;

// #include <iostream>
// #include <cmath>
// using namespace std;

// int main() {
//     int n;
//     cin >> n;
//     int count = 0;
//     int sum = 0;
//     int temp = n;

//     while(n!=0){
//         count++;
//         n /= 10;
//     }
//     while(temp!=0){
//         int d = temp % 10;
//         sum += round(pow(d, count));
//         temp /= 10;
//     }

//     cout << sum;

//     return 0;
// }


// Check whether the number is perfect or not ?

// #include <iostream>
// #include <bits/stdc++.h>
// using namespace std;

// int main() {
//     int n;
//     cin >> n;
//     int sum = 0;

//     for (int i = 1; i < n;i++){
//         if(n%i==0){
//             sum += i;
//         }
//     }

//     if (sum==n){
//         cout << "perfect number";
//     }
//     else{
//         cout << "not a perfect num";
//     }

//         return 0;
// }


// Question: A number is a Strong number if the sum of factorials of its digits equals the number.

// Example:

// 145 = 1! + 4! + 5!

// #include<iostream>
// #include<bits/stdc++.h>

// using namespace std;

// int main(){
//     int n;
//     cin >> n;
//     int temp = n;
//     int sum = 0;
//     int f = 1;

//     while(n!=0){
//         int d = n % 10;

//         for (int i = d; i > 0;i--){
//              f= f* i;
//         }
//         sum += f;
//         f = 1;

        
//         n /= 10;
//     }
//     if(temp==sum){
//         cout << "strong number";
//     }
//     else{
//         cout << "not a strong number";
//     }
// }


// 16. GCD / HCF

// Question: Find the GCD/HCF of two numbers.
// #include <iostream>
// #include<bits/stdc++.h>
// using namespace std;

// int main(){
//     int m,n;
//     cin>>m>>n;

//     while(n!=0){
//         int temp = n;
//         n = m % n;
//         m = temp;
//     }
//     cout << m;
//     return 0;
// }

// 17. LCM

// Question: Find the LCM of two numbers.

// #include <iostream>
// #include <bits/stdc++.h>

// using namespace std;

// int main(){
//     int m, n;
//     cin >> m >> n;
//     int lcm;
//     int prod = m * n;

//     while(n!=0){
//         int temp = n;
//         n = m % n;
//         m = temp;
//     }
//     lcm = (prod / m);

//     cout << lcm;
// }


// 18. Find Maximum Element in an Array

// Question: Find the largest element in an array

// #include <bits/stdc++.h>
// using namespace std;

// int main(){
//     int n;
//     cin >> n;
//     int arr[n];
    
//     for (int i = 0; i < n;i++){
//         cin >> arr[i];
//     }
//     int largest = arr[0];

//     for (int i = 0; i < n;i++){
//         if(arr[i]>largest){
//             largest = arr[i];
//         }
//     }
//     cout << largest;
// }

// 22. Reverse an Array

// Question: Reverse the elements of an array.

// Example:

// // 1 2 3 4 5 → 5 4 3 2 1

// #include <bits/stdc++.h>
// using namespace std;

// int main(){
//     int n;
//     cin >> n;
//     int arr[n];

//     for (int i = 0; i < n;i++){
//         cin >> arr[i];
//     }
//     for (int i = n - 1; i >= 0;i--){
//         cout << arr[i] << " ";
//     }
// }


// 40. Find Duplicate Characters
// Question: Find the characters that appear more than once in a string.

// Example:

// programming

// Output could contain:
// r
// g
// m

// #include <iostream>
// using namespace std;

// int main(){
//     string s;
//     cin >> s;

//     int freq[256] = {0};
//     for(char ch: s){
//         freq[ch]++;
//     }
//     for (int i = 0; i < 256;i++){
//         if(freq[i]>1){
//             cout << char(i)<<endl;
//         }
//     }

//         return 0;
// }

// 39. Check Anagram
// Question: Check whether two strings are anagrams.

// Example:
// listen
// silent

// #include <bits/stdc++.h>
// using namespace std;

// int main(){
//     string s1,s2;
//     cin >> s1 >> s2;
    
//     if(s1.length()!=s2.length()){
//         cout << "not anagram";
//         return 0;
//     }

//     int freq[256] = {0};
//     for(char ch:s1){
//         freq[ch]++;
//     }
//     for(char ch:s2){
//         freq[ch]--;
//     }

//     for (int i = 0; i < 256;i++){
//         if(freq[i]!=0){
//             cout << "NOt anagram";
//             return 0;
//         }
//     }

//     cout << "anagram";
//     return 0;
// }


38. Convert Lowercase to Uppercase
Question: Convert all lowercase characters in a string to uppercase.