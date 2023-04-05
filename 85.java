import java.util.Scanner;
class Pattern85
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
if(row%2==0)
{
row++;
}
int space=row-1;
int star=1;

char ch='a';
for(int i=1;i<=row;i++)
{
int a=1;
for(int j=1;j<=space;j++)
{
System.out.print(" "+" ");
}
for(int k=1;k<=star;k++)
{
if(i<=(row+1)/2)
{
System.out.print(k +" ");
}
else
{
System.out.print(ch++ +" ");
}
}
System.out.println( );
if(i<(row+1)/2)
{
space--;
star+=2;
}
else
{
space++;
star-=2;
}
}
}
}