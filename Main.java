import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
  }


  public static void remove3rdLetter(String input) {
    int index = 0;
    while (index < input.length()) {
      String letter = input.substring(index, index+1);
      if (index + 1 % 3 != 0) {
         System.out.print(letter);
      }
    }
    System.out.print("/n");
  }
}
