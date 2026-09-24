class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int val : arr){
            map.put(val, map.getOrDefault(val, 0)+1);
            
            if(map.get(val) == 2){
                res.add(val);
            }
        }
        return res;
       
    }
}
