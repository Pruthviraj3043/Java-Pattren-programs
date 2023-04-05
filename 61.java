import java.util.Scanner;
class Pattern61
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
int col=sc.nextInt();
char ch='A';
for(int i=1;i<=row;i++)
{
for(int j=1;j<=col;j++)
{
System.out.print(ch++);
}
System.out.println( );
}
}
}