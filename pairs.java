public class pairs {
    public static void pair(int number[]) {
        int tp = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + number[i] + "," + number[j] + ")");
                tp++;
            }
            System.out.print("\n");
        }
        System.out.print("Total pairs :" + tp);

    }

    public static void main(String arg[]) {
        int a[] = { 1, 3, 6, 7, 4, 5 };
        pair(a);

    }

}
