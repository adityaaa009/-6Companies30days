class Solution39 {
    public boolean wordBreak(String s, List<String> wordDict) {
      Set<String> wordDictSet = new HashSet(wordDict);
      Queue<Integer> queue = new LinkedList<>();
      int[] visited = new int[s.length()];
  
      queue.add(0);
      while (!queue.isEmpty()) {
        int start = queue.remove();
        if (visited[start] == 0) { 
          for (int end = start + 1; end <= s.length(); end++) {
            if (wordDictSet.contains(s.substring(start, end))) {
              queue.add(end);
              if (end == s.length()) {
                return true;
              }
            }
          }
  
          visited[start] = 1;
        }
      }
  
      return false;
    }
  }