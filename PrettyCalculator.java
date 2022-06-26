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
    String choice;
    ArrayList<String> options = new ArrayList<>(Arrays.asList("Add", "Subtract", "Divide", "Multiply"));
  
    System.out.println("Option Menu");

    for (String option : options) {
      System.out.println(option);
    }

    do {
      System.out.print("Enter your choice: ");

      choice = toTitleCase(scanner.nextLine());
      
      if (choice == null || choice.isBlank() || !options.contains(choice)) {
        System.out.println("Invalid input, please try again");
      }
    } while (choice == null || choice.isBlank() || !options.contains(choice));

    return choice;
  }

  // This method capitalizes the first letter of a single word
  public static String toTitleCase(String original) {
    String titleCased;

    if (original.length() >= 2) {
      titleCased = original.substring(0, 1).toUpperCase() + original.substring(1);
    } else {
      titleCased = original;
    }

    return titleCased;
  }
}