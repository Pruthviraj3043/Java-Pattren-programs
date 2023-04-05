import java.util.Scanner;
class Pattern71
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
int column=sc.nextInt();
int a=1;
char ch='a';
for(int i=1;i<=row;i++)
{
for(int j=1;j<=column;j++)
{
if(j%2==0)
{
System.out.print(ch++);
}
else
{
System.out.print(a);
a+=2;
if(a>9)
{
a=1;
}
}
}
System.out.println();
}
}
}