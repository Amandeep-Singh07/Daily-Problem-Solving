#include <iostream>
using namespace std;

void print1(int n){
    for (int i = 0; i < n;i++){
        
        for (int k = 0; k<=i;k++){
            cout << "*";
        }
        cout << endl;
    }
    for (int i = 0; i < n-1;i++){

        

            for (int k = n-i-1; k > 0; k--)
            {
                cout << "*";
            }
        cout << endl;
    }
}


int main(){
    int n;
    cin >> n;
    print1(n);
}