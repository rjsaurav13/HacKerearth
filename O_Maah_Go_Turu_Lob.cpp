#include<bits/stdc++.h> 
using namespace std;
 

int main()
{
    int tcase;
    cin>>tcase;
    for(int j=0;j<tcase;j++){
        string name;
        int a=0,e=0,ii=0,o=0,u=0;
        cin>>name;
        int len=name.length();
        for(int i=0;i<len;i++){
            if(name[i]=='A'||name[i]=='a'){
                a++;
            }
            else if(name[i]=='E'||name[i]=='e'){
                e++;
            } else if(name[i]=='i'||name[i]=='I'){
                ii++;
            } else if(name[i]=='o'||name[i]=='O'){
                o++;
            } else if(name[i]=='U'||name[i]=='u'){
                u++;
            }
        }
            if(a>0&&e>0&&ii>0&&o>0&&u>0){
                cout<<"lovely string\n";
            }
            else{
                cout<<"ugly string\n";
            }
    }
    return 0;
}