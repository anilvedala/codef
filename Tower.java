import java.util.Scanner;
public class Tower{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
String s2=sb.nextLine();
int n=Integer.parseInt(s1);
String s3[]=s2.split(" ");
int a[]=new int[n];
int b[]=new int[1000];
int max=0,c=0;
for(int i=0;i<n;i++){
       a[i]=Integer.parseInt(s3[i]);
       b[a[i]]++;
	   }
for(int i=0;i<1000;i++){
     if(b[i]>0){
	          if(max<b[i]){
	          max=b[i];}
			  c++;
			  }
	   }
	   System.out.print(max+" "+c);
	   }}
