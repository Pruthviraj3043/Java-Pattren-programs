import java.util.Scanner;
class Pattern58
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
int column=sc.nextInt();
for(char i='E';i>='A';i--)
{
for(char j='A';j<='E';j++)
{
System.out.print(i);
}
System.out.println( );
}
}
}