import java.util.Scanner;
class Tri
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
int star=(2*row)-1;
int space=0;
for(int i=1;i<=row;i++)
{
for(int j=1;j<=space;j++)
{
System.out.print(" "+" ");
}
for(int k=1;k<=star;k++)
{
System.out.println("*"+" ");
}
System.out.println();
space++;
star-=2;
}
}
}