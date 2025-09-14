class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> records = new HashMap<>();
        for (int i=0; i<=nums.length-1; i++){
            if (records.get(nums[i]) != null){
                return true;
            }
            else {
                records.put(nums[i], 1);
            }
        }
        return false;
    }
}