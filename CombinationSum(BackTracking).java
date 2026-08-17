class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(res, candidates, 0, target, new ArrayList<>());
        return res;
    }
    private static void backTrack(List<List<Integer>> res, int[] candidates, int pos, int target, List<Integer> temp){
        if(target < 0) return;
        if(target == 0) res.add(new ArrayList<>(temp));

        for(int i=pos; i<candidates.length; i++){
            if(candidates[i] > target) return;
            temp.add(candidates[i]);
            backTrack(res, candidates, i, target - candidates[i], temp);
            temp.remove(temp.size()-1);
        }
    }
}
