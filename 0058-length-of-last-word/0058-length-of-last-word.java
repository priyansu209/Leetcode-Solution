class Solution { 
    public int lengthOfLastWord(String s) { 
        Stack<Character> st = new Stack<>(); 
        int i = s.length() - 1; 
        int count = 0; 
 
        while (i >= 0 && s.charAt(i) == ' ') { 
            i--; 
        }

        while (i >= 0 && s.charAt(i) != ' ') { 
            st.push(s.charAt(i)); 
            i--; 
        }

        return st.size(); 
    } 
}