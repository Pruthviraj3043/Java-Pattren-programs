import java.util.Scanner;
class Pattern38
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
if(j==1&&i!=1&&i!=row||i==1&&j!=1&&j!=column||j==column&&i!=1&&i!=row||i==row&&j!=1&&j!=column||i==j&&j>=(row+1)/2)
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