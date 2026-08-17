class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> heap = new PriorityQueue<Integer>(); //basically in minHeap order 
        for(int val : nums){
            heap.offer(val);

            if(heap.size() > k){
                heap.poll();
            }
        }
    return heap.peek();
    }
}
