import java.util.Scanner;
public class Exercise{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p= sb.nextLine();
	  int n=Integer.parseInt(p);
	  int a[] =new int[n];
	  String h=sb.nextLine();
	  String r[]=h.split(" ");
	  int i=0;
	  for(i=0;i<n;i++) {
	                        a[i]=Integer.parseInt(r[i]);
							}
	  int s1=0,s2=0,s3=0;
	  i=0;
	  while(i<n) {
	   if((i%3)==0) {
	                   s1=s1+a[i];
					    }
		else if((i%3)==1) {
		s2=s2+a[i];
		 }
		 else {
		       s3=s3+a[i];}
			   i++;
			   }
			  if ( s1> s2 && s1 > s3 ){
         System.out.print("chest");}
      else if ( s2 > s1&& s2 > s3 ){
         System.out.print("biceps");}
      else if ( s3 > s1 && s3 > s2 ){
         System.out.print("back");}
		 }
		 }
		 