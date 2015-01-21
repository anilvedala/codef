import java.util.Scanner;
import java.util.Arrays;
public class B451{
public static void main(String ar[]){
             Scanner sb=new Scanner(System.in);
			 String s=sb.nextLine();
			 int n=Integer.parseInt(s);
			 int a[]=new int[n];
			  String s1=sb.nextLine();
			  String s2[]=s1.split(" ");
			  int b[]=new int[3];
			  int c[]=new int[2];
			  int i=0,flag=-1;
			  for(i=0;i<n;i++){
			     a[i]=Integer.parseInt(s2[i]);
				 }
				 i=0;
				 if(n==1){System.out.println("yes");System.out.println("1 1");}
				 else{
			 while((i<n-1)&&(a[i]<=a[i+1])){
			       b[0]=1;i++;
				   }
				c[0]=i;
			  if(i!=n-1){
			  while((i<n-1)&&(a[i]>a[i+1])){
			       b[1]=1;i++;
				   }
				  
				  c[1]=i;
				  
				while((i<n-1)&&(a[i]<=a[i+1])){
			       b[2]=1;i++;
				   }
				   }
				 if(i!=n-1){
				    System.out.print("no");
					}
				 else{
				   
				
					     if(b[0]==1 &&b[1]==1 && b[2]==1){
					     if((a[c[0]-1]<=a[c[1]])&&(a[c[0]]<=a[c[1]+1])){
						       System.out.println("yes");
					           System.out.println((c[0]+1)+" "+(c[1]+1));
							   }
						 else{
						       System.out.print("no");
					           }
						}
						
						else if(b[1]==1 && b[2]==1){
						   if(a[c[0]]<=a[c[1]+1]){System.out.println("yes");System.out.println("1 "+(c[1]+1));}
						   else{System.out.print("no");}}
						 else if(b[1]==1 && b[0]==0){
						    System.out.println("yes");System.out.println("1 "+n);}
						else if(b[0]==1 && b[1]==0){System.out.println("yes");System.out.println("1 1");}
						else if(b[0]==1 && b[1]==1){
						    if(a[n-1]>a[c[0]-1]){System.out.println("yes");System.out.println((c[0]+1)+" "+(n));}
							else{System.out.print("no");
						
						}}
						}}}}
					    
				  
				
			  