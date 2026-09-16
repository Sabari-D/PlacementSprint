#include<iostream>
#include<vector>
#include<unordered_map>
#include<algorithm>


using namespace std;

int main(){
    int n;
    cin >> n;
    
    vector<int> v(n);
    
    for(int i=0; i<n; i++){
        cin >> v[i];
    }
    
    unordered_map<int, int> map;
    map[0] = -1;
    
    int prefixSum = 0;
    int maxLen = 0;
    
    for(int i=0; i<n; i++){
        prefixSum += v[i];
        
        
        if(map.find(prefixSum) != map.end()){
            int len = i - map[prefixSum];
            maxLen = max(len, maxLen);
        }
        
        if(map.find(prefixSum) == map.end()){
            map[prefixSum] = i;
        }
        
    }
    cout << maxLen << "\n";
    return 0;
}
