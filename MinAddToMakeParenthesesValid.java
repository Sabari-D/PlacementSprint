class Solution {
    public int minAddToMakeValid(String s) {
        List<Character> list = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                list.add(s.charAt(i));
            }
            else{
                if(!list.isEmpty() && list.get(list.size() - 1) == '('){
                        list.remove(list.size()-1);
                }else{
                        list.add(')');
                }
            }
        }
        return list.size();
        
    }
}
