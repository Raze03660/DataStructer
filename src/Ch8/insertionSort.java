package Ch8;

public class insertionSort {
    public static int Num = 10;
    public static int[] A = new int[Num];

    public static void main(String[] args) {
        RandomNum();
        Insort(A, Num);
        PrintInSort(A, Num);
    }

    public static void RandomNum() {
        for (int i = 0; i < Num; i++) {
            A[i] = (int) (Math.random() * 90) + 10;//產生10-100的亂數整數值；
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    public static void Insort(int A[], int n) {
        int j, Temp;
        for (int i = 1; i <= n - 1; i++) {
            Temp = A[i];
            j = i - 1;
            while (Temp < A[j]) {
                A[j + 1] = A[j];
                j--;
                if (j == -1) break;
            }
            A[j + 1] = Temp;
        }
    }

    public static void PrintInSort(int A[], int n) {
        System.out.println("排序10個亂數值： ");
        for (int i = 0; i < Num; i++) {
            System.out.print(A[i] + " ");
        }
    }

}
