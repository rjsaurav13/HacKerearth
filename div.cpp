#include <iostream>
using namespace std;

int main() {
  int i = 0,num;
  cout<<"Enter the number\n";
  cin>>num;
  while (num !=0) {
    num=num/10;
    cout<<num<<"\n";
  }
  cout<<num;
  return 0;
}
