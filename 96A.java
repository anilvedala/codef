import java.util.Scanner;
public class Petyaf{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p= sb.nextLine();
	  int i=0,c=0;
	  int y=0;
	  for(i=0;i<p.length()-1;i++) { int count=1;
	           while(p.charAt(i)==p.charAt(i+1)) {
			           count++;
					   i++;
					   if(i>=p.length()-1) {y=count;break;}
					   }
					   if(count>=7) {
					                System.out.print("YES");y=count;
									break;
									 }y=count;
									 }
					if((i>=p.length()-1)&&(y<7)){				 
					System.out.print("NO");
					}
					}}
					  