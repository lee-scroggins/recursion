package edu.cnm.deepdive;

import java.math.BigInteger;

public class FactorialsBigInteger {

  /**
   * Computes the perfect
   * @param input
   * @return
   */
  public static BigInteger computeRecursive(int input) {
    if (input < 0) {
      throw new IllegalArgumentException();
    }
    return (input == 0) ? BigInteger.ONE : BigInteger.valueOf(input).multiply(computeRecursive(input - 1));
  }

  /**
   * Computes the perfect
   * @param input
   * @return
   */
  public static BigInteger computeIterative(int input) {
    if (input < 0) {
      throw new IllegalArgumentException();
    }
    return (input == 0) ? BigInteger.ONE : BigInteger.valueOf(input).multiply(computeIterative(input - 1));
  }

}
