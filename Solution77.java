class Solution77{
    static String printMinNumberForPattern(String seq){
        
        StringBuilder result = new StringBuilder();

        
        Stack<Integer> stk = new Stack<>();

        
        for (int i = 0; i <= seq.length(); i++) {
            
            stk.push(i + 1);

            
            if (i == seq.length() || seq.charAt(i) == 'I') {
                
                while (!stk.isEmpty()) {
                    
                    result.append(stk.pop());
                }
            }
        }

        return result.toString();
    }
}