import java.util.Scanner;
public class Shass{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p=sb.nextLine();
	 String p2=sb.nextLine(); 
	  int n=Integer.parseInt(p);
	  int a[]=new int[n];
	  String p1[]=p2.split(" ");
	  for(int i=0;i<n;i++) {
	       a[i]=Integer.parseInt(p1[i]);
		   }
	 String p3=sb.nextLine(); 
	  int m=Integer.parseInt(p3);
	  int b[][]=new int[m][2];
	  for(int j=0;j<m;j++) {
	       String t=sb.nextLine();
		   String o[]=t.split(" ");
		   b[j][0]=Integer.parseInt(o[0]);
		   b[j][1]=Integer.parseInt(o[1]);
		   if(b[j][0]==1) {if(n==1){a[0]=0;}
		     else{        
			a[1]=a[1]+a[0]-b[j][1];a[0]=0;}
		   }
		   else if(b[j][0]==n) {
		     a[n-2]=a[n-2]+b[j][1]-1;
			 a[n-1]=0;
			 }
			 else {
			 a[b[j][0]-2]= a[b[j][0]-2]+ b[j][1]-1;
			 a[b[j][0]]= a[b[j][0]]+a[b[j][0]-1]-b[j][1];
			 a[b[j][0]-1]=0;
			 }
			 }
		for(int k=0;k<n;k++) {
		System.out.println(a[k]);
		}
		}
		}