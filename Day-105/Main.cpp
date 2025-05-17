// #include <iostream>
// using namespace std;

// void print1(int n){

//     for (int i = 0; i < n;i++){
//         for (char ch = 'A'; ch < 'A' + n - i;ch++){
//             cout << ch;
//         }
//         cout << endl;
//     }
// }

// int main(){
//     int n;
//     cin >> n;
//     print1(n);
// }

// Another question

// #include <iostream>
// using namespace std;

// void print1(int n){

//     for (int i = 0; i < n;i++){
//         char ch = 'A' + i;
//         for (int j = 0; j <= i; j++)
//         {
//             cout << ch;
//         }
//         cout << endl;
//     }
// }

// int main(){
//     int n;
//     cin >> n;
//     print1(n);
// }

// Another pattern

#include <iostream>
using namespace std;

void print1(int n){

    for (int i = 0; i < n;i++){

        for (int j = 0; j < n - i - 1;j++){
            cout << " ";
        }
        char ch = 'A';
        int breakpoint = (2 * i + 1) / 2;
        for (int j = 0; j <2 * i + 1;j++){
            cout << ch;
            if(j<breakpoint)
                ch++;
                else
                    ch--;
        }
       
            cout << endl;
    }
}

int main(){
    int n;
    cin >> n;
    print1(n);
}