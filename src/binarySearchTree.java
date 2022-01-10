import java.util.Arrays;
import java.util.Scanner;

public class binarySearchTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //tree[0] = 0,tree[1]=root
        int tree[] = new int[2];
        for (int i = 0; i < n; i++) {
            int newNode = sc.nextInt();
            int index = 1;
            if (tree[index] == 0) {
                //給root資料
                tree[index] = newNode;
            } else {
                while (tree[index] != 0) {
                    if (tree[index] < newNode)
                        index = index * 2 + 1;
                    else
                        index *= 2;
                    if (index >= tree.length)
                        tree = Arrays.copyOf(tree, tree.length * 2);
                }
            }
            tree[index] = newNode;
        }
        int h = 1, sum = 1;
        for (int i = 2; ; i++) {
            sum *= 2 + 1;
            if (sum + 1 >= tree.length) {
                h = i;
                break;
            }
        }
        System.out.println(h);
        for (int node : tree) {
            System.out.print(node + " ");
        }
    }
}
