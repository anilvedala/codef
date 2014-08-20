import java.util.Scanner;
import java.lang.*;
public class A448{
public static void main(String ar[]){
   Scanner sb=new Scanner(System.in);
   String s1=sb.nextLine();
   String s2=sb.nextLine();
   String s5=sb.nextLine();
   String s4[]=s2.split(" "); 
   String s3[]=s1.split(" ");
   int a=0,b=0;
   for (int i=0;i<3;i++) {
     a=a+Integer.parseInt(s3[i]);
     b=b+Integer.parseInt(s4[i]);	
     }
   int n=Integer.parseInt(s5);
   while(a>0){
     a=a-5;
     n--;
     }
   if(n>=0){
     while(b>0){
     	b=b-10;
     	n--;
        }
     }
   if(n>=0){
   	 System.out.print("YES");
     }
   else{
   	 System.out.print("NO");
     }
    }
}