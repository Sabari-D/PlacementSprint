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
    
    int k;
    cin >> k;
    
    unordered_map<int, int> map;
    
    map[0] = 1;
    int prefixSum = 0;
    int count = 0;
    
    for(int val : v){
        prefixSum += val;
        
        int needed = prefixSum - k;
        
        
        if(map.find(needed) != map.end()){
            count += map[needed];
        }
        
        map[prefixSum]++;
    } 
    
    cout << count << endl;
    return 0;
}
