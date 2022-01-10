package Ch8;

public class bubbleSort {
    public static int Num = 10;
    public static int[] A = new int[Num];

    public static void main(String[] args) {
        RandomNum();
        BubSort(A, Num);
        PrintBubSort();
    }

    public static void RandomNum() {
        for (int i = 0; i < Num; i++) {
            A[i] = (int) (Math.random() * 90) + 10;//產生10-100的亂數整數值；
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    public static void BubSort(int A[], int n) {
        int i, j = 1, Temp;
        for (i = n - 1; i > 0; i--) {
            for (j = 0; j < i; j++) {
                if (A[j] > A[j + 1]) {
                    Temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = Temp;
                }
            }
        }
    }

    public static void PrintBubSort() {
        System.out.println("排序10個亂數值： ");
        for (int i = 0; i < Num; i++) {
            System.out.print(A[i] + " ");
        }
    }
}

