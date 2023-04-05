import java.util.Scanner;
class Pattern46
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
if(j==1||j==column||i==j&&j>=(row+1)/2||i+j==row+1&&j<=(row+1)/2)
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