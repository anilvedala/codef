import java.util.Scanner;
public class Dieroll2{
             public static void main(String sr[]){
                          Scanner sb=new Scanner(System.in);
                          String s=sb.nextLine();
						  int n=Integer.parseInt(s);
						  int a[]=new int[n];
						  int y=0,e=1;
						  for(int i=0;i<n;i++){
						   String h=sb.nextLine();
						   y=Integer.parseInt(h);
						   for(int k=0;k<n/2;k++){
						        e=2*e+1;
								}
								if(y%2==1){
								e=2*e;}
								a[i]=e;
								}
							for(int l=0;l<n;l++) {
							     System.out.print(a[l]);
								 }
								 }
								 }