import java.util.Scanner;
public class Marks
{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
String s1[]=s.split(" ");
int n=Integer.parseInt(s1[0]);
int m=Integer.parseInt(s1[1]);
int c=0;
String t[]=new String[n];
for(int i=0;i<n;i++) {
      t[i]=sb.nextLine();
	   }
	   int p[]=new int[n];
	   int max=1;
	   for(int j=0;j<m;j++) {
                 for(int i=0;i<n;i++) {
                     String r=""+t[i].charAt(j);
                     int a=Integer.parseInt(r);
	                 if(a>max) {max=a;}
	                 }
                for(int i=0;i<n;i++) {
       				String r=""+t[i].charAt(j);
                   if(max==Integer.parseInt(r)) {p[i]=1;}
                   }	 max=1;
	             }
	   for(int k=0;k<n;k++) {
	    if(p[k]==1) {c++;}
		if(c>=n) {break;}
		}
		System.out.print(c);
		}
		}
		