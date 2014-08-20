import java.util.Scanner;
public class Domino
{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
int n=Integer.parseInt(s);
int a[][]=new int[n][2];
int c=0,s1=0,s2=0;
for(int i=0;i<n;i++) {
    String h=sb.nextLine();
	String j[]=h.split(" ");
	a[i][0]=Integer.parseInt(j[0]);
    a[i][1]=Integer.parseInt(j[1]);
   s1=s1+a[i][0];
   s2=s2+a[i][1];
   }
   if((s1%2==0)&&(s2%2==0)) {
               System.out.print(0);
			   }
   else if(((s1%2==1)&&(s2%2==0))||((s1%2==0)&&(s2%2==1))) {
	          System.out.print(-1);
			   }
	else {int i1=0;
	        for(i1=0;i1<n;i1++) {
			  if((a[i1][0]%2==1)&&(a[i1][1]%2==1)) {
			         
			   }
			   else if((a[i1][0]%2)+(a[i1][1]%2)==1) {
			         System.out.print(1);
					 break;
			   }
			   }if(i1==n){System.out.print(-1);}
			   }
			   }
			   }
  
				