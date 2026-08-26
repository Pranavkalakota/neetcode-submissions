class Solution {
    public boolean isValid(String s) {
        // convert the string to a character array, so that we can get each element by itself.
        // push every opening character to the stack
        // want to compare it with the most recent character (stack)

        if (s.length() % 2 != 0) {
            // odd number of characters, no pair exists. 
            return false;
        }
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == '[') {
                stack.push(c);
            } else if (c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();
                // ensures matching
                if (c == '}' && topChar != '{') {
                    return false;
                } else if (c == ']' && topChar != '[') {
                    return false;
                } else if (c == ')' && topChar != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
