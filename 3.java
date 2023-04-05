import java.util.Scanner;
class Pattern3
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
if(i==1&&j==2||i==5&&j==2)
{
System.out.print("@"+"");
}
else if(i==2&&j==3||i==5&&j==4)
{
System.out.print("#"+"");
}
else if(i==3&&j==4)
{
System.out.print("?"+"");
}
else 
{
System.out.print("*");
}
}
System.out.println( );
}
}
}
