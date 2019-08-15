import java.io.*;
import java.util.*;
public class CountLines{
    public static void main(String args[]){
     String str;
     int count=1;
     Scanner s=new Scanner(System.in);
     System.out.print("Enter The String : ");
     str=s.nextLine();
     for(int i=0;i<str.length();i++){
         if(str.charAt(i)==' '){
             count++;
         }
     }
     System.out.print("The Number Of Lines : "+(count));
   }
}
