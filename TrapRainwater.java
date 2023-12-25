// import java.util.*;
public class TrapRainwater {
    public static int trap(int a[]){
        int TW=0,W=0;
        int L[]=new int[a.length];
        int R[]=new int[a.length];
        int n=a.length;
        // Auxiliry array for maximum height of left building
        L[0]=a[0];
        for(int i=1;i<n;i++){
                L[i]=Math.max(a[i],L[i-1]);
        }
        // Auxiliry array for maximum height of right building
        R[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--){
            R[i]=Math.max(R[i+1],a[i]);
        }
        // Water level
        for(int i=0;i<n;i++){
        W=Math.min(R[i],L[i])-a[i];
        if(W<0) W=0;
        // total water trapped
        TW=TW+W;
        }
        return TW;

    }

    public static void main(String arg[]){
        int num[]={4,2,0,6,3,2,5};
        System.out.print(trap(num));

    }
    
}
