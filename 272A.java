import java.util.Scanner;
public class Dima_clean{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p=sb.nextLine();
	  int n=Integer.parseInt(p);
	  int a[]=new int[n];
	  String p1=sb.nextLine();
	  String q[]=p1.split(" ");
	  int sum=0;
	  for(int i=0;i<n;i++) {
	    a[i]=Integer.parseInt(q[i]);
		 sum=sum+a[i];
		 }
		 int coun=0;
		 int c[]=new int[5];
		 for(int i=0;i<5;i++) {
		     c[i]=sum+i+1;
			 if((c[i]%(n+1))!=1)
			 {coun++;}}
			 System.out.print(coun);
		 
				  }
				  }