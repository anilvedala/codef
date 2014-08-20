import java.util.Scanner;
public class Chess{
public static void main(String ae[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
String a[4]=s.split(" ");
int r1=Integer.parseInt(a[0]);
int c1=Integer.parseInt(a[1]);
int r2=Integer.parseInt(a[2]);
int c2=Integer.parseInt(a[3]);
int f[]=new int[3];
int c=r1-r2;
if(c<0)   { 
                c=-c;
               }
if(c==0&((c1-c2)!=0))
              {   
			  f[0]=1;
			  }
else if((c>0)&((c1-c2)==0))
              {			
               f[0]=1;
               }
else	{
        f[0]=2;
        }
int t=c1-c2;
if(t<0)
        {
		t= -t;		
		}
if(c==t)
        {
		f[1]=1;
		f[2]=c;
		}
		
