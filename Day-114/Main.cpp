#include <iostream>
using namespace std;

void print1(int n){
    for (int i = 0; i < n;i++){
        for (int j = 0; j <=i;j++){
            cout << j + 1;
        }
        for (int k = 0; k <= 2 * (n - i - 1)-1;k++){
            cout << " ";
        }
        for (int j = i+1; j >=1;j--){
            cout << j ;
        }
        
            cout << endl;
    }

}


int main(){
    int n;
    cin >> n;
    print1(n);
}