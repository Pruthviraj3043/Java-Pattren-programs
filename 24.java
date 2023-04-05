import java.util.Scanner;
class Pattern24
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
if(j==1||i==1&&j!=column||i==(row+1)/2&&j!=column||i==row&&j!=column||j==column&&i!=1&&i!=(row+1)
/2&&i!=row)
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
