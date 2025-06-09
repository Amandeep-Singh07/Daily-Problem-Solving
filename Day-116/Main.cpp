#include <bits/stdc++.h>

using namespace std;

// Pairs
// they are defined in <utility> header
void explainPair() {

    pair<int, int> p1 = {1, 3};
    cout << p1.first << " " << p1.second << endl;

    pair<int, pair<int, int>> p2 = {1, {3, 4}};
    cout << p2.first << " " << p2.second.second << " " << p2.second.first << endl;

    pair<int, int> arr[] = {{1, 2}, {2, 5}, {5, 1}};
    cout << arr[1].second << endl;

}
// Vector
//A vector is a dynamic array from the Standard Template Library (STL) in C++.
//It can grow and shrink in size automatically, unlike normal arrays with fixed size.

void explainVector() {
    vector<int> v;
    v.push_back(1);
    v.emplace_back(2);
    v.push_back(10);
    v.push_back(20);
    v.push_back(12);
    v.push_back(23);
    v.push_back(35);

    vector<pair<int, int>> vec;
    vec.push_back({1, 2});
    vec.emplace_back(1, 2);

    vector<int> v1(5, 100); // v1 with five 100s or we can say all the five indexes are 100
    vector<int> v2(5);      // v2 with five default-initialized elements (0 or any garbage value)

    vector<int> v3(5, 20);
    vector<int> v4(v3); // copying the v3 vector in the v4 vector

    vector<int>::iterator it = v.begin();
    it++;
    cout << *(it) << " ";

    it = it + 2;
    cout << *(it) << " ";

    // The following were redeclarations of 'it' and have been commented out
    // vector<int>::iterator it = v.end(); // end points to the memory location right after the last element of the array
    // vector<int>::iterator it = v.rend();
    // vector<int>::iterator it = v.rbegin();

    cout << v[0] << " " << v.at(0);
    cout << v.back() << " ";

    for (vector<int>::iterator it2 = v.begin(); it2 != v.end(); it2++) {
        cout << *(it2) << " ";
    }

    for (auto it3 = v.begin(); it3 != v.end(); it3++) {
        cout << *(it3) << " ";
    }

    for (auto it4 : v) {
        cout << it4 << " ";
    }

    // {10, 20, 12, 23, 35}
    v.erase(v.begin() + 1);
    // {1, 10, 20, 12, 23, 35}

    // {1, 10, 20, 12, 23, 35}
    if (v.size() >= 5)
        v.erase(v.begin() + 2, v.begin() + 4); // {1, 10, 23, 35} [start, end)

    // Insert function
    vector<int> v_ins(2, 100); // {100, 100}
    v_ins.insert(v_ins.begin(), 300); // {300, 100, 100}
    v_ins.insert(v_ins.begin() + 1, 2, 10); // {300, 10, 10, 100, 100}

    vector<int> copy(2, 50); // {50, 50}
    v_ins.insert(v_ins.begin(), copy.begin(), copy.end()); // {50, 50, 300, 10, 10, 100, 100}

    // {10, 20}
    cout << v_ins.size(); // 7

    // {10, 20}
    v_ins.pop_back(); // {50, 50, 300, 10, 10, 100}

    // v1 -> {10, 20}
    // v2 -> {30, 40}
    v1.swap(v2); // v1 -> {0,0,0,0,0}, v2 -> {100,100,100,100,100}
}

void explainList() {   // Now List , is another container in cpp
    list<int> ls;

    ls.push_back(2); // {2}
    ls.emplace_back(4); // {2, 4}

    ls.push_front(5); // {5, 2, 4}
    ls.emplace_front(1); // {1, 5, 2, 4}

    // rest functions same as vector
    // begin, end, rbegin, rend, clear, insert, size, swap
}

void explainDeque() {
    deque<int> dq;
    dq.push_back(1); // {1}
    dq.emplace_back(2); // {1, 2}
    dq.push_front(4); // {4, 1, 2}
    dq.emplace_front(3); // {3, 4, 1, 2}

    dq.pop_back(); // {3, 4, 1}
    dq.pop_front(); // {4, 1}

    dq.back();
    dq.front();

    // rest functions same as vector
    // begin, end, rbegin, rend, clear, insert, size, swap
}

// Stack ==>> LIFO (Last In First Out)  
// in stack there is indexing be careful
void explainStack() {
    stack<int> st;
    st.push(1); // {1}
    st.push(2); // {2, 1}
    st.push(3); // {3, 2, 1}
    st.push(3); // {3, 3, 2, 1}
    st.emplace(5); // {5, 3, 3, 2, 1}

    cout << st.top(); // prints 5 "** st[2] is invalid **"

    st.pop(); // st looks like {3, 3, 2, 1}
    cout << st.top(); // 3
    cout << st.size(); // 4
    cout << st.empty();

    stack<int> st1, st2;
    st1.swap(st2);
}

