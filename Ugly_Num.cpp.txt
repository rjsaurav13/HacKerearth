
#include <bits/stdc++.h>

using namespace std;


int main() {

    long long n;
    cin >> n;
    vector<long long> num;
    num.push_back(1);
    for(long long j=0;j<=n*n;j++){
       long long temp=j;
        while(temp>1){
            if(temp%2==0)
            {
                temp=temp/2;

            }
            else if(temp%3==0)
            {
                temp=temp/3;

            }
            else if (temp%5==0)
            {
                temp=temp/5;

            }
            else
            {
                break;
            }


         }
         if(temp==1)
            {

                num.push_back(j);

            }

    }


    cout<<num[n];


return 0;
}

