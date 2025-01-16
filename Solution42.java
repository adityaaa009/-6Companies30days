import java.util.*;

class Solution42 {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        List<String> uniqueWords = new ArrayList<>(wordCount.keySet());
        uniqueWords.sort((word1, word2) -> {
            int frequencyComparison = wordCount.get(word2) - wordCount.get(word1);
            return frequencyComparison == 0 ? word1.compareTo(word2) : frequencyComparison;
        });
        
        return uniqueWords.subList(0, k);
    }
}
