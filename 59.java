import java.util.Scanner;
class Pattern59
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
int column=sc.nextInt();
for(char i='E';i>='A';i--)
{
for(char j='E';j>='A';j--)
{
System.out.print(j);
}
System.out.println( );
}
}
}