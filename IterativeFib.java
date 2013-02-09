import java.util.Scanner;

//i am adding this test line of code

public class IterativeFib
{
  private static int calcs = 0;
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter nth number in Fib sequence to calculate: ");
    int n1;
    int n2 = 0;
    n1 = scan.nextInt();
    n2 = FibCalc(n1);
    System.out.println("The nth valus is " + n2);
    System.out.println("Number of adds is: " + calcs);
  }

  public static int FibCalc(int n)
  {
    if(n == 0 || n == 1)
    {
      return n;
    }
    int prev2 = 0;
    int prev = 1;
    int val=0;
    for(int i=1; i<n; i++)
    {
      calcs++;
      val = prev + prev2;
      prev2 = prev;
      prev = val;
    }
    return val;
  }
}
