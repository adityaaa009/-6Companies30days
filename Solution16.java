public class Solution16 {
    public int firstUniqChar(String s) {
        int[] charCounts = new int[26]; 
        for (char c : s.toCharArray()) {
            charCounts[c - 'a']++; 
        }
        for (int i = 0; i < s.length(); i++) {
            if (charCounts[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1; 
    }
}