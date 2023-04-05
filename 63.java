import java.util.Scanner;
class Pattern63
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
int col=sc.nextInt();
in ch=1;
for(char i='A';i<=row;i++)
{
for(char j='E';j>='A';j++)
{
if(i>=j)
{
System.out.print(i);
}
ch++;
else{
System.out.print(" ");
}
}
System.out.println( );
}
}
}