import java.util.Scanner;
public class A122{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
int n=Integer.parseInt(s1);
while(1>0){
    if(n%4==0){System.out.print("YES");break;}
	else if(n%7==0){System.out.print("YES");break;}
	else if(n%44==0){System.out.print("YES");break;}
	else if(n%47==0){System.out.print("YES");break;}
	else if(n%74==0){System.out.print("YES");break;}
	else if(n%77==0){System.out.print("YES");break;}
	else if(n%444==0){System.out.print("YES");break;}
	else if(n%447==0){System.out.print("YES");break;}
	else if(n%474==0){System.out.print("YES");break;}
	else if(n%477==0){System.out.print("YES");break;}
	else if(n%744==0){System.out.print("YES");break;}
	else if(n%747==0){System.out.print("YES");break;}
	else if(n%774==0){System.out.print("YES");break;}
	else if(n%777==0){System.out.print("YES");break;}
	else{System.out.print("NO");break;}
	}}}
