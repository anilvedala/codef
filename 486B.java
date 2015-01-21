import java.util.Scanner;
public class 486B{
public static void main(String ar[]){
             Scanner sb=new Scanner(System.in);
			 String s=sb.nextLine();
			 String s1[]=s.split(" ");
			 int m=Integer.parseInt(s1[0]);
			 int n=Integer.parseInt(s1[1]);
			 int a[][]=new int[m][n];
			 int b[][]=new int[m][n];
			 Arrays.fill(b,1);
			 for(int i=0;i<m;i++){
				    String w=sb.nextLine();
					String w1[]=w.split(" ");
					for(int j=0;j<n;j++){
					   a[i][j]=Integer.parseInt(w1[j]);
					   if(a[i][j]==0){
					   Arrays.fill(a[i],0);
					   Arrays.fill(a[j],0);
					   }
			        }
				
			}
			}}
					