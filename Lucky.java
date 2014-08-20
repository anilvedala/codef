import java.util.Scanner;
public class Lucky
{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
Long n=Long.parseLong(s);
Long a[]=new Long[25];
int count=0;
for(int i=0;i<25;i++)
                              {long p=n/10;
							   a[i]=n-10*p;
							   if((a[i]==7)|(a[i]==4))
							   {count=count+1;
							   }
							   n=n/10;
							   }
							   if((count==4)|(count==7)){
							                                                    System.out.println("YES");
																				}
								else
								{System.out.println("NO");
																				}
																				}
																				}