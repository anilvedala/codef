import java.util.Scanner;
public class A271{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
int n=Integer.parseInt(s1);
n++;
int a=0,b=0,c=0,d=0,e=0;
while(1>0){
       e=n;
	   a=e%10;
	   e=e/10;
	   b=e%10;
	   e=e/10;
	   c=e%10;
	   e=e/10;
	   d=e%10;
	   if((a==b)||(a==c)||(a==d)){n++;}
	   else if((b==c)||(b==d)){n++;}
	   else if(c==d){n++;}
	   else{System.out.print(n);break;}
	   }
	   }}