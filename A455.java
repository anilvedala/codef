import java.util.Scanner;
import java.util.Arrays;
public class A455{
public static void main(String ar[]){
             Scanner sb=new Scanner(System.in);
			 String s=sb.nextLine();
			 int n=Integer.parseInt(s);
			 int a[]=new int[100002];
			 
			  String s1=sb.nextLine();
			  String s2[]=s1.split(" ");
			  for(int i=0;i<n;i++){
			      a[Integer.parseInt(s2[i])]+=Integer.parseInt(s2[i]);
				  }
			  int c=0,max=0,j=1;
			  int h=n;
			  while(h!=0){int flag=0;
			  for(int i=1;i<=n;i++){
			      if(a[i]>max){
				                    max=a[i];
									flag=1;
								    j=i;
				    }
			  }
			  if(max==0) break;
			  if(flag==1){
									 if(a[j+1]+a[j-1]>a[j]){if(a[j+1]>a[j-1]){j=j+1;}else{j=j-1;}}
									 a[j+1]=0;
				                     a[j-1]=0;
				                    max=0;
				                     c=c+j;
				                     a[j]=a[j]-j;
									 j=0;}
									 
				
                 h--;
                 				 
				 }
				 System.out.print(c);
				 }}
				            
			  