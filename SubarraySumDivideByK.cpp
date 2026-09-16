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
    
    int k;
    cin >> k;
    
    
    unordered_map<int, int> map;
    map[0]=1;
    
    int prefixSum = 0;
    int count = 0;
    
    for(int i=0; i<n; i++){
        prefixSum += v[i];
        
        int rem = ((prefixSum%k)+k)%k;
        
        if(map.find(rem) != map.end()){
            count += map[rem];
        }
        
        map[rem]++;
    }
    
    cout << count << "\n";
    return 0;
}
