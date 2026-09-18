#include<iostream>
#include<algorithm>

using namespace std;

int main(){
    int num1, num2;
    cin >> num1 >> num2;
    
    if(num1 < num2){
        cout << "Not Possible";
        return 0;
    }
    
    int borrow = 0;
    int borrowCount = 0;
    
    while(num1 > 0 || num2 > 0){
        int digit1 = num1 % 10;
        int digit2 = num2 % 10;
        
        digit1 -= borrow;
        borrow = 0;
    
    
    if(digit1 < digit2){
        borrow = 1;
        borrowCount++;
        digit1 += 10;
    }
    num1 /= 10;
    num2 /= 10;
    }
    cout << borrowCount << "\n";
    return 0;
    
}
