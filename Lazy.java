import java.util.Scanner;
public class Lazy{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
String k1[]=s.split(" ");
int n=Integer.parseInt(k1[0]);
int m=Integer.parseInt(k1[1]);
int k=Integer.parseInt(k1[2]);
String d=sb.nextLine();
int a[]=new int[n];
String k2[]=d.split(" ");
int count1=0;
int count2=0;
for(int i=0;i<n;i++){
                                  a[i]=Integer.parseInt(k2[i]);
								 }
								 for(int t=0;t<n;t++){
								                                if(a[t]==1){
																                  if(count1<m){
																                                          m=m-1;
																                                          }
																                  else
																                  count1=count1+1;
																                 }
																if(a[t]==2){
                                                                                   if(count2<k){
                                                                                                      k=k-1;
																									  break;
                                                                                                          }
																				if(count2==0&k==0)
																										  {
																										  if(m>0){
																										  m=m-1;
																										  }
																										  else if(k>0)
																										  k=k-1;
																										  else
																										  count2=count2+1;
																										  
																										  }
																					 else
                                                                                     count2=count2+1;
                                                                                   }
																				   }
																				   System.out.println(count1+count2);
																				   

}
}																				   

																															                                         

