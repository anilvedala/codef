import java.util.Scanner;
public class A124{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
String s2[]=s1.split(" ");
int n=Integer.parseInt(s2[0]);
int a=Integer.parseInt(s2[1]);
int b=Integer.parseInt(s2[2]);
if((n-a)<=(b+1)){
          System.out.print(n-a);
		  }
else{
        System.out.print(b+1);
		}
		}}
