#include <iostream>

using namespace std;

int main() {
	long long int num,oc,of,od,cs,cb,cm,cd;
	cin >> num;
	cin>>oc>>of>>od;
	cin>>cs>>cb>>cm>>cd;
	long long int online=oc+(num-of)*od;
	long long int classic=cb+(num/cs)*cm+(num*cd);

	if(online<classic){
        cout<<"Online Taxi";
	}else if(online>classic){
	    cout<<"Classic Taxi";
	}else{
		cout<<"Online Taxi";
	}

return 0;
}

