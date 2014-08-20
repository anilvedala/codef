import java.util.Scanner;
public class A385{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
String s3=sb.nextLine();
String s2[]=s1.split(" ");
int n=Integer.parseInt(s2[0]);
int c=Integer.parseInt(s2[1]);
String s4[]=s3.split(" ");
int a[]=new int[n];
int max=0,c1=0;
for(int i=0;i<n;i++){
    a[i]=Integer.parseInt(s4[i]);
	if(i!=0){
	     c1=a[i-1]-a[i];
		 if(c1>max){
		                   max=c1;
						    }
		}
		}
		if(max>=c){
		System.out.print(max-c);}
		else{System.out.print(0);}
		}}