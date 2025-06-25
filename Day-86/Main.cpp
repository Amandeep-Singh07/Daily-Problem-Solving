// print from 1 to N using backtracking
 // very important
// #include <iostream>
// using namespace std;

// void f(int i,int n){
//     if(i<1)
//      return;
//     f(i - 1, n);
//     cout << i << endl;
// }


// int main(){
//     int n;
//     cin >> n;
//     f(n, n);
// }

// now print n to 1 using backtracking

#include <iostream>
using namespace std;

void f(int i,int n){
    if(i >n)
        return;
    f(i + 1,n);
        cout << i << endl;  
}

int main(){
    int n;
    cin >> n;
    f(1,n);
}

// both time and space complexity is O(n).