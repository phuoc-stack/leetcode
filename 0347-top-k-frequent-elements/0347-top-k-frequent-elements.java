class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        // create min heap
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        // process through each key value set inside map 
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // add current entry to heap in form of value : key
            heap.offer(new int[] { entry.getValue(), entry.getKey() });
            if (heap.size() > k) {
                heap.poll();
            }
        }

        // create the response array that stores values inside heap array 
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = heap.poll()[1];
        }

        return res;
    }
}