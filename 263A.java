import java.util.Scanner;
public class Beautiful{
public static void main(String ae[]){
      int a[][]=new int[5][5];
	  Scanner sb=new Scanner(System.in);
     int i=0,j=0,i1=0,j1=0;
	  for(i=0;i<5;i++) {
	      String p= sb.nextLine();
		  String q[]=p.split(" ");
		  for(j=0;j<5;j++) {
		         a[i][j]=Integer.parseInt(q[j]);
				 if(a[i][j]==1) {
				          i1=i;
						  j1=j;
						  }}}
						   int k=0;
    if(i1>=2) {
         if(j1>=2) {
            k=i1+j1-4;
            System.out.print(k);
         }
         else {
            k=i1-j1;
            System.out.print(k);
         }
    }
    else   {
        if(j1>=2) {
            k=j1-i1;
            System.out.print(k);
        }
        else {
            k=4-i1-j1;
            System.out.print(k);
        }
    }
						  
						  
						  
						  
				 }
				 }