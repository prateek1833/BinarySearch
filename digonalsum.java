

public class digonalsum {
    public static void digsum(int a[][]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i][i];
            if(i+i!=a.length-1){
                sum+=a[i][a.length-1-i];
            }
        }
        System.out.print("Sum :"+sum);

    }
    public static void main(String arg[]){
        int n[][]={{1,2,3,4}
                    ,{5,6,7,8}
                    ,{7,8,9,10}
                    ,{11,12,13,14}};
            digsum(n);
    }
    
}
