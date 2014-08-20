import java.util.Scanner;
public class Game{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
int n=Integer.parseInt(s1);
String s2="";
int a[][]=new int[n][2];
int c=0;
for(int i=0;i<n;i++){
   s2=sb.nextLine();
   String s3[]=s2.split(" ");
   a[i][0]=Integer.parseInt(s3[0]);
   a[i][1]=Integer.parseInt(s3[1]);
   }
   for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
	      if(i!=j){
		          if(a[i][0]==a[j][1]){
				       c++;
					   }
				}
				}
				}
				System.out.print(c);
				}
				}