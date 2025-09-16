class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Create a frequency map to count occurences of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each number in the array
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Create a Min Heap that sorts entries by their frequency (value)
        // Using a min heap of size k ensures we keep the k most frequent elements
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        // Process each entry from the frequency map
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            // Add the current entry to the heap each in form of {value, key}
            heap.offer(new int[]{entry.getValue(), entry.getKey()});
            // If heap size exceeds k, remove the element with minimum frequency
            if (heap.size() > k){
                heap.poll();
            }
        }

        // Create a response array that stores the values inside the heap array
        int[] res = new int[k];
        for (int i =0; i<k; i++){
            // extract the actual number at position 1 
            res[i] = heap.poll()[1];
        }
        return res;
    }
}