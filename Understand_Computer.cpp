

#include <iostream>

using namespace std;

int main() {
	int tcase;
	cin >> tcase;
	for(int i=0;i<tcase;i++){
        long long int num;
        cin>>num;
        cout<<num^(num+1)<<"\n";

	}

	return 0;
}

