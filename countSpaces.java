import java.io.*;
import java.util.*;
public class CountSpaces{
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
         System.out.println("The Number Of Spaces : "+(count-1));
    }
}
