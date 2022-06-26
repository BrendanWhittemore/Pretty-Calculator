import java.util.*;

/**
 * Pretty Calculator
 *
 * This is the parent class for all user interactions
 *
 * @author Brendan Whittemore
 *
 * @version June 24, 2022
 *
 */

 public class PrettyCalculator {

  // This is the main method that begins the program and contains the high-level logic
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to Pretty Calculator!\n");
    
    System.out.println(getOption(scanner));
  }

  // This method returns the chosen calculator operation
  public static String getOption(Scanner scanner) {
    String option;
  
    System.out.println("Option Menu");
    System.out.println("Add");
    System.out.println("Subtract");
    System.out.println("Divide");
    System.out.println("Multiply");
    System.out.print("Enter your choice: ");

    do {
      option = scanner.nextLine();
      
      if (option == null || option.isBlank()) {
        System.out.println("Invalid input, please try again");
      }
    } while (option == null || option.isBlank());

    return option;
  }
}