import java.util.Scanner;
public class A231{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
int n=Integer.parseInt(s1);
String s2="";
int count=0;
for(int i=0;i<n;i++){
      s2=sb.nextLine();
	  String s3[]=s2.split(" ");
	  int a=Integer.parseInt(s3[0]);
	  int b=Integer.parseInt(s3[1]);
	  int c=Integer.parseInt(s3[2]);
	  if((a==1)&&(b==1)){count++;}
	  else if((a==1)&&(c==1)){count++;}
	  else if((b==1)&&(c==1)){count++;}
	  }
	  System.out.print(count);
	  }}