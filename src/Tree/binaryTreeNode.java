package Tree;

import java.util.Scanner;
/*
    34.二元樹的節點分析 --> 輸出 內部節點個數 及 樹葉節點個數
        ***索引值0未用到，並設置為0 空節點也設為0***
    輸入:
        8
        0 5 4 2 0 6 1 0
    輸出:
        3
        2
 */
public class binaryTreeNode {
    static int inner = 0, leaf = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tree[] = new int[n];
        for (int i = 0; i < n; i++) {
            tree[i] = sc.nextInt();
        }
        traversal(tree, 1);
        System.out.println(inner);
        System.out.print(leaf);
    }

    private static void traversal(int[] tree, int index) {
        boolean left = true, right = true;
        //判斷節點是否為空 或 超出陣列
        if (index * 2 >= tree.length || tree[index * 2] == 0) {
            left = false;
        }
        if (index * 2 + 1 >= tree.length || tree[index * 2 + 1] == 0) {
            right = false;
        }
        if (!left && !right) {
            leaf++;
        } else {
            inner++;
        }
        if (left) {
            traversal(tree, index * 2);
        }
        if (right) {
            traversal(tree, index * 2 + 1);
        }
    }
}
