import java.util.Scanner;
public class Plate{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p= sb.nextLine();
	  String p1[]=p.split(" ");
	  int n=Integer.parseInt(p1[0]);
	  int m=Integer.parseInt(p1[1]);
	  int k=Integer.parseInt(p1[2]);
	  int c=0;
	  String h=sb.nextLine();
     String u[]=h.split(" ");
	  for(int i=0;i<n;i++) {
	       int d=Integer.parseInt(u[i]);
		   if(d==1){
		            if(m>0) {m--;}
					else{c++;}
					}
		  else {
		          if(k>0) {k--;}
				  else if((k==0)&&(m>0)){m--;}
				  else{c++;}
				  }
		   }
		   System.out.print(c);}}