// Queue -->> FIFO (First In First Out)  // And all the operations are working in O(1)
void explainQueue() {
    queue<int> q;
    q.push(1); // {1}
    q.push(2); // {1, 2}
    q.emplace(4); // {1, 2, 4}

    q.back() += 5;
    cout << q.back(); // prints 9
    // Q is {1, 2, 9}
    cout << q.front(); // prints 1
    q.pop(); // {2, 9}
    cout << q.front(); // prints 2
    // size swap empty same as stack
}

void explainPQ() {

    // ALso Known as Max Heap
    //it stores elements in descending order, i.e., highest priority (largest element) is on top
    priority_queue<int> pq;
    pq.push(5); // {5}
    pq.push(2); // {5, 2} -> {5, 2} (implementation detail, conceptually unordered)
    pq.push(8); // {8, 5, 2}
    pq.emplace(10); // {10, 8, 5, 2}

    cout << pq.top(); // prints 10
    pq.pop(); // {8, 5, 2}
    cout << pq.top(); // prints 8
    // size swap empty function same as others

    // Minimum Heap
    priority_queue<int, vector<int>, greater<int>> pq_min;
    pq_min.push(5); // {5}
    pq_min.push(2); // {2, 5}
    pq_min.push(8); // {2, 5, 8}
    pq_min.emplace(10); // {2, 5, 8, 10}

    cout << pq_min.top(); // prints 2

    // here push and pop happens in O(log n) and top happens in O(1) .
}

void explainSet() {  // In two words Sorted and Unique
    set<int> st;
    st.insert(1); // {1}
    st.emplace(2); // {1, 2}
    st.insert(2); // {1, 2}
    st.insert(4); // {1, 2, 4}
    st.insert(3); // {1, 2, 3, 4}

    auto it = st.find(3);  // it returns the iterator
    auto it_not = st.find(6); // if the value is not present then it returns the end iterator value

    st.erase(5); // erases 5
    int cnt = st.count(1);  // it will give two value 0 and 1

    auto it2 = st.find(3);
    st.erase(it2); // it takes constant time
 
    auto it1 = st.lower_bound(2); //Finds the first element in the set that is not less than 2. (i.e., >= 2)
    auto it2u = st.upper_bound(3); //Finds the first element in the set that is greater than 3. (i.e., > 3)

    //If the requested bound doesn’t exist (e.g., you try upper_bound(4) when the set is {1, 2, 3, 4}), it returns st.end() (an iterator pointing past the last element).
}

void explainMultiSet() {
    multiset<int> ms;
    ms.insert(1); // {1}
    ms.insert(1); // {1, 1}
    ms.insert(1); // {1, 1, 1}

    ms.erase(1); // all 1's erased

    int cnt = ms.count(1);

    ms.erase(ms.find(1)); // only a single one erased

    // erase range is not directly supported by iter + n, so you'd use advance or loops
}

void explainUSet() {
    unordered_set<int> st;
    // Everything is same just not sorted
}

void explainMap() {
    map<int, int> mpp1;
    map<int, pair<int, int>> mpp2;
    map<pair<int, int>, int> mpp3;

    mpp1[1] = 2;
    mpp2.emplace(3, make_pair(1,2));
    mpp3.insert({{2, 4}, 5});

    for (auto it : mpp1) {
        cout << it.first << " " << it.second << endl;
    }

    cout << mpp1[1];
    cout << mpp1[5];

    auto it = mpp2.find(3);
    if (it != mpp2.end()) {
        cout << it->second.first << " " << it->second.second;
    }

    auto lb = mpp1.lower_bound(2);
    auto ub = mpp1.upper_bound(3);
}

void explainMultimap() {
    multimap<int,int> mmp;
    // works like map but allows duplicate keys
}

void explainUnorderedMap() {
    unordered_map<int,int> ump;
    // same as map but not sorted
}

bool comp(pair<int, int> p1, pair<int, int> p2) {
    if (p1.second < p2.second) {
        return true;
    } else if (p1.second == p2.second) {
        if (p1.first > p2.first) return true;
    }
    return false;
}

void explainExtra() {
    int a[] = {4, 1, 3, 2};
    int n = sizeof(a)/sizeof(a[0]);
    sort(a, a + n);
    sort(a, a + n, greater<int>());

    pair<int,int> arrp[] = {{1,2}, {2, 1}, {4, 1}};
    int np = sizeof(arrp)/sizeof(arrp[0]);
    sort(arrp, arrp + np, comp);

    int num = 7;
    int cnt1 = __builtin_popcount(num);

    long long numll = 165786578687LL;
    int cnt2 = __builtin_popcountll(numll);

    string s = "123";
    sort(s.begin(), s.end());
    do {
        cout << s << endl;
    } while (next_permutation(s.begin(), s.end()));

    int maxi = *max_element(a, a + n);
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
