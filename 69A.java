import java.util.Scanner;
public class Young{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p= sb.nextLine();
	  int n=Integer.parseInt(p);
	  int d=0,e=0,f=0,i=0;
	  for(i=0;i<n;i++) {
	  String t=sb.nextLine();
	  String r[]=t.split(" ");
	  int a=Integer.parseInt(r[0]);
	  int b=Integer.parseInt(r[1]);
	  int c=Integer.parseInt(r[2]);
	  d=d+a;
	  e=e+b;
	  f=f+c;
	  }
	  if((d==0)&&(e==0)&&(f==0)) {
	        System.out.print("YES");
			}
			else {
			System.out.print("NO");
			}
			}
			}