import java.util.Scanner;
class Pattern77
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
int column=sc.nextInt();
int a=0;
for(int i=1;i<=row;i++)
{
a=a+i;
int b=a;
for(int j=1;j<=column;j++)
{
if(i>=j)
{
System.out.print(b--);

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