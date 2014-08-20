import java.util.Scanner;
public class Freecash
{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
int n=Integer.parseInt(s);
int a[][]=new int[24][60];
int c=1;
for(int i=0;i<n;i++) {
     String s1=sb.nextLine();
	 String s2[]=s1.split(" ");
	 int a1=Integer.parseInt(s2[0]);
	 int b=Integer.parseInt(s2[1]);
	 a[a1][b]=a[a1][b]+1;
	 if(a[a1][b]>c) {
	                      c++;
						  }
						  }
						  System.out.print(c);
						  }
						  }