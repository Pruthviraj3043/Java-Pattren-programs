import java.util.Scanner;
class Own
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
int column=sc.nextInt();
char ch='a';
for(int i=1;i<=row;i++)
{

char ch1=ch;
for(int j=1;j<=column;j++)
{
int p=i;
if(i%2==0)
{
System.out.print(ch1++);
}
else
{
System.out.print(p);
p++;
}
}
ch++;
System.out.println();
}
}
}