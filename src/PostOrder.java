import java.util.Scanner;
import java.util.Stack;

public class PostOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int a, b;
        while (sc.hasNext()) {
            String str = sc.next();
            switch (str) {
                case "+":
                    b = st.pop();
                    a = st.pop();
                    st.push(a + b);
                    break;
                case "-":
                    b = st.pop();
                    a = st.pop();
                    st.push(a - b);
                    break;
                case "*":
                    b = st.pop();
                    a = st.pop();
                    st.push(a * b);
                    break;
                case "/":
                    b = st.pop();
                    a = st.pop();
                    st.push(a / b);
                    break;
                default:
                    st.push(Integer.parseInt(str));
            }
        }
        System.out.println(st.peek());
    }
}
