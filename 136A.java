import java.util.Scanner;
public class Choose
{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
int n=Integer.parseInt(s);
String s1=sb.nextLine();
String s2[]=s1.split(" ");
int a[]=new int[n];
for(int i=0;i<n;i++) {
          int b=Integer.parseInt(s2[i]);
		  a[b-1]=i+1;
}
for(int i=0;i<n;i++) {
       System.out.print(a[i]+" ");
	   }

}}