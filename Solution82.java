class Solution82 {
    public static String encode(String s) {
        
        if (s == null || s.length() == 0) {
            return "";
        }
        
        StringBuilder encodedString = new StringBuilder();
        int count = 1;
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                encodedString.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        
        encodedString.append(s.charAt(s.length() - 1)).append(count);
        
        return encodedString.toString();
    }
}