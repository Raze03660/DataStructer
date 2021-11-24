import java.util.Scanner;

public class Matrix_mu {

    public static void main(String[] args) {
        int a = 3, b = 3;
        int c = 3, d = 2;

        int A[][] = new int[a][b];
        int B[][] = new int[c][d];
        int temp[][] = new int[a][d];
        Scanner sc = new Scanner(System.in);
        System.out.println("input Array A");
        arr_inputA(A, a, b);
        System.out.println("input Array B");
        arr_inputB(B, c, d);
        arr_mu(a, b, d, A, B, temp);
        output(a, d, temp);
    }

    public static void arr_inputA(int[][] A, int a, int b) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                A[i][j] = sc.nextInt();
            }
        }
    }

    public static void arr_inputB(int[][] B, int a, int b) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                B[i][j] = sc.nextInt();
            }
        }
    }

    public static void arr_mu(int m, int n, int d, int A[][], int B[][], int temp[][]) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < d; k++) {
                    temp[i][k] += A[i][j] * B[j][k];
                }
            }
        }
    }

    public static void output(int a, int d, int temp[][]) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print(temp[i][j] + "\t");
            }
            System.out.println();
        }
    }

}

