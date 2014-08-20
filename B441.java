import java.util.Scanner;
public class B441{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
String s2[]=s1.split(" ");
int n=Integer.parseInt(s2[0]);
int v=Integer.parseInt(s2[1]);
int a[]=new int[n];
int c=0,f=0,b=0;
for(int i=0;i<n;i++){
     String s=sb.nextLine();
	 String s3[]=s.split(" ");
	 c=Integer.parseInt(s3[0]);
	 a[c-1]=Integer.parseInt(s3[1]);
	 }
for(int i=0;i<n;i++){
     if(b<=v){
	       f=f+b;
		   if((v-b)<a[i]){
		      f=f+v-b;
			  b=a[i]-v+b;
	          }
		   else{
    		f=f+a[i];
		    b=0;
	        }
		  }
	  else {
	       f=f+v;
		   b=a[i];
		   }
		   }
		   if(b<=v){
		   System.out.print(f+b);}
		   else{System.out.print(f+v);}
		   }}