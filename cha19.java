import java.util.Scanner;
class PrimeNumberDemo
{
   public static void main(String args[])
   {
      int n;
      int status = 1;
      int num = 3;
   
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the value of n:");
       n = scanner.nextInt();
      if (n >= 1)
      {
         System.out.println("First "+n+" prime numbers are:");
         //2 is a known prime number
         System.out.println(2);
      }}}
