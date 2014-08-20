import java.util.Scanner;
public class Good{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p=sb.nextLine();
	   String p1[]=p.split(" ");
	     int count=0;int y=0;
	     int n=Integer.parseInt(p1[0]);
		 int k=Integer.parseInt(p1[1]);
		 for(int i=0;i<n;i++) {
		   String p2=sb.nextLine();
		   String p3[]=p2.split( "(?!^)");
		   int e=0;
		   for(int k1=0;k1<p3.length;k1++) { y=Integer.parseInt(p3[k1]);
		          if(y>k) {e=k1;break;}e++;
				  }
				  if(e==p3.length) {count++;}
				  }
				  System.out.print(count);
				  }
				  }