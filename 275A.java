import java.util.Scanner;
public class Lightsout{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
	  int a[][]=new int[3][3];
	  int b[][]=new int[3][3];
	  int i=0,j=0;
	  	for(i=0;i<3;i++) {
                 for(j=0;j<3;j++) {
				    b[i][j]=1;
					}
					}
      for(i=0;i<3;i++) {
	        String p=sb.nextLine();
	        String q[]=p.split(" ");
	        for( j=0;j<3;j++) {
	              a[i][j]=Integer.parseInt(q[j]);
				  if((a[i][j])%2==1) {
				                   a[i][j]=1;
								   }
			      else                       {
				                   a[i][j]=0;
								   }
	              }}
		for(i=0;i<3;i++) {
                 for(j=0;j<3;j++) {
                          if(a[i][j]==1) {b[i][j]=0;
						         if(i!=2) {
						               if(b[i+1][j]==1) {b[i+1][j]=0;}
									   else                     {b[i+1][j]=1;}
									         }
								 if(i!=0) {	   
								       if(b[i-1][j]==0){b[i-1][j]=1;}
                                       else                  {b[i-1][j]=0;}	
                                             }									   
								 if(j!=0){
								        if(b[i][j-1]==0){b[i][j-1]=1;}
										else                  {b[i][j-1]=0;}
										    }
								if(j!=2){
								         if(b[i][j+1]==0){b[i][j+1]=1;}
										else                  {b[i][j+1]=0;}
										    }
											}
											}
											}
		for(i=0;i<3;i++) {String h="";
                 for(j=0;j<3;j++) {
				      h=h+b[i][j];
					  }
					  if(i!=2){
					  System.out.println(h);}
					  else {System.out.print(h);}
         }
				 
			 }
	         }