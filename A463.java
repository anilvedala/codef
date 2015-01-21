import java.util.*;
public class A463{
public static void main(String ar[]){
             try{
             Scanner sb=new Scanner(System.in);
			 String s7=sb.nextLine();
			 String s2[]=s7.split(" ");
			 int n=Integer.parseInt(s2[0]);
			 int s=Integer.parseInt(s2[1]);
			 int a[]=new int[s+1];
			 int p=0,q=0;
			 for(int i=0;i<n;i++){
			    String s1=sb.nextLine();
			    String s3[]=s1.split(" ");
				
			    p=Integer.parseInt(s3[0]);
			    q=Integer.parseInt(s3[1]);
				if(s>=p){
			    if((100-q)>a[p]) a[p]=100-q;}
				}
			 p=n;q=-1;	
			 while(1>0){
			   if(a[p]>0){q=a[p];break;}
               if(p==0) break;
               p--;
               }
              System.out.print(q);}
			  catch(Exception e){}
}}			  