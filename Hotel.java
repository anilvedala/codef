import java.util.Scanner;
public class Hotel{ 
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
String s1[]=s.split(" ");
int n=Integer.parseInt(s1[0]);
int d=Integer.parseInt(s1[1]);
String s2=sb.nextLine();
String s3[]=s2.split(" ");
int a[]=new int[n];
for(int i=0;i<n;i++){
                                  a[i]=Integer.parseInt(s3[i]);
								 }
								 
String s4=sb.nextLine();
int m=Integer.parseInt(s4);
int temp=0;
for(int g=0;g<n;g++){			 
                                    for(int h=0;h<n-1;h++){
									                            if(a[h+1]<a[h])
																{
																temp=a[h+1];
																a[h+1]=a[h];
																a[h]=temp;
																}
																           }
									}	
int sum=0;
if(m<=n){
for(int x=0;x<m;x++){
sum=sum+a[x];
							         }
System.out.print(sum);
               }
if(m>n){
for(int x1=0;x1<n;x1++){
sum=sum+a[x1];
							             }
System.out.println(sum-(m-n)*d);
}
}
}										 