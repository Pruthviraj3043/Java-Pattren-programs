import java.util.Scanner;
class Pattern66
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
int column=sc.nextInt();
char ch='a';

for(int i=1;i<=row;i++)
{
for(int j=1;j<=column;j++)
{
if(j%2!=0)
{
System.out.print(j);
}
else
{
System.out.print(ch);
}
}
ch++;
System.out.println();
}
}
}