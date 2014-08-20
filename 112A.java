import java.util.Scanner;
public class Petya{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p1= sb.nextLine();
	  String p2=sb.nextLine();
	  String p3=p1.toLowerCase();
	  String p4=p2.toLowerCase();
	  if((p3.compareTo(p4)<0)) {
	  System.out.print("-1");
	  }
	  else if((p3.compareTo(p4)>0)) {
	  System.out.print("1");
	  }
	  else  {
	    System.out.print("0");
	  }
	  }
	  }