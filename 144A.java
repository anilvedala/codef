import java.util.Scanner;
public class General
{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
int n=Integer.parseInt(s);
int a[]=new int[n];
String s1=sb.nextLine();
String s2[]=s1.split(" ");
int max=0,min=101,x=0,n1=0;
for(int i=0;i<n;i++) {
	   a[i]=Integer.parseInt(s2[i]);
	   if(a[i]>max) {
	                        max=a[i];
							x=i;
	                        }
	    if(a[i]<=min) {
		                    min=a[i];
                            n1=i;
							 }
	   }
if(x<n1) {
        System.out.print(x+n-1-n1);
		}
else {
         System.out.print(x+n-1-n1-1);
		 }
		 }
		 }


