public class Solution {
    
    List queue;
    List stack;
    
    Solution() {
        queue = new ArrayList<Character >();
        stack = new ArrayList<Character >();
    }

    void pushCharacter(char ch) {
        stack.add(queue.size(),ch);
    }
    
    void enqueueCharacter (char ch) {
        queue.add(0,ch);
    }
    
    char popCharacter() {      
        char c = stack.get(0).toString().charAt(0);
        stack.remove(0);
        return c;
    }
    
    char dequeueCharacter() {
        char c = queue.get(0).toString().charAt(0);
        queue.remove(0);
        return c;
    }

