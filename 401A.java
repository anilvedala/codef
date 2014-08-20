import java.util.Scanner;
public class Vanya{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p=sb.nextLine();
	  String p1[]=p.split(" ");
	  int n=Integer.parseInt(p1[0]);
	  int x=Integer.parseInt(p1[1]);
	  String q=sb.nextLine();
	  String  q1[]=q.split(" ");
	  int a[]=new int[n];
	  int sum=0;
	  for(int i=0;i<n;i++) {
	      a[i]=Integer.parseInt(q1[i]);
	      sum=sum+a[i];
	      }
		  sum=-sum;
		  int w=0,y=0;
		  if(sum>0) {
	                  w=sum/x;
                       y=sum%x;
                        if(y>0) {
                       System.out.print(w+1);}
					   else {System.out.print(w);}
                       }
        else if(sum==0) {
    		            System.out.print(0);
						 }
	   else {
	                 sum=-sum;
					   w=sum/x;
                       y=sum%x;
					   if(y>0) {
                       System.out.print(w+1);}
					   else {System.out.print(w);}
                       }
					   }
					   }
					   