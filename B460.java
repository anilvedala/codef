import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;
public class B460{
public static void main(String ar[]){
             Scanner sb=new Scanner(System.in);
			 String s=sb.nextLine();
			 String s1[]=s.split(" ");
			 int b1=0;
			 int a=Integer.parseInt(s1[0]);
			 int b=Integer.parseInt(s1[1]);
			 int c=Integer.parseInt(s1[2]); 
			 int d[]=new int[100],j=0;
			 for(int i=c%b;i<100000;i=i+b){
			     b1=(b1+1)%9;
			     if((i-c)/b==((int) Math.pow((double) (b1),(double) a))){
				 d[j]=i;
				 j++;
				 }
				 }
				 System.out.println(j);
				 for(int i=0;i<j;i++){
				 System.out.print(d[i]+" ");
				 }}}
				 