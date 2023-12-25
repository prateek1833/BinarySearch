

public class sort {
    public static void bubble(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j + 1] < a[j]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }

    public static void selection(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j])
                    min = j;
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }

    public static void insertion1(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int key = a[i + 1];
            for (int j = i; j >= 0; j--) {
                if (key < a[j]) {
                    int temp = a[j];
                    a[j] = key;
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }

    public static void insertion2(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int curr = i;
            int prev = i - 1;
            while (prev >= 0 && a[curr] < a[prev]) {
                a[prev + 1] = a[prev];
                prev--;
            }
            a[prev + 1] = a[curr];

        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }

    public static void count(int a[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            largest = Math.max(largest, a[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                a[j] = i;
                j++;
                count[i]--;
            }
        }
        for (int i = 0; i < count.length; i++) {
            System.out.print( a[i]+" " );
        }
         System.out.print("\n" );

    }

    public static void main(String arg[]) {
        int num[] = { 4, 3, 2, 1 };
        // bubble(num);
        // selection(num);
        count(num);
    }
}
