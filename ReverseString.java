import java.util.Scanner;  
public class ReverseString  
{  
public static void main(String[] arg)  
{  
ReverseString rev=new ReverseString();  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter a string : ");  
String  s=sc.nextLine();      
System.out.println("Reverse String  is : "+rev.reverse(s));  
}  
//calling method   
static String reverse(String str)  
{  
String rev="";  
for(int i=str.length();i>0;--i)  
{  
rev=rev+(str.charAt(i-1));   
}  
return rev;  
}  
}