import java.sql.SQLOutput;
import java.util.*;

public class Queue002 {
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>();
        int input;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("請輸入動作0離開1提供2獲得3查看4全部拿出");
            input = sc.nextInt();

            if (input > 4 || input < 0) {
                System.out.println("輸入錯誤，請重新輸入。");
            } else if (input == 0) {
                break;
            } else if (input == 1) {
                System.out.println("請輸入要放入序列的字:");
                que.offer(sc.next());
                System.out.println("輸入後的序列:" + que);
            } else if (que.peek() == null) {
                System.out.println("序列為空，請重新輸入");
            }else if(input==2){
                System.out.println("原序列:"+que);
                System.out.println("獲得:"+que.poll());
                System.out.println("獲得後序列:"+que);
            }else if (input==3){
                System.out.println("查看:"+que.peek());
            }else if(input==4){
                System.out.println("原序列:"+que);
                while(que.peek()!=null){
                    System.out.println(que.poll());
                }
                System.out.println("全部拿出後序列:"+que);
            }
        } while (input != 0);
    }
}
