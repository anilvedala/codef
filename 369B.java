import java.util.Scanner;
public class Valera{
             public static void main(String sr[]){
                          Scanner sb=new Scanner(System.in);
                          String s=sb.nextLine();
                          String kr[]=s.split(" ");
			               int n=Integer.parseInt(kr[0]);
				           int k=Integer.parseInt(kr[1]);
		    			   int l=Integer.parseInt(kr[2]);
		    			   int r=Integer.parseInt(kr[3]);
						   int sa=Integer.parseInt(kr[4]);
						   int sk=Integer.parseInt(kr[5]);
								int a[]=new int[n];
								int b=sk/k;
								int c=sk%k;
								int i=0;
										for(i=0;i<k;i++) {
											  if(i<c) {
											        a[i]=b+1;
													}
											   else {
											       a[i]=b;
                                                    }
                                               }
                                       if((n-k)!=0) {
           								b=(sa-sk)/(n-k);
                                        c=(sa-sk)%(n-k);											 
										for(i=0;i<n-k;i++) {
											       if(i<c) {
											        a[i+k]=b+1;
													}
											       else {
											       a[i+k]=b;
                                                    }
                                                   }
												   }
									   for(i=0;i<n;i++) {
											      System.out.print(a[i]+" ");
												  }
												  }
												  }
												  
                                            										
	
