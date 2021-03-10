#include<bits/stdc++.h>

using namespace std;


int main()
{ 
    int tcase;
    scanf("%d",&tcase);
    for(int m=0;m<tcase;m++){
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
        
        for(int i=1;i<=num2;i++){
            int j=1;
            while(j!=num2){
                int temp=i^j;
                    if(temp==num){
                        arr.push_back(i*j);
                        break;
                    }
                j++; 
                
            }
            sort(arr.begin(), arr.end(), greater<int>()); 
            
        }
        cout<<arr[0]<<"\n";
       // printf("%d\n",arr[0]);
        }
    return 0;
}