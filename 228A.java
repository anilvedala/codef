import java.util.Scanner;
public class Horse{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p= sb.nextLine();
	  String t[]=p.split(" ");
	  int a[]=new int[4];
	  int i;
	  int c=0;
	  for(i=0;i<4;i++) {
	   int b=Integer.parseInt(t[i]);
	   for(int j=0;j<i;j++) {
	        if(a[j]==b) {c++;break;}
	   }
	  a[i]=b;}
	   
	   System.out.print(c);
	   }}
	   