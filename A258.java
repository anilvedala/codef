import java.util.Scanner;
import java.util.Arrays;
public class A258{
public static void main(String ar[]){
             Scanner sb=new Scanner(System.in);
			 String s=sb.nextLine();
			 int i=0,flag=0;
			 for(i=0;i<s.length();i++){
			  if(s.charAt(i)=='0') {flag=1;break;}
			  }
			  if(flag==1){
			  System.out.print(s.substring(0,i)+""+s.substring(i+1));}
			  else{System.out.print(s.substring(0,s.length()-1));}
			  }}