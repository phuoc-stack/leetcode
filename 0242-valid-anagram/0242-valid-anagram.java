class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        // Initialize a hashmap
        String[] s_array = s.split("");
        String[] t_array = t.split("");
        Map<String, Integer> frequencies = new HashMap<>();
        for (int i = 0; i <= s_array.length - 1; i++) {
            if (frequencies.get(s_array[i]) != null) {
                int currentValue = frequencies.get(s_array[i]);
                frequencies.put(s_array[i], ++currentValue);
            } else {
                frequencies.put(s_array[i], 1);
            }
        }

        for (int i = 0; i <= t_array.length - 1; i++) {
            if (frequencies.get(t_array[i]) != null && frequencies.get(t_array[i]) > 0) {
                    int currentValue = frequencies.get(t_array[i]);
                    frequencies.put(t_array[i], --currentValue);
            } else {
                return false;
            }
        }return true;
}}