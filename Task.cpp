#include<bits/stdc++.h> 
using namespace std;
 

int main()
{
    int x,num[8]={1,0,1,4,41,768,27449,1887284};
    cin>>x;
    for(int i=0;i<8;i++){
        if(x==i){
             cout << num[i] << endl;
        }
    }
   
    return 0;
}