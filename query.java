import java.util.Scanner;
public class Query
{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
String e[]=s.split(" ");
int n=Integer.parseInt(e[0]);
int m=Integer.parseInt(e[1]);
String w=sb.nextLine();
String w1[]=w.split(" ");
int a[]=new int[n];
for(int i=0;i<n;i++){
                                   a[i]=Integer.parseInt(w1[i]);
								   }
String p[]=new String[m];
for(int i=0;i<m;i++){
								    p[i]=sb.nextLine();
								   }
String c[][]=new String[m][];	
for(int i=0;i<m;i++){
                                    c[i][2]=(p[i]).split(" ");
}
int o[][]=new int[m][2];
for(int i=0;i<m;i++){
                                    o[i][0]=Integer.parseInt(c[i][0]);
									 o[i][1]=Integer.parseInt(c[i][1]);
									 }
for(int i=0;i<m;i++){int sum=0;
                                   for(int x= o[i][0]-1;x<=o[i][1]-1;x++){
								   sum=sum+a[x];
								   }
								   if(sum==0)
								   System.out.println("1");
								   else
								   System.out.println("0");
								   }
								   }
								   }
								   