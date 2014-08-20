import java.util.Scanner;
public class A427{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
int n=Integer.parseInt(s1);
String s2=sb.nextLine();
String s3[]=s2.split(" ");
int c=0,count=0;
for(int i=0;i<n;i++){
       int d=Integer.parseInt(s3[i]);
	   if(d!=-1){
	            c=c+d;
				}
	   else if(c==0 && d==-1){
	                 count++;
					 }
	  else{
	           c=c+d;
			   }
	 }
	 System.out.print(count);
	 }
	 }