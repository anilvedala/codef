import java.util.Scanner;
public class Chess2{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String t=sb.nextLine();
	  int n=Integer.parseInt(t);
	  int i,j;
	  if((n%2)==1)
	   {System.out.println(n*(n-1)/2+(n+1)/2);}   
	  else{System.out.println((n*n)/2);}
	  String s=new String();
	  String p=new String();
	         for(j=1;j<=n;j++){
								  if(j%2==1){s=s+"C";}
								  else{s=s+".";}
								}
		     for(j=1;j<=n;j++){
							     if(j%2==1){p=p+".";}
								 else{p=p+"C";}
								 }
			for(j=1;j<=n;j++){
									if(j%2==1){if(j==n){System.out.print(s);}
													else{System.out.println(s);}
													}
									else {if(j==n){System.out.print(p);}
	                                              else{ System.out.println(p);}
											         }
											    }}}