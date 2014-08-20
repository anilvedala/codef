import java.util.Scanner;
public class Tram{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p= sb.nextLine();
	  int n=Integer.parseInt(p);
	  String s[]=new String[4];
	  int c=0,w=0;
	  for(int i=0;i<n;i++) {
	           s[i]=sb.nextLine();
			   String d=s[i];
			   String  t[]=d.split(" ");
			   int a=Integer.parseInt(t[0]);
			   int b=Integer.parseInt(t[1]);
			   int z=c-a+b;
			   if(z>w) {
			                 w=z;
							  }
							  c=z;
			   }
			   System.out.print(w);
			   }
			   }