import java.util.Scanner;
import java.io.*;
public class A450{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
String s3[]=s1.split(" ");
int n = 0;
int m = 0;
try{ 
n=Integer.parseInt(s3[0]);
m=Integer.parseInt(s3[1]);

if((n>0)&&(m>0)){
if(n>=m){}
else{m=n;}
      if(m%2==0){System.out.println("Malvika");}
	  else{System.out.println("Akshat");}
	  
	  


}
      }
	 catch(Exception e){}
	  }}