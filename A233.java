import java.util.Scanner;
public class A233{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
int n=Integer.parseInt(s1);
if(n%2==1){
       System.out.print("-1");
	   }
else{
      String t="";
	  for(int i=1;i<=n/2;i++){
	           System.out.print(2*i+" "+(2*i-1)+" ");
			   }
	  }
	  }}