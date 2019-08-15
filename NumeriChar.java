import java.io.*;
import java.util.*;
public class NumericChar{
    public static void main(String args[]){
    int num=0;
    Scanner s=new Scanner(System.in);
    System.out.print("Enter The Strings Of : ");
    String str=s.nextLine();
    for(int i=0;i<str.length();i++){
    if(Character.isDigit(str.charAt(i))){
        num++;	
    }
    }	
    System.out.println("The Numeric Characters Of :"+num);
    }
}
