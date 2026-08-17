class ClosestComparator implements Comparator<Integer>{
    int x;
    public ClosestComparator(int x){
        this.x = x;
    }

    public int compare(Integer a, Integer b){
        int diff = Math.abs(b-x) - Math.abs(a-x);
        if(diff == 0){
            return b-a; // largest element first to pop later (larger element pop aagirum)
        }
        return diff;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new ClosestComparator(x));

        for(int val : arr){
            queue.offer(val);

            if(queue.size() > k){
                queue.poll();
            }
        }

        List<Integer> res = new ArrayList<>(queue);
        Collections.sort(res);
        return res;
    }
}
