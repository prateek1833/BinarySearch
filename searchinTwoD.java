// package Array.java;

public class searchinTwoD {
    public static boolean search(int a[][],int key){
        int R=a.length-1,C=0;
         while(R>=0 && C<=a.length){
            if(key==a[R][C]){
                System.out.print("Key found at :"+ "("+R+","+C+")");
                return true;
            }
            else if(key>a[R][C]){
                C++;
            }
            else R--;
         }
        System.out.print("Key not found");
        return false;
    }
    public static void main(String arg[]){
        int n[][]={{1,2,3,4}
                    ,{5,6,7,8}
                    ,{7,8,9,10}
                    ,{11,12,13,14}};
                    int key=10;
            search(n,key);
    }
}
