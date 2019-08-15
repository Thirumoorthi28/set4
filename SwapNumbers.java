import java.io.*;
import java.util.*;
public class SwapNumber{
    public static void main(String args[]){
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter The Numbers of a: ");
        a=s.nextInt();
        System.out.print("Enter The Numbers of b: ");
        b=s.nextInt();
        a=a^b;
        b=b^a;
        a=a^b;
        System.out.println("Swap The Two Numbers :a="+a+"  b="+b);
    }
}
