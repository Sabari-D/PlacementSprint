class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int spaceInd = 0;
        for(int i=0; i<s.length(); i++){
            if(spaceInd < spaces.length && i == spaces[spaceInd]){
                sb.append(" ");
                spaceInd++;
            }
            sb.append(s.charAt(i)); 
        }
        return sb.toString();
    }
        
}
