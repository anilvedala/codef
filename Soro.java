import java.util.Scanner;
public class Soro{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
int n=Integer.parseInt(s);
int p=0;
for(int i=10,q=0;(q>n|q<n);i=i*10){
                                     q=n%i;
									 p++;
									 /*if(q==n){
									                 break;
													}*/
									}
int a[]=new int[p];
for(int w,e=0;n>0;e++){
                                        w=n%10;								
                          	            a[e]=w;
							            n=n/10;
							           }
for(int t=0;t<p;t++){
                                   if(a[t]==9)
                                   System.out.println("-0|0000-");
                                   if(a[t]==8)								   
								   System.out.println("-0|000-0");
								   if(a[t]==7)
								   System.out.println("-0|00-00");
								   if(a[t]==6)
								   System.out.println("-0|0-000");
								   if(a[t]==5)
								   System.out.println("-0|-0000");
								   if(a[t]==4)
								   System.out.println("0-|0000-");
								   if(a[t]==3)
								   System.out.println("-0|000-0");
								   if(a[t]==2)
								   System.out.println("-0|00-00");
								   if(a[t]==1)
								   System.out.println("-0|0-000");
								   if(a[t]==0)
								   System.out.println("-0|-0000");
                                                    }
													
				
}	
}			
																							   
																							   
																							   
																							   
																							   
																							   
																							   
								
                                 												