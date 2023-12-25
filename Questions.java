public class Questions {
    public static boolean Q1(int a[]){
        boolean m=false;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){ 
                    m=true;
                    break;
                }
            }
        }
        return m;



    }
    public static void main(String arg[]){
        int num[]={1,3,5,3,5,6,34,65,31};
        System.out.print(Q1(num));

    }
}
