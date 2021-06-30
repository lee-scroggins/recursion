package edu.cnm.deepdive;

/**
 *
 */
public class Palindromes {

  /**
   * @param input
   * @return
   */
  public static boolean checkRecursive(String input) {
    return input.length() <= 1
    ||  input.charAt(0) == input.charAt(input.length() -1)
        && checkRecursive(input.substring(1, input.length()-1));
  }

  /**
   * @param input
   * @return
   */
    public static boolean checkDenormalized(String input) {
           return checkRecursive(input.replaceAll("\\W|_", "").toLowerCase());
    }

  /**
   * @param input
   * @return
   */
  public static boolean checkIterative(String input) {
    return input.length() <= 1
        ||  input.charAt(0) == input.charAt(input.length() -1)
        && checkIterative(input.substring(1, input.length()-1));
  }

}
