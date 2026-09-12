#include<iostream>
#include<vector>
#include<unordered_map>

using namespace std;

int main(){
    int n;
    cin >> n;
    
    vector<int> v(n);
    
    for(int i=0; i<v.size(); i++){
        cin >> v[i];
    }
   int k;
   cin >> k;
   
    unordered_map<int, int> map;
    
   int prefixSum = 0;
   int count = 0;
   
   for(int val : v){
       prefixSum += val;
       
       int rem = prefixSum % k;
       
       if(rem < 0){
           rem += k;
       }
       if(map.count(rem)){
           count += map[rem];
       }
       map[rem]++;
   }
   cout << count;
   return 0;
   
}
