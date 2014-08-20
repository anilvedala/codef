import java.util.Scanner;
public class Even{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
String a[]=s.split(" ");
int n=Integer.parseInt(a[0]);
int k=Integer.parseInt(a[1]);
int f[]=new int[n];
if(n%2==0){
                   f[0]=1;
for(int r=1;r<n/2;r++){
                                       f[r]=f[r-1]+2;
									   }
									   f[n/2]=2;
for(int u=n/2+1;u<n;u++){
                                        f[u]=f[u-1]+2;
										}
										}
else {
         f[0]=1;
 for(int e=1;e<(n-1)/2;e++){
                                               f[e]=f[e-1]+2;
                                              }	
											  f[(n-1)/2]=n;
											  f[(n+1)/2]=2;
for(int e=(n+3)/2;e<n;e++){
                                          f[e]=f[e-1]+2;
}
}
System.out.println(f[k-1]);
}
}										  