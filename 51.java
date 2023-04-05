class Pattern51
{
public static void main(String[] args)
{
int row=5;
int column=row+1;
for(int i=0;i<=row;i++)
{
for(int j=0;j<=column;j++)
{
if(i+j==8||i-j==2||i==0&&j%3!=0||i==1&&j%3==0)
{
System.out.print("*"+" ");
}
else{
System.out.print(" "+" ");
}
}
System.out.println();
}
}
}