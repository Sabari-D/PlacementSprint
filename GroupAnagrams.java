class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String word : strs){
            char[] chArray = word.toCharArray();
            Arrays.sort(chArray);
            String sortedChar = new String(chArray);

            if(!map.containsKey(sortedChar)){
                map.put(sortedChar, new ArrayList<>());
            }

            map.get(sortedChar).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
