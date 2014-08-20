import java.util.Scanner;
public class Stone
{
public static void main(String ar[]){
Scanner sb=new Scanner(System.in);
String s=sb.nextLine();
int n=Integer.parseInt(s);
String d=sb.nextLine();
String f[]=d.split( "(?!^)");
int count=0;
for(int i=0;i<f.length-1;i++){
if(f[i].equals(f[i+1]))
count=count+1;
else
continue;
}System.out.print(count);
}
}
