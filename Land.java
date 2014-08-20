import java.util.Scanner;
public class Land{
public static void main(String ae[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
int s1=Integer.parseInt(s);
String d[]=new String[s1];
for(int t=0;t<s1;t++)
{
d[t]=sb.nextLine();

}
int x=0;
for(int i=0;i<s1;i++){
if(d[i].equals("X++"))
{x=x+1;}
if(d[i].equals("X--"))
{x=x-1;}
if(d[i].equals("--X"))
{x=x-1;}
if(d[i].equals("++X"))
{x=x+1;}
}
System.out.println(x);
}
}