// import java.util.*;
public class Binarysearch {
    public static int Binary(int number[],int key){
        int start=0;
        int end=number.length-1;
        while(start<=end){
             int mid=(start+end)/2;
            if(number[mid] ==key)
            return mid;
            else if(number[mid] >key){
                end =mid-1;
            }
            else 
            start=mid +1;
        }
        return -1;
    }

    public static void main(String arg[]){
        int number[]={1,3,5,7,8,9,87,987};
        int key=9;
        System.out.print("key is at index "+ Binary(number,key));
    
    }
}
