import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackMenu {
    public static int MaxNum = 5;
    public static char Stack[] = new char[MaxNum];
    public static int Top = -1;

    public static void main(String[] args) throws IOException {
        int op = 0;
        while (op != -1) {
            BufferedReader indata = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("請輸入動作0離開1插入元素2拿出一個元素3全部拿出:");
            System.out.print("請輸入你的操作:");
            String str = indata.readLine();
            op = Integer.parseInt(str);
            switch (op) {
                case 1:
                    System.out.print("請輸入要push的資料:");
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    String str1 = br.readLine();
                    char item = str1.charAt(0);
                    Push(item);
                    break;
                case 2:
                    if (Top == -1) {
                        System.out.println("堆疊是空的");
                    } else {
                        System.out.println(Pop() + "是從該堆疊所拿出的資料");
                    }
                    break;
                case 3:
                    PrintStack();
            }
        }
    }

    public static void Push(char item) {
        if (Top == MaxNum - 1) {
            System.out.println("堆疊是滿的");
        } else {
            Stack[++Top] = item;
        }
    }

    public static char Pop() {
        return Stack[Top--];
    }

    public static void PrintStack() {
        int i;
        if (Top == -1) {
            System.out.println("堆疊是空的!\n");
        } else {
            System.out.println("目前堆疊內容為:");
            for (i = Top; i >= 0; i--) {
                System.out.println(Stack[i] + "\t");
            }
            System.out.println();
        }
    }

}
