import java.util.Scanner;
class Pattern18
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
//if(i==j||i==row||j==1||i==3&&j==2||i==4&&j==2||i==4&&j==3)
if(i>=j)
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
