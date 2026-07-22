class Solution {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[]) {
        // code here
        int n1 = arr1.length;
        int n2 = arr2.length;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int i=0, j=0;
        
        while(i<n1 && j<n2){
            if(arr1[i] <= arr2[j]){
                if(list.size() == 0 || list.get(list.size()-1) != arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
            }else{
                if(list.size() == 0 || list.get(list.size()-1) != arr2[j]){
                    list.add(arr2[j]);
                }
                j++;
            }
        }
        
        while(j < n2){
            if(list.size() == 0 || list.get(list.size()-1) != arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }
        
        while(i < n1){
            if(list.size() == 0 || list.get(list.size()-1) != arr1[i]){
                list.add(arr1[i]);
            }
            i++;
        }
        
        return list;
    }
}
