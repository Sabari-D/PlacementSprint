#include<iostream>
#include<algorithm>
#include<string>

using namespace std;


int main(){
    string s;
    cin >> s;
    
    int hashCount = 0;
    string res = "";
    
    for(char ch : s){
        if(ch == '#'){
            hashCount++;
        }else{
            res += ch;
        }
    }
    
    for(int i=0; i<hashCount; i++){
        cout << "#";
    }
    cout << res;
    return 0;
}
