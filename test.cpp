#include<bits/stdc++.h>

using namespace std;


int main()
{ 
    int tcase;
    scanf("%d",&tcase);
    while(tcase--){
        int num;
        scanf("%d",&num);
        vector<int> arr; 
        int num2;
        for(int i=1;i<num/2;i++){
            if(num<=pow(2,i)){
                num2=pow(2,i); 
                break;
            } 
        }
        
        while(num2--){
            int j=1;
            while(j!=num2){
                int temp=num2^j;
                    if(temp==num){
                        arr.push_back(num2*j);
                        break;
                    }
                j++; 
                
            }
           
            
        }
        cout<<*max_element(arr.begin(), arr.end())<<"\n";

        }
    return 0;
}