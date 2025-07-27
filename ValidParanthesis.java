import java.util.*;

public class ValidParanthesis {
    static boolean isvalid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                if (s.peek() == '(' || s.peek() == '{' || s.peek() == '[') {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String str = "[{()}])";
        System.out.println(isvalid(str));
    }
}
