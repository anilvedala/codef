import java.util.Scanner;
public class Drink{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p= sb.nextLine();
	  int n=Integer.parseInt(p);
int a[]=new int[n];
String g=sb.nextLine();
String f[]=g.split(" ");
for(int i=0;i<n;i++) {
       a[i]=Integer.parseInt(f[i]);
	   }
	   double l=0;
	   for(int j=0;j<n;j++) {
	    l=(1/(double) n)*a[j]/100+l;
		 }
		 System.out.println(l*100.0000000000);
		 }
		 }
	   