import java.util.Scanner;

public class _3nAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), count = 1, max = 0;
        for (int i = a; i <= b; i++) {
            int n = i;
            while (n != 1) {
                if (n % 2 == 1) {
                    n = 3 * n + 1;
                } else {
                    n /= 2;
                }
                count++;
            }
            if (max < count) {
                max = count;
            }
            count = 1;
        }
        System.out.print(a + " " + b + " " + max);
    }
}
