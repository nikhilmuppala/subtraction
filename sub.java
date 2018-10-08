import java.util.Scanner;
class Substract
{
public static void main(String args[])
{
int a, b, c;
System.out.println("Enter two integers: ");
Scanner s = new Scanner(System.in);
a = s.nextInt(); 
b = s.nextInt();
c = a - b;
System.out.println("substraction = "+c);
}
}
