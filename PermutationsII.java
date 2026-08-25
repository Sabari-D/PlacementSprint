class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res =  new ArrayList<>();
        Arrays.sort(nums);
        backTrack(res, nums, new boolean[nums.length], new ArrayList<>());
        return res;
    }
    private static void backTrack(List<List<Integer>> res, int[] nums, boolean[] visited, List<Integer> temp){
        if(temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
        }

        for(int i=0; i<nums.length; i++){
            if(visited[i]) continue;

            if(i > 0 && nums[i] == nums[i-1] && !visited[i-1]) continue;

            temp.add(nums[i]);
            visited[i] = true;

            backTrack(res, nums, visited, temp);
            temp.remove(temp.size()-1);
            visited[i] = false;
        }
    }
}
