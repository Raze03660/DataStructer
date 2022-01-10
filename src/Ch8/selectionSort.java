package Ch8;

public class selectionSort {
    public static int Num = 10;
    public static int[] A = new int[Num];

    public static void main(String[] args) {
        RandomNum();
        SelSort(A, Num);
        PrintSelSort(A, Num);
    }

    public static void RandomNum() {
        for (int i = 0; i < Num; i++) {
            A[i] = (int) (Math.random() * 90) + 10;//產生10-100的亂數整數值；
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    public static void SelSort(int A[], int n) {
        int Temp, m;
        for (int i = 0; i < A.length - 1; i++) {
            m = i;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] < A[m]) {
                    m = j;
                }
            }
            if (i != m) {
                Temp = A[i];
                A[i] = A[m];
                A[m] = Temp;
            }
        }
    }

    public static void PrintSelSort(int A[], int n) {
        System.out.println("排序10個亂數值： ");
        for (int i = 0; i < Num; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
