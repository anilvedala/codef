import java.util.Scanner;
public class Dice{
public static void main(String ae[]){
Scanner sb=new Scanner(System.in);
String s= sb.nextLine();
String a1[]=s.split(" ");
int a=Integer.parseInt(a1[0]);
int b=Integer.parseInt(a1[1]);
int d[]=new int[3];
if(a==b){
System.out.println("6 6 6");
               }
int c1=0;
int c2=0;
if(a>b){
            int c=a-b;
             if(c%2==0)
                              {  d[0]=6-(a+b)/2;
                                 d[2]=(a+b)/2-1;
								 d[1]=1;
								 System.out.println(d[0]+" "+d[1]+" "+d[2]);
				              }
			else
                               {d[1]=0;			
							   int e=(a+b)/2;
							              for(int y=6;y>e;y--){
										                                      c1=c1+1;
																			 }

										 for(int o=1;o<e+((a+b)%2);o++){
                                                                                c2=c2+1;
                                                                             }
																			 
													System.out.println(c1+" "+d[1]+" "+c2);	
                                }													
																			 
			}
			else if(a<b)
			{
			int t=a;
			a=b;
			b=t;
			int c=a-b;
             if(c%2==0)
                              {  d[0]=6-(a+b)/2;
                                 d[2]=(a+b)/2-1;
								 d[1]=1;
								 System.out.println(d[2]+" "+d[1]+" "+d[0]);
				              }
			else
                               {d[1]=0;			
							   int e=(a+b)/2;
							              for(int y=6;y>e;y--){
										                                      c1=c1+1;
																			 }

										 for(int o=1;o<e+((a+b)%2);o++){
                                                                                c2=c2+1;
                                                                             }
																			 
													System.out.println(c2+" "+d[1]+" "+c1);	
                                }													
								}
								}
								}
						
																			 