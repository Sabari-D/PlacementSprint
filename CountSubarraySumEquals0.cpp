#include<iostream>
#include<vector>
#include<unordered_map>

using namespace std;

int main(){
    int n;
    cin >> n;
    
    vector<int> v(n);
    
    for(int i=0; i<n; i++){
        cin >> v[i];
    }
    
    
    unordered_map<int, int> map;
    
    map[0] = 1;
    int prefixSum = 0;
    int count = 0;
    
    for(int val : v){
        prefixSum += val;
        
        if(map.find(prefixSum) != map.end()){
            count += map[prefixSum];
        }
        
        map[prefixSum]++;
    }
    
    cout << count;
    return 0;
}
