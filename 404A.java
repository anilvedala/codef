import java.util.Scanner;
public class X
{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
int n=Integer.parseInt(s);
String p[]=new String[n];
int fl=0,i;
char c=' ';
char d=' ';
for(i=0;i<n;i++) {
   p[i]=sb.nextLine();
   c=p[0].charAt(0);
   d=p[0].charAt(1);
   char e=' ';
   for(int j=0;j<n;j++) {
             e=p[i].charAt(j);
             if((i==j)||(i+j==n-1)) {
			                                if(e==c) {} else {fl=1;}
											} 
		    else {
			                                if(e==d){} else{fl=1;}
											} 
					}
					}
	if((fl==0)&&(c!=d)) {System.out.print("YES");}
	else {System.out.print("NO");}
	}
	}
					