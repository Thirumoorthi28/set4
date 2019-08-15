import java.io.*;
import java.util.*;
public class MaximumNUm{
    public static void main(String args[]){
        int n,max;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter The Numbers of a: ");
        n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Elements Of Array:");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        max=a[0];
        for(int i=0;i<n;i++){
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.println("The Maximum Of The Number Is : "+max);
    }
}
