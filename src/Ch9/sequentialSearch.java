package Ch9;

public class sequentialSearch {
    public static void main(String[] args) {
        int list[] = {90, 80, 40, 50, 65, 100, 10, 20};
        System.out.println("八筆資料:90,80,40,50,65,100,10,20");
        System.out.println("循序搜尋結果:100在陣列中的第" + sequential_search(list, 8, 100) + "筆.");
    }

    private static int sequential_search(int[] list, int n, int key) {
        int i;
        for (i = 0; i < n; i++) {
            if (list[i] == key) {
                return i + 1;
            }
        }
        return -1;
    }
}
