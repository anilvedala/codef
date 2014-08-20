import java.util.Scanner;
public class Exams
{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
String s1[]=s.split(" ");
int n=Integer.parseInt(s1[0]);
int k=Integer.parseInt(s1[1]);
int a=k/n;
int b=k%n;
if(a==2) {
             System.out.print(n-b);
			 }
else {
         System.out.print(0);
		 }
		 }
		 }