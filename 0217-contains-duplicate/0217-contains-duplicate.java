import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> numList =  new HashMap<Integer, Integer>();
        int fre = 0;
        for (int i=0; i<nums.length; i++) {
            if (numList.get(nums[i]) != null) {
                numList.put(nums[i], numList.get(nums[i])+1);
            } 
            else {
                numList.put(nums[i], 1);
            }
            System.out.println(numList.get(nums[i]));
        }
        for (int num: numList.values()) {
            if (num > 1) {
                return true;
            }
        }
            return false;
    }
}