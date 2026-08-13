class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        
        int left = 0;
        int right = 0;
        int count = 0;
        int maxCount = 0;
        
        while(left < arr.length && right < dep.length){
            if(arr[left] <= dep[right]){
                count++;
                left++;
            }else{
                if(arr[left] > dep[right]){
                    count--;
                    right++;
                }
            }
            
            maxCount = Math.max(maxCount, count);
        }
    return maxCount;
    }
}
