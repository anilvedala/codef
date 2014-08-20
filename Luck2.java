import java.util.Scanner;
public class Luck2{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      
	  String h1=sb.nextLine();
	  String h2[]=h1.split(" ");
	  int n=Integer.parseInt(h2[0]);
	  int k=Integer.parseInt(h2[1]);
	  int count=0;
	  String o=sb.nextLine();
	  String y[]=o.split(" ");
	  int a[]=new int[n];
	  int c[]=new int[n];
	  for(int i=0;i<n;i++) {
	            a[i]=Integer.parseInt(y[i]);
				while(a[i]>0) {
				                   int q=(a[i]%10);
								   if(q==7|q==4)
				                   {c[i]=c[i]+1;}
								   a[i]=a[i]/10;
				 }
				 if(c[i]<=k){count++;}
				 }
				 System.out.print(count);
				 }
				 }
				 