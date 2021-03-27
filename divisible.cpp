#include<iostream>
#include <stdio.h>
using namespace std;
int main(){
int tcase;
long long int num=0;
cin>>tcase;
for(int i=0;i<tcase/2;i++){
    long long int temp;
    cin>>temp;
    while (temp>10){ 
            temp/= 10;
        }
    num=(num*10)+temp;
    }
    for(int i=tcase/2;i<tcase;i++){
    int temp;
    cin>>temp;

    num=(num*10)+(temp%10);
    }
    cout<<num<<"\n";
    if(num%11==0){
        cout<<"OUI";
    }
    else{
        cout<<"NON";
    }

return 0;
}
