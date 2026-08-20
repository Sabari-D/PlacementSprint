class Solution {
    public String convert(String s, int numRows) {
        int currentRow = 0;
        boolean down = true;

        if(numRows == 1 || numRows >= s.length()){
            return s;
        }
        StringBuilder[] ans = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++){
            ans[i] = new StringBuilder();
        }

        for(char ch : s.toCharArray()){
            ans[currentRow].append(ch);

            if(currentRow == 0){
                down = true;
            }else if(currentRow == numRows - 1){
                down = false;
            }

            currentRow += down ? 1 : -1;
        }

        StringBuilder res = new StringBuilder();

        for(StringBuilder val : ans){
            res.append(val);
        }
        return res.toString();
    }
}
