#include <iostream>
using namespace std;

void print1(int n){
    for (int i = 0; i < n;i++){
        for (int j = n-i-1; j >0;j--){
            cout << " ";
        }
        for (int j = 0; j <= i;j++){
            cout << "*";
        }
        for (int k = 1; k <= i;k++){
            cout << "*";
        }
            cout << endl;
    }

    for (int i = 0; i < n;i++){
        for (int j =0; j <i;j++){
            cout << " ";
        }
        for (int j = n-i; j > 0;j--){
            cout << "*";
        }
        for (int j = n-i-1; j > 0;j--){
            cout << "*";
        }
       
            cout << endl;
    }
}

int main(){
    int n,m;
    cin >> n;
    print1(n);
}