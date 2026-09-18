#include<iostream>
#include<algorithm>
#include<string>

using namespace std;

int main(){
    string str;
    getline(cin, str);
    
    char ch;
    cin >> ch;
    
    for(int i=0; i<str.length(); i++){
        if(tolower(str[i]) == tolower(ch)){
            if(islower(str[i])){
                str[i] = toupper(str[i]);
            }else{
                str[i] = tolower(str[i]);
            }
        }
    }
    
    cout << str << "\n";
    return 0;
}
