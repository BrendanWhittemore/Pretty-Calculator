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

  /*
   * This is the main method that begins the program and contains the high-level
   * logic
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to Pretty Calculator!\n");

    switch (getOption(scanner)) {
      case "Add" -> add(scanner);
      case "Subtract" -> subtract(scanner);
      case "Multiply" -> multiply(scanner);
      case "Divide" -> divide(scanner);
    }
  }

  // This method returns the chosen calculator operation
  private static String getOption(Scanner scanner) {
    String choice;
    ArrayList<String> options = new ArrayList<>(Arrays.asList("Add", "Subtract", "Divide", "Multiply"));

    System.out.println("Option Menu:");

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
  private static String toTitleCase(String original) {
    String titleCased;

    if (original.length() >= 2) {
      titleCased = original.substring(0, 1).toUpperCase() + original.substring(1);
    } else {
      titleCased = original;
    }

    return titleCased;
  }

  // Recieve numerical input from user
  private static int[] getNums(Scanner scanner) {
    int[] nums = new int[2];

    System.out.print("First number: ");
    nums[0] = scanner.nextInt();
    System.out.print("Second number: ");
    nums[1] = scanner.nextInt();

    return nums;
  }

  // Add the numbers
  private static void add(Scanner scanner) {
    int[] nums;
    int result;

    nums = getNums(scanner);
    result = nums[0] + nums[1];

    System.out.printf("Result: %d\n", result);
  }

  // Subtract the numbers
  private static void subtract(Scanner scanner) {
    int[] nums;
    int result;

    nums = getNums(scanner);
    result = nums[0] - nums[1];

    System.out.printf("Result: %d\n", result);
  }

  // Multiply the numbers
  private static void multiply(Scanner scanner) {
    int[] nums;
    int result;

    nums = getNums(scanner);
    result = nums[0] * nums[1];

    System.out.printf("Result: %d\n", result);
  }

  // Divide the numbers
  private static void divide(Scanner scanner) {
    int[] nums;
    int result;

    nums = getNums(scanner);
    result = nums[0] / nums[1];

    System.out.printf("Result: %d\n", result);
  }
}