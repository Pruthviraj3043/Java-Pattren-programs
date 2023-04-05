import java.util.Scanner;
class Pattern83
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
for(int i=1;i<=row;i++)
{
for(int j=1;j<=space;j++)
{
System.out.print(" "+" ");
}
for(int k=1;k<=star;k++)
{
if(k%2==0)
{
System.out.print("0"+" ");
}
else
{
System.out.print("1"+" ");
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