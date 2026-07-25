class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        StringBuilder sb = new StringBuilder();
        int n1 = s.length(), n2 = t.length();
        int i=0, j=0;
        // String compare = "";
        while(i < n1 && j<n2){
            if(ch1[i] == ch2[j]){
                // compare+=ch1[i];
                sb.append(ch1[i]);
                i++;
            }
            j++;
        }
        if(s.equals(sb.toString())) return true;

        return false;
    }
}
