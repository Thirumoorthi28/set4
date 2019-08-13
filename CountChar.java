import java.io.*;
import java.util.*;
public class CountCharacter{  
    public static void main(String args[]){  
        String string;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The String :");
        string=s.nextLine();
        int count=0;
        for(int i=0;i<string.length();i++) {  
            if(string.charAt(i)!=' ')  
                count++;  
        }  
        System.out.println("Total Number Of Characters In A String: "+count);  
    }  
}  
