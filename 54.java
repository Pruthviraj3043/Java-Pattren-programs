import java.util.Scanner;
class Pattern54
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
int column=sc.nextInt();
for(int i=row;i>=1;i--)
{
for(int j=column;j>=1;j--)
{
System.out.print(i);
}
System.out.println( );
}
}
}