public class stock {
    public static int buyandsell(int a[]){
        int max=0;
        int profit=0;
        int buy=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>buy){
                profit=a[i]-buy;
                max=Math.max(max,profit);
            }
            else{
                buy=a[i];
            }
        }
        return max;
    }
    public static void main(String arg[]){
        int num[]={7,1,5,3,6,4};
        System.out.print(buyandsell(num));
    }
}
