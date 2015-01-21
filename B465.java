import java.util.Scanner;
import java.util.Arrays;
public class B465{
public static void main(String ar[]){
             Scanner sb=new Scanner(System.in);
			 String s=sb.nextLine();
			 int n=Integer.parseInt(s);
			 int a[]=new int[1001];
			  String s1=sb.nextLine();
			  String s2[]=s1.split(" ");
			  for (int i=0;i<n;i++){
			   if(Integer.parseInt(s2[i])==1) a[i+1]++;
			   }
			   int i=1;
			   while(i<1001 && a[i]==0){i++;}
			   int c=0,prev=0;
			   if(i==1001 && a[1000]==0){prev=i;c=0;}
			   else {prev=i;c=1;}
			   while(prev<n){
			          prev++;
					  
					  int j=0;
					  while((prev+j)<=n && a[prev+j]==0){j++;}
	                  if(j>=2) {prev=prev+j;c=c+2;}
                      else{c=c+j+1;}					  
					  }
				System.out.print(c);
				}}