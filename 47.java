import java.util.Scanner;
class Pattern47
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
if(i==j||i+j==row+1)
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