import java.util.*;
public class B486{
public static void main(String ar[]){
             Scanner sb=new Scanner(System.in);
			 String s=sb.nextLine();
			 String s1[]=s.split(" ");
			 int m=Integer.parseInt(s1[0]);
			 int n=Integer.parseInt(s1[1]);
			 int a[][]=new int[m][n];
			 int b[][]=new int[m][n];
			 for (int[] row: b)
                      Arrays.fill(row, 1);
			 for(int i=0;i<m;i++){
				    String w=sb.nextLine();
					String w1[]=w.split(" ");
					for(int j=0;j<n;j++){
					   a[i][j]=Integer.parseInt(w1[j]);
					   if(a[i][j]==0){
					   Arrays.fill(b[i],0);
					   for(int h=0;h<m;h++){b[h][j]=0;}
				   }
			       }
				}
			int flag=0;
			for(int i=0;i<m;i++){
			 for(int j=0;j<n;j++){
			    if(b[i][j]==1){
				    if(a[i][j]!=1){flag=1;break;}
			        }
				else{
				   if(a[i][j]==1){
				   for(int p=0;p<n;p++){if(b[i][p]==1){flag=2;break;}}
				   for(int p=0;p<m;p++){if(b[p][j]==1){flag=2;break;}}
				   if(flag==2) flag=0;
				   else flag=1;
				   }
				  else{
				   for(int p=0;p<n;p++){if(b[i][p]==1){flag=1;break;}}
				   for(int p=0;p<m;p++){if(b[p][j]==1){flag=1;break;}}
				   if(flag==1) break;
				   }
				}
                }
				if(flag==1) break;
			}
            if(flag==1) System.out.println("NO");
            else{
                	System.out.println("YES");
					for(int i=0;i<m;i++){
			          for(int j=0;j<n;j++){
			             System.out.print(b[i][j]+" ");
						 }System.out.println("");}
				}
					
					
			
			}}
					