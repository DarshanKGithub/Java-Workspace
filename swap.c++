#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main()
{
    int a = 10, b = 20;
    cout << "BEfore swapping the values: "
         << a << " " << b;

    a = a + b;
    b = a - b;
    a = a - b;

    cout << "\n After Swapping the values are: "
         << a << " " << b;
}