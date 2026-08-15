class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res  = new ArrayList<>();
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        generate(digits, "", map, res);

        return res;

    }
    private static void generate(String digits, String current, String[] map, List<String> res){
        if(current.length() == digits.length()){
            res.add(current);
            return;
        }
        
        int pos = current.length();
        char digitChar = digits.charAt(pos);
        int digit = digitChar - '0';
        String letters = map[digit];

        for(char ch : letters.toCharArray()){
            generate(digits, current+ch, map, res);
        }
    }
}
