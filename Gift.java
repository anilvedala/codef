import java.util.Scanner;
public class Gift{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p= sb.nextLine();
	  int n=Integer.parseInt(p);
	  if(n<0) {
	               int b=-n;
					int a=b%10;
					b=b/10;
					int c=b%10;
					b=b/10;
					if(c<a) {
					           if(b!=0) { 
					           System.out.print("-"+b+""+c);
							   }
							   else   {
							                    if(c==0) {System.out.print("0");}
												else        {System.out.print("-"+c);}
										}
								}
					else    {
					            if(b!=0) { 
					           System.out.print("-"+b+""+a);
							   }
							   else   {
							                    if(a==0) {System.out.print("0");}
												else        {System.out.print("-"+a);}
										}
					}
					}
		else {
		        System.out.print(n);
	        }
	  }}