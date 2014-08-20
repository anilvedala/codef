import java.util.Scanner;
public class Little
{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
int n=Integer.parseInt(s);
if(n==1) {System.out.print(n);}
else{
System.out.print(n+" ");
for(int i=1;i<=n-1;i++) {
    System.out.print(i+" ");
	}}
	}}