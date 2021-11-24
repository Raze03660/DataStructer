import java.util.ArrayList;
import java.util.Scanner;

public class out_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            list.add(i);
        }
        while (list.size() != 1) {
            list.add(list.remove(0));
            list.add(list.remove(0));
            list.remove(0);
        }
        System.out.println(list.get(0));
    }
}
