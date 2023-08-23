import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            int m=s.nextInt();
            int k=s.nextInt();
            int H=s.nextInt();
            int h[]=new int[n];
            int count=0;
            
            for(int i=0;i<n;i++){
                h[i]=s.nextInt();
            }
            int[] hd=new int[n];
            for(int i=0;i<n;i++){
                hd[i]=Math.abs(H-h[i]);
            }
            for(int i=0;i<hd.length;i++){
                if(hd[i]%k==0 && hd[i]>=k && hd[i]<m*k){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}