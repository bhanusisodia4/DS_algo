import java.util.Stack;

public class ParenthesisProb {

    static boolean checkParenthesys(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else if (c == ')') {
                if (!st.empty() && st.peek() == '(') {
                    st.pop();
                } else return false;

            } else if (c == '}') {
                if (!st.empty() && st.peek() == '{') {
                    st.pop();
                } else return false;

            } else if (c == ']') {
                if (!st.empty() && st.peek() == '[') {
                    st.pop();
                } else return false;
            }
        }

        if (st.isEmpty()) return true;
        else return false;
    }

    public static void main(String[] args) {
        String str = "(a*b{c+d}))";
        System.out.println(checkParenthesys(str));

    }
}

