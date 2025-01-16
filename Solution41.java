import java.util.HashSet;
import java.util.Set;

class Solution41 {
    public int minExtraChar(String s, String[] dictionary) {
        Set<String> wordSet = new HashSet<>();
        for (String word : dictionary) {
            wordSet.add(word);
        }
        
        int strLength = s.length();
        int[] dp = new int[strLength + 1];
        
        dp[0] = 0;
        for (int i = 1; i <= strLength; i++) {
            dp[i] = dp[i - 1] + 1;
            for (int j = 0; j < i; j++) {
                if (wordSet.contains(s.substring(j, i))) {
                    dp[i] = Math.min(dp[i], dp[j]);
                }
            }
        }
        
        return dp[strLength];
    }
}