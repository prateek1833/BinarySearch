// import java.util.*;
public class subarray2 {
    public static void subarr2(int num[]) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int a[] = new int[num.length];
        a[0] = num[0];
        for (int i = 1; i < num.length; i++) {
            a[i] = a[i - 1] + num[i];
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                sum = (i == 0) ? a[j] : a[j] - a[i - 1];

                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.print("max :" + max);
    }

    public static void main(String arg[]) {
        int b[] = { 1, 4, 5, 6, -8, 12 };
        subarr2(b);
    }
}
