import java.util.Scanner;
class Pattern34
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
int column=sc.nextInt();
for(int i=1;i<=row;i++)
{
for(int j=1;j<=column;j++)
{
if(i==1||j==1&&i!=2&&i!=3||j==(column+1)/2||i==row&&j<=(column+1)/2)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
}
}