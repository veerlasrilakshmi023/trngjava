import java.util.Scanner;
class program13
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name:");
String sn=sc.next();
System.out.println("/nGood Evening "+sn);
System.out.println("/nEnter two numbers:");
int num1= sc.nextInt();
int num2= sc.nextInt();
System.out.println(num1+"*"+num2+"="+num1*num2);
}
}