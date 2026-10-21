class Solution {
    public int reverseDegree(String s) {

        int revDegreeSum = 0;
        for(int i=0; i<s.length(); i++){
          int  revDegree = 26 - (s.charAt(i) - 'a');
          int StringPosition = i+1;

          revDegreeSum += revDegree*StringPosition;
        }
        return revDegreeSum;
    }
}
