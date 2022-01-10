package Tree;

import java.util.Scanner;

public class binaryTreeVisit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tree[] = new int[n];
        for(int i = 0;i<n;i++){
            tree[i] = sc.nextInt();
        }
        pre(tree,1);
        System.out.println();
        in(tree,1);
        System.out.println();
        post(tree,1);
    }

    private static void pre(int[] tree, int index) {
        if(index< tree.length){
            if(tree[index]!=0){
                System.out.print(tree[index]+" ");
            }
            pre(tree,index*2);
            pre(tree,index*2+1);
        }
    }

    private static void in(int[] tree, int index) {
        if(index< tree.length){
            in(tree,index*2);
            if(tree[index]!=0){
                System.out.print(tree[index]+" ");
            }
            in(tree,index*2+1);
        }
    }

    private static void post(int[] tree, int index) {
        if(index< tree.length){
            post(tree,index*2);
            post(tree,index*2+1);
            if(tree[index]!=0){
                System.out.print(tree[index]+" ");
            }
        }
    }
}
