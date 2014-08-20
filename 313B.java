import java.util.Scanner;
public class IliyaQuery
{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
String s1=sb.nextLine();
int m=Integer.parseInt(s1);
int a[][]=new int[m][2];
int c=0;
for(int i=0;i<m;i++) {
   String p=sb.nextLine();
   String p1[]=p.split(" ");
   a[m][0]=Integer.parseInt(p1[0]);
   a[m][1]=Integer.parseInt(p1[1]);
    }
	/*for(int h=0;h<m;h++) {
   for(int j=a[h][0]-1;j<a[h][1]-1;j++) {
           if(s.charAt(j)==s.charAt(j+1)) {c++;}
		   }
		   System.out.println(c);
		   c=0;
				}*/
				}
				}
				