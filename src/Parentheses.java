import java.util.Scanner;
import java.util.Stack;

public class Parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Integer> list = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                list.push(i);
            } else if (str.charAt(i) == ')') {
                if (list.isEmpty()) {
                    System.out.println("-1," + i);
                } else {
                    System.out.println(list.pop() + "," + i);
                }
            }
        }
        while (!list.isEmpty()) {
            System.out.println(list.pop() + ",-1");
        }
    }
}
