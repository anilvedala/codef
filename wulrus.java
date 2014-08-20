import java.util.Scanner;
public class Wulrus{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p= sb.nextLine();
	  String t[]=p.split(" ");
	  int n=Integer.parseInt(t[0]);
	  
	  int m=Integer.parseInt(t[1]);
	  int j=n*(n+1)/2;
	  int f=m%j;
	  int sum=0;
	  int i=0;
	  while(sum<f) {i++;
	                       sum=sum+i;
	                     }
	     if(sum==f) {
		                   System.out.print(0);}
         else {
		           System.out.print(i-(sum-f));
				   }
				   }
				   }