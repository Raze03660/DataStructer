package Tree;

import java.util.Scanner;
/*
       35.Max Heap Construction --> 輸出最大堆積數
       ***索引值0未用到，並設置為0 空節點也設為0***
       輸入:
            5
            1 2 3 4 5
       輸出:
            3
            0 5 4 2 1 3 0 0
 */
public class MaxHeap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = 1, sumNode = 1;
        //判斷第幾層
        for (int i = 2; ; i++) {
            sumNode = sumNode * 2 + 1;
            if (sumNode >= n) {
                h = i;
                break;
            }
        }
        //索引值0元素沒有用到，所以要加1
        int tree[] = new int[sumNode + 1];
        tree[1] = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            tree[i] = sc.nextInt();
            int index = i;
            //index除到最後根節點
            while (index / 2 >= 1) {
                if (tree[index / 2] < tree[index]) {
                    int temp = tree[index / 2];
                    tree[index / 2] = tree[index];
                    tree[index] = temp;
                }
                index/=2;
            }
        }
        System.out.println("高度為:" + h);
        for (int node : tree) {
            System.out.print(node + " ");
        }
    }
}
