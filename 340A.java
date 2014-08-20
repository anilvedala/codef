import java.util.Scanner;
public class Thewall2
{
static int gcd(int y,int x) {
     if(y==0) return x;
	 if(x==0) return y;
	 else  {
	           return gcd(x,y%x);
			   }
	 }
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
String s1[]=s.split(" ");
int x=Integer.parseInt(s1[0]);
int y=Integer.parseInt(s1[1]);
int a=Integer.parseInt(s1[2]);
int b=Integer.parseInt(s1[3]);
int m=0;
int c=0;

if(x<=y) {
        }
else {
       int t=x;
	         x=y;
	         y=t;
			 }
	if(y<=b) {
	  int g=Thewall2.gcd(y,x);
             if(g==1) {
                             g=x*y;
                            } 
             else {
                            g=x*y/g;
                    }
             if(a%g==0) {
		             m=a;
					 }
		    else {
		          m=((a/g)+1)*g;
				  }
		    if((b%g)!=0) {
		         b=(b/g)*g;
				 }
            if(b<m) {
			        System.out.print(0);
				}
 			
         	else		{ 
			  System.out.print((b-m)/g+1);
			}}
	 else {
		            System.out.print(0);
				}}}