import java.util.Scanner;
class  Day2Program04
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int num=scob.nextInt();//15

int i;
i=num;
while(i>=0)
{
   System.out.print(i+",");
i=i-3;
}
}
}