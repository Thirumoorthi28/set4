import java.io.*;
import java.util.*;
public class SpecialChar{
    public static void main(String args[]){
        int special=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter The String : ");
        String str=s.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='!'||str.charAt(i)=='@'||str.charAt(i)=='#'||str.charAt(i)=='$'||str.charAt(i)=='%'||str.charAt(i)=='^'||str.charAt(i)=='&'||
               str.charAt(i)=='*'||str.charAt(i)=='('||str.charAt(i)==')'||str.charAt(i)=='_'||str.charAt(i)=='-'||str.charAt(i)=='+'||str.charAt(i)=='='||
               str.charAt(i)==';'||str.charAt(i)==':'||str.charAt(i)=='"'||str.charAt(i)=='|'||str.charAt(i)=='}'||str.charAt(i)=='{'||str.charAt(i)==','||
               str.charAt(i)=='<'||str.charAt(i)=='>'||str.charAt(i)=='?'||str.charAt(i)=='/'||str.charAt(i)=='~'||str.charAt(i)=='.'){
                   special++;
            }
        }
        System.out.print("The Number Of Special Characters : "+special);
    }
}
