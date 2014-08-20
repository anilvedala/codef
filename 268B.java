import java.util.Scanner;
public class Button{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p= sb.nextLine();
	  int n=Integer.parseInt(p);
	  int ret=n;
	  for(int i=1;i<=n;i++) {
	       ret=ret+i*(n-i);}
	  System.out.print(ret);
	  }
	  }