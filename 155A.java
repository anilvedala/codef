import java.util.Scanner;
import java.lang.*;
public class A155{
public static void main(String ar[]){
   Scanner sb=new Scanner(System.in);
   String s1=sb.nextLine();
   String s2=sb.nextLine();
   String s3[]=s2.split(" ");
   int a[]=new int[s3.length];
   int c=0;
   for(int i=0;i<s3.length;i++){
      a[i]=Integer.parseInt(s3[i]);
	  }
	  int min=a[0];
	  int max=a[0];
	  for(int i=0;i<s3.length;i++){
      if (a[i]>max) {c++;max=a[i];}
	  else if(a[i]<min) {c++;min=a[i];}
	  }
	  System.out.print(c);
	  }}
