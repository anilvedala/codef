import java.util.Scanner;
public class Present{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s1=sb.nextLine();
int n=Integer.parseInt(s1);
for(int i=0;i<=n;i++){
          for(int j=2*n-2*i-1;j>=0;j--){
		       System.out.print(" ");
			   }
		  for(int k=0;k<=i;k++){
		       System.out.print(k+" ");
			   }
		  for(int k=i-1;k>=0;k--){
		       if(k==0){System.out.print(k);}
			   else{
		        System.out.print(k+" ");}
			   }
		System.out.print("\n");
		
		}
		for(int i=n-1;i>=0;i--){
          for(int j=2*n-2*i-1;j>=0;j--){
		       System.out.print(" ");
			   }
		  for(int k=0;k<=i;k++){
		       System.out.print(k+" ");
			   }
		  for(int k=i-1;k>=0;k--){
		  if(k==0){System.out.print(k);}
			   else{
		        System.out.print(k+" ");}
			   }
		if(i!=0){
		System.out.print("\n");
		}
		}
		}}