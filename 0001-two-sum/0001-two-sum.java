class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> list = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int x = target-nums[i];
            if (list.containsKey(x)){
                return new int[] {list.get(x), i};
            }
            list.put(nums[i], i);
        }
        return new int[] {};
    }
}