import java.util.Scanner;
public class Luck{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p= sb.nextLine();
	  int n=Integer.parseInt(p);
	  String g=sb.nextLine();
	  int sum=0,sum1=0;
	  String h[]=g.split("(?!^)");
	  int i=0;
	  for(i=0;i<n;i++) {
	               int y=Integer.parseInt(h[i]);
				   if((y==4)||(y==7)){}
				   else{
				     System.out.print("NO");
	                 break;
                     }
                 }
      if(i==n) {		
	            	 
	            for(int i1=0;i1<n;i1++) {
	                  if(i1<=(n-1)/2) {
				            sum=sum+(Integer.parseInt(h[i1]));
						    }
				      else {
				           sum1=sum1+(Integer.parseInt(h[i1]));
						   }
				      }
				     if(sum==sum1) {
				          System.out.print("YES");
					      }
				     else {
				         System.out.print("NO");
					     }
	            }
	  }
	 }
		 