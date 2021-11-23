import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PostFix_test {
    public static int MaxNum = 10;
    public static char Stack[] = new char[MaxNum];
    public static int Top = -1;

    public static void main(String[] args) throws IOException {

        BufferedReader indata = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("請輸入中序運算式:");
        String str = indata.readLine();
        for (int i = 0; i <= str.length()-1; i++) {
            Stack[i] = str.charAt(i);
        }
        PostFix(Stack);
    }

    private static void PostFix(char Stack[]) {
        int i = 0, Top = 0;
        char op;
        System.out.println("輸出後序式的結果:");
        for (i = 0; i < Stack.length; i++) {
            op = Stack[i];
            switch (op) {
                case '\0':
                    while (Top > 0) {
                        System.out.print(Stack[Top]);
                        Top--;
                    }
                    break;
                case '(':
                    if (Top < Stack.length) {
                        Top++;
                        Stack[Top] = op;
                    }
                    break;
                case '+':
                case '-':
                case '*':
                case '/':
                    while (Priority(Stack[Top]) >= Priority(op)) {
                        System.out.print(Stack[Top]);
                        Top--;
                    }
                    if (Top < Stack.length) {
                        Top++;
                        Stack[Top] = op;
                    }
                    break;
                case ')':
                    while (Stack[Top] != '(') {
                        System.out.print(Stack[Top]);
                        Top--;
                    }
                    Top--;
                    break;
                default:
                    System.out.print(op);
                    break;
            }
        }
    }

    private static int Priority(char op) {
        int p;
        switch (op) {
            case '+':
            case '-':
                p = 1;
                break;
            case '*':
            case '/':
                p = 2;
                break;
            default:
                p = 0;
                break;
        }
        return p;
    }
}
