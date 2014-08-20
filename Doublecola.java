import java.util.Scanner;
public class Doublecola{
public static void main(String ae[]){
Scanner sb=new Scanner(System.in);
String s= sb.nextLine();
int n=Integer.parseInt(s);
int a=5,i=0,sum=0;
    while(sum<=n) {
	                   sum=sum+a;
					    i++;
						a=2*a;
					    }
						sum=sum-a/2;
						a=a/2;
	int d=n-sum,h=1,t=a/5;
	while((t)<=d) {t=t+a/5;h++;}
				  if(h==1) {
				               System.out.print("Sheldon");
							    }
	               if(h==2) {
				               System.out.print("Leonard");
							    }
				    if(h==3) {
				               System.out.print("Penny");
							    }
				 if(h==4) {
				               System.out.print("Rajesh");
							    }
				  if(h==5) {
				               System.out.print("Howard");
							    }
								}
								}