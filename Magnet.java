import java.util.Scanner;
public class Magnet{
public static void main(String ae[]){
Scanner sb=new Scanner(System.in);
String p= sb.nextLine();
int n=Integer.parseInt(p);
int count=1;
int a[]=new int[n];
for(int i=0;i<n;i++) {
     String h=sb.nextLine();
	 a[i]=Integer.parseInt(h);
	 }
for(int i=0;i<(n-1);i++) {
     if(a[i]!=a[i+1]) {
	         count++;
			  }
	else {}
	}
	System.out.println(count);
	}
	}