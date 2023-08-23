import java.util.*;
public class Solution{
public static void main(String[] args){
    Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int minidx=0;
        int maxidx=0;
        int max=0;
        int min=101;
        for(int i=1;i<=n;i++){
            int a=s.nextInt();
            if(a>max){
                maxidx=i;
                max=a;
            }
            if(a<=min){
                minidx=i;
                min=a;
            }
        }
        if(maxidx>minidx){
            System.out.println((n-minidx)+(maxidx-1)-1);
        }
        else{
            System.out.println((n-minidx)+(maxidx-1));
        }
        
    }
}