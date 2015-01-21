import java.util.Scanner;
import java.util.Arrays;
public class C460{
public static void main(String ar[]){
             Scanner sb=new Scanner(System.in);
			 String s=sb.nextLine();
			 String s1[]=s.split(" ");
			 try{
			 int n=Integer.parseInt(s1[0]);
			 int m=Integer.parseInt(s1[1]);
			 int w=Integer.parseInt(s1[2]);
			 int a[]=new int[n];
			  String s2=sb.nextLine();
			 String s3[]=s2.split(" ");
			 for(int i=0;i<n;i++){
			  a[i]=Integer.parseInt(s3[i]);
			  }
			  
			  for(int i=0;i<m;i++){
			  if(i==0){
			  Arrays.sort(a);}
			 else{
			   if(a[w-1]>a[w]){
				        Arrays.sort(a);}
				 }
			  
			   for(int j=0;j<w;j++){
			   a[j]++;
			   }
			   }
			   
			    Arrays.sort(a);
			   System.out.print(a[0]);}
			   catch(Exception e){}
			   }}
			   