import java.util.Scanner;
public class Slightly{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
String s2[]=s1.split(" ");
int n=Integer.parseInt(s2[0]);
int k=Integer.parseInt(s2[1]);
for(int i=k+1;i>=1;i--){
         System.out.print(i+" ");
		 }
for(int i=k+2;i<=n;i++){
         System.out.print(i+" ");
		 }
		 }}