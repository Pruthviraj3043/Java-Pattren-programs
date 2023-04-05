import java.util.Scanner;
class Pattern65
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
int column=sc.nextInt();
for(int i=1;i<=row;i++)
{
char ch='a';
for(int j=1;j<=column;j++)
{
if(i%2!=0)
{
System.out.print(j);
}
else
{
System.out.print(ch++);
}
}
System.out.println();
}
}
}