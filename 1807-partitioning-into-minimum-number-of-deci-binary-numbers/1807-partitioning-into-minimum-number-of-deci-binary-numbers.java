class Solution {
    public int minPartitions(String n) {
        int ans = 0;
        for (char c: n.toCharArray()) {
            int cur = c - 48;
            ans = Math.max(cur, ans);
        }
        return ans;
    }
}