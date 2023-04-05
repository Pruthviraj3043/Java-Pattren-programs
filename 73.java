import java.util.Scanner;
class Pattern73
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
int column=sc.nextInt();
char ch='a';
int a=1;
for(int i=1;i<=row;i++)
{
for(int j=1;j<=column;j++)
{
if(i==1||j==1||j==column||i==row)
{
System.out.print(ch++);
}
else
{
System.out.print(a++);
}
}
System.out.println();

}
}
}