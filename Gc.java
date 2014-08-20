import java.util.Scanner;
public class Gc
{public static int findgcd(int c,int d)
                                   {
 
                                     if (d == 0)
                                     return c;
                                     return findgcd(d, c % d);
 
                                    }
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
String q[]=s.split(" ");
int a=Integer.parseInt(q[0]);
int b=Integer.parseInt(q[1]);
int n=Integer.parseInt(q[2]);
while(n>0){
                                    int gcd=0;
                                    if(n==a)
                                    gcd=a;
                                  else if(n>a)
                                  gcd=findgcd(n-a,a);
                                     else
                                    gcd=findgcd(a,a-n);
									n=n-gcd;
									if(n<0){System.out.println("1");
									break;
									}
									if(n==0){System.out.println("0");
									break;
									}
									
									gcd=0;
									if(n==b)
                                    gcd=b;
                                  else if(n>b)
                                  gcd=findgcd(n-b,b);
                                     else
                                   gcd=findgcd(b,b-n);
									n=n-gcd;
									if(n<0){System.out.println("0");
									break;
									}
									if(n==0){System.out.println("1");
									break;
									}
									}
}
}

                                    