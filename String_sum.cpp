
#include <iostream>

using namespace std;

int main() {

    int tcase;
    cin>>tcase;
    for(int i =0;i<tcase;i++){
        string s;
        int sum=0;
        cin>>s;
        for(int j=0;j<s.length();j++){
            sum=sum+(int(s[j])-96);

        }
		cout<<sum<<"\n";
	}
	return 0;
}
