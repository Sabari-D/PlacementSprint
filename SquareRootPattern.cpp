#include<iostream>
#include<cstring>
#include<algorithm>
#include<cmath>


using namespace std;
void ResultantString(const string& s){
    int n = s.length();
    long long start = 1;
    
    for(int i=1; i<n; i++){
        start *= 10;
    }
    
    long long end = start*10-1;
    
    for(long long num=start; num<=end; num++){
        long long root = sqrt(num);
        
        if(root * root != num){
            continue;
        }
        
        string str = to_string(num);
        bool match = true;
        
        for(int i=0; i<n; i++){
            if(s[i] !='_' && s[i] != str[i]){
                match = false;
                break;
            }
        }
        if(match){
            cout << num << endl;
        }
    }
}
int main(){
    string Str;
   
    if(cin >> Str){
        ResultantString(Str);
    }
    
    
    return 0;
}
