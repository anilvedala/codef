import java.util.Scanner;
public class Candy{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p= sb.nextLine();
	  int n=Integer.parseInt(p);
	  int c=1;
	  int a[][]=new int[n][n];
	  for(int j=0;j<n;j++) {
	     if(j==0) {
		             for(int i=0;i<n;i++) {
					            a[i][j]=c;
								c++;
								}
					 }
		else if(j==1) {
		            for(int i=n-1;i>=0;i--) {
					            a[i][j]=c;
								c++;
								}
					}
		else if(j%2==0) {
		             for(int i=n-1;i>=0;i--) {
					            a[i][j]=c;
								c++;
								}
					}
	    else {
		         for(int i=0;i<n;i++) {
					            a[i][j]=c;
								c++;
								}
					 }
					 }
for(int i1=0;i1<n;i1++) {
         for(int j1=0;j1<n;j1++) {
		          System.out.print(a[i1][j1]+" ");
				  }
				  System.out.print("\n");
				  }
				  }
				  }
				  