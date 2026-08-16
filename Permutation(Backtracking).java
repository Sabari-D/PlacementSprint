class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        backTrack( res, nums, new boolean[nums.length], new ArrayList<>());
        return res;
    }
    private static void backTrack(List<List<Integer>> res, int[] nums, boolean[] used, List<Integer>  temp){
        if(temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(used[i]) continue;

            temp.add(nums[i]);
            used[i] = true;
            backTrack(res, nums, used, temp);
            temp.remove(temp.size()-1);
            used[i] = false;
        }
    }
}
