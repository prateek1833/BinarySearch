public class reverse {
    public static void Reverse(int number[]){
        int start=0;
        int end=number.length-1;
        while(start<end){
            int temp=number[start];
            number[start]=number[end];
            number[end]=temp;
            start++;
            end--;
        }


    }
    public static void main(String arg[]){
        int number[]={4,8,5,8,54,3,8};
        Reverse(number);
        for(int i=0;i<number.length;i++)
        System.out.print((number[i])+" ");

    }
}
