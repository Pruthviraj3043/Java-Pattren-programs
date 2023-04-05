import java.util.Scanner;
class Pattern82
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
int space=row-1;
int star=1;
for(int i=1;i<=row;i++)
{
int num=0;
char ch='a';
for(int j=1;j<=space;j++)
{
System.out.print(" "+" ");
}
for(int k=1;k<=star;k++)
{
if(i%2==0)
{
if(k<=(star+1)/2)
{
System.out.print(++ch+" ");
}
else
{
System.out.print(--ch+" ");
}
}
else
{
if(k<=(star+1)/2)
{
System.out.print(++num+" ");
}
else
{
System.out.print(--num+" ");
}
}
}
System.out.println( );
space--;
star+=2;
}
}

}