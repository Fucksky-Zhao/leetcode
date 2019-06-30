class Solution {
    public boolean isValid(String s) {
        if (s == null) return true;
        if (s.length() % 2 == 1) return false;
        Map<Character, Integer> map = new HashMap<>();
        map.put('(', 1);
        map.put('{', 2);
        map.put('[', 3);

        map.put(']', 4);
        map.put('}', 5);
        map.put(')', 6);

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) <= 3) stack.push(s.charAt(i));
            else if (stack.isEmpty()) return false;
            else if (map.get(s.charAt(i)) + map.get(stack.peek()) == 7) stack.pop();
            else return false;
        }
        return stack.isEmpty();
    }
}
