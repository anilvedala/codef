import java.util.Scanner;
public class Soft{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p2=sb.nextLine();
	  String p1[]=p2.split(" ");
	  int n=Integer.parseInt(p1[0]);
	  int k=Integer.parseInt(p1[1]);
	  int l=Integer.parseInt(p1[2]);
	  int c=Integer.parseInt(p1[3]);
	  int d=Integer.parseInt(p1[4]);
	  int p=Integer.parseInt(p1[5]);
	  int nl=Integer.parseInt(p1[6]);
	  int np=Integer.parseInt(p1[7]);
	  int a=(k*l)/(nl*n);
	  int b=(c*d)/n;
	  int c1=p/(np*n);
	  if(a<=b) {
	                   if(a<=c1) {
					           System.out.print(a);
							   }
					   else {
					           System.out.print(c1);
							    }
							}
	 if(a>b) {
	                
					  if(b>=c1) { System.out.print(c1);}
							 else {System.out.print(b);}
							   }}}