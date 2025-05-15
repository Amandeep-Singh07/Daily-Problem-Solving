#include <iostream>
using namespace std;

void print1(int n){
    
    for (int i = 0; i < n;i++){
        for (char ch = 'A'; ch <='A'+i;ch++){
            
            cout << ch ;
            cout << " ";
            
        }
            cout << endl;
    }

}
int main(){
    int n;
    cin >> n;
    print1(n);
}