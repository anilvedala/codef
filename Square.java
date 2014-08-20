import java.util.Scanner;
public class Square{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p1= sb.nextLine();
	   String t[]=p1.split(" ");
	   int n=Integer.parseInt(t[0]);
	   int m=Integer.parseInt(t[1]);
	   int a=Integer.parseInt(t[2]);int b=a,i=1;int j=1;
	   int c=a;
	   if(n<m) {
	                             if((n%a)!=0)  {
								                i=n/a+1;
												}
	                            else {i=n/a;}
	   int v=m-a;
	                             if((m-a)<=0) {j=0;}		 
								 else{ 
	                                    if((v%a)!=0) {
										               j=v/a+1;
													   }
	                                     else {j=v/a;}
										 }
					 }
	   else {
				   int r=n;
				   n=m;
				   m=r;
				   if((n%a)!=0)  {i=n/a+1;}
	               else {i=n/a;}
	               int v=m-a;
	            if((m-a)<=0)     {j=0;}		 
				else{ 
	               if((v%a)!=0) {j=v/a+1;}
	               else {j=v/a;}
				    }
				   
				   }
				   System.out.print(i+(j*i)); 
				   }
				   }