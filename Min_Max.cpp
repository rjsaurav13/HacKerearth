#include<bits/stdc++.h>
using namespace std;
int main()
{
    int len;
    cin>>len;
    int arr[len];
    for(int i=0;i<len;i++){
        cin>>arr[i];
    }
    sort(arr, arr + len);
    int flag=1;
    int l1=arr[0];
    int l2=arr[len-1];

    for(int i=l1;i<l2;i++){
        if(arr[i]!=i){
            flag=0;
        }
    }
    if(flag==1){
        cout<<"YES";
    }
    else{
        cout<<"NO";
    }
    
}
