class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> records = new HashMap<>();
        for (int i=0; i<=nums.length-1; i++){
            if (records.get(nums[i]) != null){
                System.out.println("duplicated value of" + nums[i]);
                return true;
            }
            else {
                System.out.println("no duplicated value of" + nums[i]);
                records.put(nums[i], 1);
            }
        }
        return false;
    }
}