package edu.cnm.deepdive;

/**
 * Computes recursion for @String input for the provided parameters.
 * The {@return boolean} will return true or false.
 */
public class Palindromes {

  /**
   * Computes recursion for @String input for the provided parameters.
   * The {@return boolean} will return true or false.
   */
  public static boolean checkRecursive(String input) {
    return input.length() <= 1
    ||  input.charAt(0) == input.charAt(input.length() -1)
        && checkRecursive(input.substring(1, input.length()-1));
  }

  /**
   * Computes reursion for @String input for the provided parameters.
   * The {@return boolean} will return true or false.
   */
    public static boolean checkDenormalized(String input) {
           return checkRecursive(input.replaceAll("\\W|_", "").toLowerCase());
    }

  /**
   * Computes iteration for @String input for the provided parameters.
   * The {@return boolean} will return true or false.
   */
  public static boolean checkIterative(String input) {
    return input.length() <= 1
        ||  input.charAt(0) == input.charAt(input.length() -1)
        && checkIterative(input.substring(1, input.length()-1));
  }

}
