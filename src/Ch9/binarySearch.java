package Ch9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class binarySearch {
    public static void main(String[] args) throws IOException {
        int Temp[] = {1, 8, 15, 24, 33, 45, 76, 88, 99};
        int Key, Low, High, Middle, SearchTime;
        System.out.println("排序後的數列為:1,8,15,24,33,45,76,88,99");
        BufferedReader indata;
        indata = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("請輸入以上任何數字:");
        String str = indata.readLine();
        Key = Integer.parseInt(str);
        Low = 0;
        High = 9;
        SearchTime = 0;
        Middle = (int)((Low + High) / 2);
        do {
            SearchTime = SearchTime + 1;
            if (Temp[Middle] == Key) {
                System.out.println("該數字排在第" + (Middle+1) + "個順位");
                System.out.print("一共搜尋" + SearchTime + "次");
                break;
            } else if (Temp[Middle] < Key) {
                Low = Middle + 1;               //改變左半部
            } else {
                High = Middle - 1;              //改變右半部
            }
            Middle = (int)((Low + High) / 2);
        } while (Low <= High);
        System.out.println();
    }
}
