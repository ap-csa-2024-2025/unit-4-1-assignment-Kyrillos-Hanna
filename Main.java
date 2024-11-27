import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int x = 0;
    int sum = 0;

    System.out.println("Enter any numbers greater than 0. Enter -1 to stop");
    while (x != -1) {
      x = sc.nextInt();
      sum +=x;
    }
    System.out.println("The sum is " + (sum + 1));

    int max = Integer.MIN_VALUE;
    System.out.println("How many numbers do you want to input?");
    int counter = sc.nextInt();
    int input;

    System.out.println("Enter the numbers: "); 
      int i = 0;
      while (i < counter) {
        input = sc.nextInt();
        if (input > max) {
          max = input;
        }
        i++;
      }
    
    System.out.println("The biggest number is " + max);

    System.out.println("Input a word: ");
    sc.nextLine();
    String input2 = sc.nextLine();

    int index = 0;
    while (index < input2.length()) {
      String letter = input2.substring(index, index+1);
      if ((index + 1) % 3 != 0) {
         System.out.print(letter);
      }
      index++;
    }
  }
}
