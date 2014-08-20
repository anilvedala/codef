import java.util.Scanner;
public class Chess1{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p= sb.nextLine();
	  int n=Integer.parseInt(p);
	  int i,j;
	  if((n%2)==1)
	  {System.out.println(n*(n-1)/2+(n+1)/2);}
	  else{System.out.println((n*n)/2);}
	  String s=new String();
	  String p=new String();
	 /* for(i=1;i<=n;i++) {
	              if(i%2==1)   {
						             for(j=1;j<=n;j++)  {
									       if((j%2)==1)     {
									         System.out.print("C");
											  }
											else {
											   System.out.print(".");
											   }
											 if((j==n)&&(i!=n)) {
											   System.out.println("");
											   }
											   }
											   }
		   else     {
						             for(j=1;j<=n;j++)  {
									       if((j%2)==1)     {
									         System.out.print(".");
											  }
											else {
											   System.out.print("C");
											   }
											 if((j==n)&&(i!=n)) {
											   System.out.println("");
											   }
											   }
											   }
											   }*/
											   for(j=1;j<=n;j++){
											     if(j%2==1){s=s+"C";}
												  else{s=s+".";}
												  }
												  for(j=1;j<=n;j++){
											     if(j%2==1){p=p+".";}
												  else{p=p+"C";}
												  for(j=1;j<=n;j++){
												    if(j%2==1){
													System.out.println(s);
													}
													else {
	                                               System.out.println(p);
											         }
											    }}}