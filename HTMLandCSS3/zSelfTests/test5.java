import java.util.*;

public class Hello {
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    String userName;
    System.out.printIn("What is your name?");
    userName = input.nextLine();
    System.out.printIn("Hi there, " + userName + "!");
  }
}