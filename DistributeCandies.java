class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();

        for(int candy : candyType){
            set.add(candy);
        }

        int size = candyType.length;
        int maximumCandy = set.size();

        int res = Math.min(maximumCandy, size/2);
        return res;
    }
}
