package edu.cnm.deepdive;

import java.math.BigInteger;

/**
 * Computes the factorial function of value (n!) for the provided parameters.
 * The {@return BigInteger} will return values greater than 20!
 */
public class FactorialsBigInteger {

  /**
   * Computes the factorial of {@param input} using recursion.
   * The return type is {@return BigInteger} and values aboe 20! will be correct.
   */
  public static BigInteger computeRecursive(int input) {
    if (input < 0) {
      throw new IllegalArgumentException();
    }
    return (input == 0) ? BigInteger.ONE : BigInteger.valueOf(input).multiply(computeRecursive(input - 1));
  }

  /**
   * Computes the factorial of {@param input} using iteration.
   * The return type is {@return BigInteger} and values abue 20! will be correct.
   */
  public static BigInteger computeIterative(int input) {
    if (input < 0) {
      throw new IllegalArgumentException();
    }
    return (input == 0) ? BigInteger.ONE : BigInteger.valueOf(input).multiply(computeIterative(input - 1));
  }

}
