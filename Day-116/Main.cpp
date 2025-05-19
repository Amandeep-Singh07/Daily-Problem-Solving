// CPP STL

#include <bits/stdc++.h>

using namespace std;

// Pairs
void explainPair() {

    pair<int, int> p1 = {1, 3};
    cout << p1.first << " " << p1.second << endl;

    pair<int, pair<int, int>> p2 = {1, {3, 4}};
    cout << p2.first << " " << p2.second.second << " " << p2.second.first << endl;

    pair<int, int> arr[] = {{1, 2}, {2, 5}, {5, 1}};
    cout << arr[1].second << endl;

}

void explainVector() {
    vector<int> v;
    v.push_back(1);
    v.emplace_back(2);

    vector<pair<int, int>> vec;
    vec.push_back({1, 2});
    vec.emplace_back(1, 2);

    vector<int> v1(5, 100); // v1 with five 100s
    vector<int> v2(5);      // v2 with five default-initialized elements (0)

    vector<int> v3(5, 20);
    vector<int> v4(v3);
}


int main() {
    cout << "Let's explore pairs in C++:" << endl;
    explainPair();
    cout << "End of pair explanation." << endl;

    cout << "Let's explore vectors in C++:" << endl;
    explainVector();
    cout << "End of vector explanation." << endl;

    return 0;
}
