import java.io.*;
import java.util.*;
public class Fibonacci{
    public static void main(String args[]){
        int a,b,sum,c;
        a=b=1;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter The Numbers Of Serious : ");
        c=s.nextInt();
        for(int i=0;i<c;i++){
        System.out.println("The Fibonacci Number Of : "+a);
        sum=a+b;
        a=b;
        b=sum;
        }
    }
}
